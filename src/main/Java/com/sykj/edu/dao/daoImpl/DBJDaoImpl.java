package com.sykj.edu.dao.daoImpl;

import com.sykj.edu.dao.DBJDao;
import com.sykj.edu.util.ConnUtil;
import com.sykj.edu.util.SqlUtil;
import com.sykj.edu.vo.ApproveLetterBaseInfo;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @User: guohaotian
 * @Date: 2022/2/25 14:51
 * @package_Name: com.sykj.edu.dao.daoImpl
 * @Class_Name: DBJDaoImpl
 * To change this template use File | Settings | File Templates.
 */


@Repository
public class DBJDaoImpl implements DBJDao {
    private QueryRunner qr = new QueryRunner();

    /**
     * 待办件
     * */
    @Override
    public List FindAll(Integer userId, String letterTitlef, String letterNamef, String registerTimef,Integer page,Integer limit) {
        Connection conn= ConnUtil.getConn();
        String sql="select a.idf,b.dataValue,c.letterNamef,c.letterMobilef,l.letterTitlef,s.truename,l.registerTimef,l.letterPropertiesf  from  " +
                "approveinfo a inner join " +
                "letterbaseinfo l inner join " +
                "(select a.id,a.dataValue from basicdata a where a.baseDataTypeId=2)b inner join  " +
                "lettersinfo c inner join  " +
                "sys_user s " +
                "on a.let_idf=l.idf " +
                "and b.id=l.letterSource " +
                "and l.letterIDf=c.idf " +
                "and l.letterRegisterIdf=s.uidf " +
                "and l.letterpropertiesf not in('非正常上访','敏感时期个访','敏感时期上访','敏感时期集访') "+
                "and a.state='待办理' "+
                "and a.userid='"+userId+"' ";
        if(letterTitlef!=null && !letterTitlef.equals("")){
            sql+=" and l.letterTitlef like '%"+letterTitlef+"%' ";
        }
        if(letterNamef!=null && !letterNamef.equals("")){
            sql+=" and c.letterNamef='"+letterNamef+"' ";
        }
        if(registerTimef!=null && !registerTimef.equals("")){
            sql+=" and l.registerTimef= '"+registerTimef+"' ";
        }
        Object count = SqlUtil.getCount(ApproveLetterBaseInfo.class, sql);
        sql=SqlUtil.limitSql(sql,page,limit);
        try {
            List<ApproveLetterBaseInfo> query = qr.query(conn, sql, new BeanListHandler<>(ApproveLetterBaseInfo.class));
            List list=new ArrayList();
            list.add(query);
            list.add(count);
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

/**
 * 信访人基本信息，信访件基本信息
 * */
    @Override
    public Object FindApp(Integer idf){
        Connection conn=ConnUtil.getConn();
        String sql="select b.letterNamef,b.letterCardNof,b.letterMobilef, " +
                "b.workDept,b.letterPostNof,b.letterAddressf,b.letterAdsPostNof," +
                "b.letterHomeAddrf,b.letterOriRegAdsf,  " +
                "s.truename letterRegisterName, " +
                "l.letterTitlef, " +
                "l.letterSource, " +
                "l.isPublic, " +
                "l.natureType, " +
                "l.letterCount, " +
                "l.visitedDept, " +
                "l.visitScope, " +
                "l.visiterCount, " +
                "l.dutyArea, " +
                "l.happenAddressf, " +
                "l.thirdQuestionType, " +
                "l.standQuestion, " +
                "l.visitExeceptionCasef, " +
                "l.overVisitf, " +
                "l.questionAffiliations, " +
                "l.approveLeader, " +
                "l.toPassDept, " +
                "l.documentNof, " +
                "l.toPassTimef, " +
                "l.letterStylef, " +
                "l.letterReceiverf, " +
                "l.letterReceiveTimef, " +
                "l.letterItemf, " +
                "l.thirdAccept, " +
                "l.letterPropertiesf, "+
                "l.letterRegisterIdf "+
                "from " +
                "letterbaseinfo l inner join " +
                "approveinfo a inner join " +
                "lettersinfo b inner join  " +
                "sys_user s  on " +
                "l.idf=a.let_idf and " +
                "l.letterIDf=b.idf and  " +
                "l.letterRegisterIdf=s.uidf " +
                "where a.idf= ? ";
        System.out.println(sql);
        try {
            ApproveLetterBaseInfo query = qr.query(conn, sql, new BeanHandler<>(ApproveLetterBaseInfo.class),idf);
            return query;
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

    /**
     * 信访来源 性质分类 曾访部门 责任地区 突出问题 来访异常情况 越级上访  来信形式
     * */
    @Override
    public Object FindBasic(String baseValue) {
        Connection conn=ConnUtil.getConn();
        String sql="select b.id,b.dataValue from basicdatatype a inner join basicdata b on a.id=b.baseDataTypeId where a.baseValue=? ; ";
        try {
            List<ApproveLetterBaseInfo> query = qr.query(conn, sql, new BeanListHandler<>(ApproveLetterBaseInfo.class), baseValue);
            return query;
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

    /**
     * 批示领导 受信人
     * */
    @Override
    public Object FindSysUser() {
        Connection conn=ConnUtil.getConn();
        String sql="select uidf,truename from sys_user";
        try {
            List<ApproveLetterBaseInfo> query = qr.query(conn, sql, new BeanListHandler<>(ApproveLetterBaseInfo.class));
            return query;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 文件上传新增附件表
     * */
    @Override
    public int InsertAcc(Integer idf, String aname, Integer asize,String atype, String path,Integer userid) {
        Connection conn = ConnUtil.getConn();
        String sql="select let_idf idf from approveinfo where idf='"+idf+"'";
        try {
            //根据信访流程编号查询信访件号
            ApproveLetterBaseInfo query = qr.query(conn, sql, new BeanHandler<>(ApproveLetterBaseInfo.class));
            int let_idf= query.getIdf();

            //增加数据
            String inSql="insert into accessories values(null,?,?,?,?,?,?,?,null)";
            Date date=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = sdf.format(date);
            int update = qr.update(conn, inSql, let_idf, aname, asize, atype, userid, format, path);
            return update;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Object FindAccessories(Integer idf,Integer page,Integer limit) {
        Connection conn = ConnUtil.getConn();
        String sql="select a.aid ,s.truename,a.aname,a.asize,a.atype,a.atime from " +
                "accessories a inner join " +
                "sys_user s on " +
                "a.userId=s.uidf where  " +
                "a.letterBaseId in  " +
                "(select let_idf from approveinfo where idf='"+idf+"' ) ";
        //查询总数
        Object count = SqlUtil.getCount(ApproveLetterBaseInfo.class, sql);

        sql=SqlUtil.limitSql(sql,page,limit);
        //分页
        try {
            //根据信访流程编号查询信访件号
            List<ApproveLetterBaseInfo> query = qr.query(conn, sql, new BeanListHandler<>(ApproveLetterBaseInfo.class));
            List list=new ArrayList();
            list.add(count);
            list.add(query);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 办理流程
     * */
    @Override
    public Object FindLC(Integer idf,Integer page,Integer limit) {
        Connection conn=ConnUtil.getConn();
        String sql="select a.idf,s.truename,a.fillTimef ,a.endtime " +
                "from approveinfo a  " +
                "inner join sys_user s  " +
                "on s.uidf=a.userid " +
                "where a.let_idf " +
                "in (select let_idf from approveinfo where idf='"+idf+"') ";
        Object count = SqlUtil.getCount(ApproveLetterBaseInfo.class, sql);
                sql= SqlUtil.limitSql(sql,page,limit);
        try {
            List<ApproveLetterBaseInfo> query = qr.query(conn, sql, new BeanListHandler<>(ApproveLetterBaseInfo.class));
            List list=new ArrayList();
            list.add(count);
            list.add(query);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *查询所有部门编号和部门名称
     */
    @Override
    public Object FindAllDepartment() {
        String sql="select did,dname from department ";
        Connection conn=ConnUtil.getConn();
        try {
            List<ApproveLetterBaseInfo> query = qr.query(conn, sql, new BeanListHandler<>(ApproveLetterBaseInfo.class));
            return query;
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

    /**
     * 根据部门id查询人员
     * */
    @Override
    public Object FindSysUser(Integer did) {
        String sql="select s.uidf,s.truename from " +
                "sys_user s " +
                "inner join  " +
                "department d  " +
                "on s.depid=d.did  " +
                "where s.depid= '"+did+"' " ;
        Connection conn=ConnUtil.getConn();
        try {
            List<ApproveLetterBaseInfo> query = qr.query(conn, sql, new BeanListHandler<>(ApproveLetterBaseInfo.class));
            return query;
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

    /**
     * 发送，并修改办理状态
     *  let_Idf,//审批流程编号
     *  suggestionContentf//审批意见
     *  isAgreef//是否同意
     *  letterPropertiesf//建议属性类别
     *  isend//是否办结
     *  personnel//办理人编号
     * */
    @Override
    public Object UpdateApproveInfo(Integer idf,String suggestionContentf,Integer isAgreef,String letterPropertiesf,Integer isend,Integer personnel) {
        System.out.println(isend+"IsSend");
        Connection conn=ConnUtil.getConn();
        if(isend==null){
            Date date=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = sdf.format(date);
            //当不办结时
            //新增数据
            String sql="insert into approveinfo values(null," +
                    "(select * from (select let_idf from approveinfo where idf= '"+idf+"' )a)" +
                    ",'"+suggestionContentf+"','"+personnel+"',null,0,'"+letterPropertiesf+"'," +
                    "(select * from (select (count(*)+1) sortid from approveinfo where let_idf=(select let_idf from approveinfo where idf='"+idf+"'))a)," +
                    " '待办理',(select * from (select endtime from approveinfo where idf='"+idf+"')a),0,0)";
            //修改原有数据
            String sql2="update approveinfo set fillTimef='"+format+"',isAgreef='"+isAgreef+"',state='已办理' where idf='"+idf+"' ";
            try {
                qr.update(conn,sql);
                qr.update(conn,sql2);
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
        }else{
            Date date=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = sdf.format(date);
            //当办结时
            //新增数据
            if(idf!=null && !idf.equals("")&&suggestionContentf!=null&&!suggestionContentf.equals("")&&isAgreef!=null && !isAgreef.equals("") && letterPropertiesf!=null && !letterPropertiesf.equals("")&&isend!=null && !isend.equals("")&&personnel!=null && !personnel.equals("")){
                //新增数据
                String sql="insert into approveinfo values(null," +
                        "(select * from (select let_idf from approveinfo where idf= '"+idf+"' )a)" +
                        ",'"+suggestionContentf+"','"+personnel+"',null,0,'"+letterPropertiesf+"'," +
                        "(select * from (select (count(*)+1) sortid from approveinfo where let_idf=(select let_idf from approveinfo where idf='"+idf+"'))a)," +
                        " '待办理',(select * from (select endtime from approveinfo where idf='"+idf+"')a),0,0)";
                try {
                    qr.update(conn,sql);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            //修改原有数据

            String sql2="update approveinfo set fillTimef='"+format+"',isAgreef='"+isAgreef+"',state='已办理' where idf='"+idf+"' ";
            String sql3="update letterbaseinfo set state='"+isend+"' where idf=(select let_idf from approveinfo where idf='"+idf+"') ";
            try {
                qr.update(conn,sql2);
                qr.update(conn,sql3);
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
        }
        return null;
    }

    /**
     * 根据信访流程id查询信访登记人id
     * */
    @Override
    public Object FindLetterRegisterIdf(Integer idf) {
        Connection conn=ConnUtil.getConn();
        String  sql="select l.letterRegisterIdf from letterbaseinfo l  " +
                "inner join approveinfo a  " +
                "on a.let_idf=l.idf " +
                "where a.idf='"+idf+"' ";
        try {
            ApproveLetterBaseInfo query = qr.query(conn, sql, new BeanHandler<>(ApproveLetterBaseInfo.class));
            return query;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
