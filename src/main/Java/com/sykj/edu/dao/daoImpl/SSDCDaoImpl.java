package com.sykj.edu.dao.daoImpl;

import com.sykj.edu.dao.SSDCDao;
import com.sykj.edu.util.ConnUtil;
import com.sykj.edu.util.DateUtil;
import com.sykj.edu.vo.BasicDataTypeVo;
import com.sykj.edu.vo.SSDCVo;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/22 9:41
  @package_Name: com.sykj.edu.dao.daoImpl
  @Class_Name: SSDCDaoImpl
  To change this template use File | Settings | File Templates.
*/
@Repository
public      class SSDCDaoImpl implements SSDCDao {
    private QueryRunner qr=new QueryRunner();

    //查询form表单查询条件
    @Override
    public List FindAllBasicData() {
        List list=new ArrayList();
        Connection conn= ConnUtil.getConn();
        String sql="select did,dname from department";
        String sql2=" select b1.id lettersource ,b1.dataValue dataValue from basicdata b1 inner join basicdatatype b2 on b1.baseDataTypeId=b2.id where b1.baseDataTypeId=2";
        try {
            List<BasicDataTypeVo> list1=qr.query(conn,sql,new BeanListHandler<>(BasicDataTypeVo.class));
            List<BasicDataTypeVo> list2=qr.query(conn,sql2,new BeanListHandler<>(BasicDataTypeVo.class));
            list.add(list1);
            list.add(list2);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try{
                if(conn!=null){
                    DbUtils.close(conn);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public List FindLetter(Integer letterRegisteridf, Integer letterSource, String letterTitlef, Integer Warning, Integer did, String truename,Integer page,Integer limit) {
        Connection conn=ConnUtil.getConn();
        String sql=" select a.idf, a.state state ,"+
        "case   when a.yellowWarning>='1' then  '<img src=imgs/xtb_hhp.jpg />'  else '<font color=#3DD3E1>正常</font>'  end yellowWarning , "+
        "case  when a.redWarning>='1' then '<img src=imgs/xtb_hp.jpg />' else '<font color=#3DD3E1>正常</font>' end redWarning ,"+
        "l.letterTitlef ,"+
        "d.dname ,"+
        "s.truename , "+
        "a.userid userid, "+
         "a.endtime "+
        "from letterBaseInfo l inner join approveinfo a inner join Sys_user s inner join department d	on l.idf=a.let_idf and s.uidf=a.userId and s.depid= d.did where l.letterRegisteridf ='"+letterRegisteridf+"' and a.state='待办理'";
        if(letterSource!=null && !"".equals(letterSource)){
            sql+=" and l.letterSource='"+letterSource+"' ";
        }
        if(letterTitlef!=null && !letterTitlef.equals("")){
            sql+=" and l.letterTitlef like '%"+letterTitlef+"%' ";
        }
        if(Warning!=null && !"".equals(Warning)){
            if(Warning==1){
                sql+=" and a.redWarning='1' ";
            }else if(Warning==2){
                sql+=" and a.yellowWarning='1' ";
            }
        }
        if(did!=null && !"".equals(did)){
            sql+=" and d.did='"+did+"' ";
        }
        if(truename!=null && !truename.equals("")){
            sql+=" and s.truename='"+truename+"' ";
        }

        sql="select * from ("+sql+")a order by a.endtime asc ";
//        查询总条数
        String sql2="select count(*) as count from ("+sql+")b";
//        分页
        sql="select * from ("+sql+")b limit "+((page*limit)-limit)+","+limit+" " ;
        try {
            List<SSDCVo> query = qr.query(conn, sql, new BeanListHandler<>(SSDCVo.class));
            SSDCVo query1 = qr.query(conn, sql2, new BeanHandler<>(SSDCVo.class));
            List list=new ArrayList<Object>();
            list.add(query);
            list.add(query1.getCount());
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try{
                if(conn!=null){
                    DbUtils.close(conn);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public int insert(int supervisorf, int beensupervisorf, String supervisortitlef, String supervisormsgf) {
        Connection conn=ConnUtil.getConn();
        String sql="insert into archivesupervisor(Supervisorf,beenSupervisorf,SupervisorTitlef,SupervisorMsgf,SupervisorTimef,Supervisorstatusf) values(?,?,?,?,?,1) ";
        String nowDate = DateUtil.getDate();
        try {
            int update = qr.update(conn, sql, supervisorf, beensupervisorf, supervisortitlef, supervisormsgf, nowDate);
            return update;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try{
                if(conn!=null){
                    DbUtils.close(conn);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return 0;
    }
}
