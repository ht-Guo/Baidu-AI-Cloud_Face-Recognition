package com.sykj.edu.dao.daoImpl;

import com.sykj.edu.dao.DBGLDao;
import com.sykj.edu.util.ConnUtil;
import com.sykj.edu.vo.ArchiveSupervisorVo;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//page第几页
//limit分几条

@Repository
public class DBGLControllerImpl implements DBGLDao {
    QueryRunner qr = new QueryRunner();
    @Override
    public List<Object> findAll(String SupervisorTitlef, String dbr, String bdbr, String beginTime, String finishTime, String Supervisorstatusf,int page,int limit,int userId) {
        Connection conn = ConnUtil.getConn();
        String sql="select * from (select  a.idf,s2.truename as 'dbr',s3.truename  as 'bdbr',a.SupervisorTitlef ,a.SupervisorMsgf,a.SupervisorTimef,case a.Supervisorstatusf when 1 then '未读' " +
                "when 2 then '已读' " +
                "when 3 then '已回复' " +
                "else '' end 'status',a.Supervisorstatusf,a.SupervisorReplyIDf  from archivesupervisor a,sys_user s2,sys_user s3 where a.Supervisorf=s2.UIDF and a.beenSupervisorf=s3.UIDF and (s2.uidf ='"+userId+"' or s3.uidf ='"+userId+"'))dc  where 1=1 ";
//        信访标题
        sql+=(SupervisorTitlef!=null  && !SupervisorTitlef.equals("") )? " and dc.SupervisorTitlef like '%"+SupervisorTitlef+"%' ":" ";
//        督办人
        sql+=(dbr!=null && !dbr.equals(""))? " and dc.dbr ='"+dbr+"' ":" ";
//        被督办人
        sql+=(bdbr!=null && !bdbr.equals(""))? " and dc.bdbr='"+bdbr+"' ":" ";
//         督办日期
        sql+=(beginTime!=null && finishTime !=null && !beginTime.equals("") && !finishTime.equals(""))?" and dc.SupervisorTimef between '"+beginTime+"' and '"+finishTime+"' ":" ";
//          状态
        sql+=(Supervisorstatusf !=null && !Supervisorstatusf.equals("")) ?" and dc.Supervisorstatusf = '"+Supervisorstatusf+"' ":" ";
//        条数
        String sql2="select count(*) as 'count' from ("+sql+")a  ";
//        分页查询
        sql+=" limit "+((limit*page)-limit)+","+limit+" ";
        try {
            List<ArchiveSupervisorVo> data = qr.query(conn, sql, new BeanListHandler<ArchiveSupervisorVo>(ArchiveSupervisorVo.class));
            ArchiveSupervisorVo d=qr.query(conn,sql2,new BeanHandler<ArchiveSupervisorVo>(ArchiveSupervisorVo.class));
            List<Object> list=new ArrayList<>();
            list.add(data);
            list.add(d.getCount());
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(conn!=null){
                    DbUtils.close(conn);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public ArchiveSupervisorVo findAll(String idf) {
        Connection conn=ConnUtil.getConn();
        ArchiveSupervisorVo asv=null;
        String sql="select * from (select  a.idf,s2.truename as 'dbr',s3.truename  as 'bdbr',a.SupervisorTitlef ,a.SupervisorMsgf,a.SupervisorTimef,case a.Supervisorstatusf when 1 then '未读' " +
                "when 2 then '已读' " +
                "when 3 then '已回复' " +
                "else '' end 'status',a.Supervisorstatusf,a.SupervisorReplyIDf  from archivesupervisor a,sys_user s2,sys_user s3 where a.Supervisorf=s2.UIDF and a.beenSupervisorf=s3.UIDF)dc where idf=? ";
        try {
            asv=qr.query(conn,sql,new BeanHandler<>(ArchiveSupervisorVo.class),idf);
            return asv;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return asv;
    }

//    修改状态,增加内容
    @Override
    public int updateStatus(int status,String idf,String SupervisorReplyIDf) {
        Connection conn=ConnUtil.getConn();
        String sql="update archivesupervisor set Supervisorstatusf = ?,SupervisorReplyIDf=? where  idf= ? ";
        try {
            int update = qr.update(conn, sql, status, SupervisorReplyIDf,idf);
            return update;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }


}
