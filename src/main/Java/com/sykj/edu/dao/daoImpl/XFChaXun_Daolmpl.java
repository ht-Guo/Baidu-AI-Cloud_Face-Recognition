package com.sykj.edu.dao.daoImpl;

import com.sykj.edu.dao.XFChaXunDao;
import com.sykj.edu.util.ConnUtil;
import com.sykj.edu.vo.XFChaXun;
import com.sykj.edu.vo.XFDJVo;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;


@Repository
public class XFChaXun_Daolmpl extends BaseDaoImp implements XFChaXunDao  {
    private QueryRunner qr=new QueryRunner();

    @Override
    public Object findAll(XFChaXun xFCX) {
        String sql="SELECT l.idf,ll.letterNamef,ll.letterMobilef,b.dataValue,l.letterTitlef,l.registerTimef " +
                " FROM  " +
                "letterbaseinfo l " +
                "INNER JOIN  " +
                "lettersInfo ll  " +
                "INNER JOIN Sys_user s " +
                "INNER JOIN basicdata b  " +
                "ON l.letterIDf=ll.idf " +
                "AND s.uidf=l.letterRegisterIdf " +
                "AND b.id=l.letterSource " +
                "WHERE b.baseDataTypeId='2'  " +
                "AND l.letterRegisterIdf='"+xFCX.getLetterRegisterIdf()+"'  " +
                "AND l.isRegist='0'  ";
//                "ORDER BY l.letterTitlef DESC ";
        sql+=(xFCX.getIdf()!=null && !"".equals(xFCX.getIdf()) )? " AND l.idf='"+xFCX.getIdf()+"' ":" ";
        sql+=(xFCX.getLetterNamef()!=null && !xFCX.getLetterNamef().equals(""))? " AND ll.letterNamef like '%"+xFCX.getLetterNamef()+"%' ":" ";
        sql+=(xFCX.getLetterTitlef()!=null && !xFCX.getLetterTitlef().equals(""))?" AND l.letterTitlef like '%"+xFCX.getLetterTitlef()+"%' ":" ";
        sql+="ORDER BY l.letterTitlef DESC ";
        return this.queryListForPage(xFCX,sql,XFChaXun.class);
    }

    @Override
    public int UpdateLetterBaseInfo(XFDJVo vo) {
        String sql="UPDATE letterbaseinfo SET  " +
                "limitDatef=? " +
                ",  " +
                "passLimitDatef=? " +
                ",  " +
                "isRegist='1' "+
                ", "+
                "state='1' " +
                "WHERE idf=? ";
        Connection conn=ConnUtil.getConn();
        try {
            int update = qr.update(conn, sql,vo.getLimitDatef() ,vo.getLimitDatef(), vo.getIdf());
            return update;
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
        return 0;
    }

    @Override
    public int InsertApproveInfo(XFDJVo vo) {
        String sql="INSERT INTO approveinfo " +
                "VALUES(NULL, " +
                "?, " +
                "  '请尽快处理  ', " +
                "?, " +
                "NULL, " +
                "0, " +
                "(SELECT letterpropertiesf FROM letterbaseinfo WHERE idf=?), " +
                "1, " +
                "  '待办理  ', " +
                "(SELECT limitDatef FROM letterbaseinfo WHERE idf=? ), " +
                "0,0)";
        Connection conn=ConnUtil.getConn();
        try {
            int update = qr.update(conn, sql, vo.getLet_idf(), vo.getUserId(), vo.getIdf(), vo.getIdf());
            return update;
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }
}
