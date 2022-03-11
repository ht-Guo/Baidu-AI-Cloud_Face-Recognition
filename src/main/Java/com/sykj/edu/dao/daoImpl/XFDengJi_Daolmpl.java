package com.sykj.edu.dao.daoImpl;

import com.sykj.edu.dao.XFDengJi_Dao;
import com.sykj.edu.util.ConnUtil;
import com.sykj.edu.vo.XFDJVo;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


@Repository
public class XFDengJi_Daolmpl implements XFDengJi_Dao {

    QueryRunner qr = new QueryRunner();
    /**
     * 下拉列表中的值
     * **/
    @Override
    public Object findBase(String baseValue) throws  Exception {
        String sql="select b1.id,b1.dataValue \n" +
                "from basicdata b1\n" +
                "inner join basicdatatype b2\n" +
                "on b1.baseDataTypeId=b2.id\n" +
                "where b2.baseValue=? ";
        Connection conn= ConnUtil.getConn();
        Object obj=qr.query(conn,sql,new BeanListHandler<XFDJVo>(XFDJVo.class),baseValue);
        if(conn!=null){
            DbUtils.close(conn);
        }
        return obj;
    }


    /**
     * 新增信访人信息方法
     * */
    @Override
    public int addXFRXX(XFDJVo fe) {
        String sql="insert into lettersinfo values(null,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn=ConnUtil.getConn();
        /**
         信访人编号 idf
         信访人姓名 letterNamef
        证件类型编号 cardTypef
        信访人证件号 letterCardNof
        联系电话  letterMobilef
        工作单位  workDept
        单位邮编  letterPostNof
        联系地址  letterAddressf
        联系地址邮编  letterAdsPostNof
        常住地址  letterHomeAddrf
        户籍地址  letterOriRegAdsf
        重点维稳对象  isVIPf 0不是 1是
         * */
        try {
            int result=qr.update(conn,sql,fe.getLetterNamef(),fe.getCardTypef(),fe.getLetterCardNof(),fe.getLetterMobilef(),
                    fe.getWorkDept(),fe.getLetterPostNof(),fe.getLetterAddressf(),fe.getLetterAdsPostNof(),fe.getLetterHomeAddrf()
            ,fe.getLetterOriRegAdsf(),fe.getIsVIPf());
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
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

    /**
     * 查询所有组织部门
     * */
    @Override
    public Object FindAllDepartment() {
        String sql="SELECT did,dname FROM \n" +
                "department ";
        Connection conn=ConnUtil.getConn();
        List<XFDJVo> query = null;
        try {
            query = qr.query(conn, sql, new BeanListHandler<>(XFDJVo.class));
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }finally{
            try{
                if(conn!=null){
                    DbUtils.close(conn);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return query;
    }
/**
 * 领导
 * */
    @Override
    public Object FindSys_user() {
        Connection conn=ConnUtil.getConn();
        String sql=" SELECT uidf,truename FROM Sys_user ";
        try {
            List<XFDJVo> query = qr.query(conn, sql, new BeanListHandler<>(XFDJVo.class));
            return query;
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public int InsertVIPManage(XFDJVo xfxx) {
        Connection conn=ConnUtil.getConn();
        String sql= "INSERT INTO vipmanage " +
                "VALUES(NULL,(SELECT idf FROM lettersInfo ORDER BY idf DESC LIMIT 0,1 ),?,(SELECT NOW()),?,?,?) ";
        try {
            int update = qr.update(conn, sql, xfxx.getUserIdf(), xfxx.getRecordTypef(), xfxx.getTitlef(), xfxx.getContentf());
            return update;
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    @Override
    public int InsertLetterbaseInfo(XFDJVo xfxx) {
        Connection conn=ConnUtil.getConn();
        String sql="INSERT INTO letterbaseinfo " +
                "VALUES(NULL, " +
                "(SELECT NOW()), " +
                "?,?,?, " +
                "(SELECT idf FROM lettersInfo ORDER BY idf DESC LIMIT 0,1 ), " +
                "?,?,?," +
                "?,?,?," +
                "?,?,?," +
                "?,?,?," +
                "?,?,?," +
                "?,?,?," +
                "?,?,null," +
                "?,?,null," +
                "'0'," +
                "?,?," +
                "'0',null," +
                "?," +
                "'0','0'," +
                "?,?" +
                ") ";
        try {
            int update;
            if(xfxx.getPassLimitDatef().equals("")||xfxx.getPassLimitDatef()==null){
                update = qr.update(conn, sql, xfxx.getLetterRegisterIdf(), xfxx.getLetterSource(), xfxx.getIsPublic(),
                        xfxx.getNatureType(), xfxx.getLetterCount(), xfxx.getVisitedDept(),
                        xfxx.getVisitScope(), xfxx.getVisiterCount(), xfxx.getDutyArea(),
                        xfxx.getHappenAddressf(), xfxx.getThirdQuestionType(), xfxx.getStandQuestion(),
                        xfxx.getVisitExeceptionCasef(), xfxx.getOverVisitf(), xfxx.getQuestionAffiliations(),
                        xfxx.getApproveLeader(), xfxx.getToPassDept(), xfxx.getDocumentNof(),
                        xfxx.getToPassTimef(), xfxx.getLetterStylef(), xfxx.getLetterReceiverf(),
                        xfxx.getLetterReceiveTimef(),null,
                        xfxx.getLetterItemf(), xfxx.getIsRegist(),
                        null, xfxx.getLetterNumf(),
                        xfxx.getLetterPropertiesf(),
                        xfxx.getLetterTitlef(), xfxx.getState()
                );
            }else{
            update = qr.update(conn, sql, xfxx.getLetterRegisterIdf(), xfxx.getLetterSource(), xfxx.getIsPublic(),
                    xfxx.getNatureType(), xfxx.getLetterCount(), xfxx.getVisitedDept(),
                    xfxx.getVisitScope(), xfxx.getVisiterCount(), xfxx.getDutyArea(),
                    xfxx.getHappenAddressf(), xfxx.getThirdQuestionType(), xfxx.getStandQuestion(),
                    xfxx.getVisitExeceptionCasef(), xfxx.getOverVisitf(), xfxx.getQuestionAffiliations(),
                    xfxx.getApproveLeader(), xfxx.getToPassDept(), xfxx.getDocumentNof(),
                    xfxx.getToPassTimef(), xfxx.getLetterStylef(), xfxx.getLetterReceiverf(),
                    xfxx.getLetterReceiveTimef(), xfxx.getPassLimitDatef(),
                    xfxx.getLetterItemf(), xfxx.getIsRegist(),
                    xfxx.getPassLimitDatef(), xfxx.getLetterNumf(),
                    xfxx.getLetterPropertiesf(),
                    xfxx.getLetterTitlef(), xfxx.getState()
            );
            }
            return update;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
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

    /**
     * 增加信访审批流程
     *
     信访件编号 let_idf
     意见内容 suggestionContentf
     办理人编号  userId
     填写时间 fillTimef
     是否同意  isAgreef 0不同意 1同意
     建议属性类别 letterPropertiesf
     排列序号 sortid 0
     办理状态 state 待办理
     办理期限 endtime
     黄牌 yellowWarning 0
     红牌 redWarning 0
     * */
    @Override
    public int InsertApproveInfo(XFDJVo xfj) {
        String sql="INSERT INTO approveinfo " +
                "VALUES(NULL, " +
                "(SELECT idf FROM letterbaseinfo ORDER BY idf DESC LIMIT 0,1), " +
                "'尽快处理', " +
                "(SELECT uidf FROM job j INNER JOIN sys_user s ON j.jobid=s.jobid WHERE j.jobname='科长' LIMIT 0,1), " +
                "NULL, " +
                "0, " +
                "(SELECT letterPropertiesf FROM letterbaseinfo ORDER BY idf DESC LIMIT 0,1), " +
                "0, " +
                "'待办理', " +
                "(SELECT limitDatef FROM letterbaseinfo ORDER BY idf DESC LIMIT 0,1), " +
                "0,0 " +
                ")";
        Connection conn = ConnUtil.getConn();
        try {
            int update = qr.update(conn, sql);
            return update;
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }
}
