package com.sykj.edu.dao.daoImpl;

import com.sykj.edu.dao.DBJDao;
import com.sykj.edu.util.ConnUtil;
import com.sykj.edu.vo.ApproveLetterBaseInfo;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
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
        String sql2="select count(*) count from ("+sql+")a ";
        sql="select * from ("+sql+")a limit "+((page*limit)-limit)+","+limit+"   ";
        try {
            List<ApproveLetterBaseInfo> query = qr.query(conn, sql, new BeanListHandler<>(ApproveLetterBaseInfo.class));
            ApproveLetterBaseInfo query1 = qr.query(conn, sql2, new BeanHandler<>(ApproveLetterBaseInfo.class));
            List list=new ArrayList();
            list.add(query);
            System.out.println(query1.getCount());
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
        String sql="select let_idf from approveinfo where a.idf='"+idf+"'";
        try {
            //根据信访流程编号查询信访件号
            ApproveLetterBaseInfo query = qr.query(conn, sql, new BeanHandler<>(ApproveLetterBaseInfo.class));
            int let_idf= query.getIdf();

            //增加数据
            String inSql="inser into accessories values(null,?,?,?,?,?,?,?,null)";
            Date date=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = sdf.format(date);
            int update = qr.update(conn, sql, let_idf, aname, asize, atype, userid, format, path);
            return update;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }






}
