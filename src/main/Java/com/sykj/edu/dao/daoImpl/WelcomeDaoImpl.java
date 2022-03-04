package com.sykj.edu.dao.daoImpl;

import com.sykj.edu.dao.WelcomeDao;
import com.sykj.edu.util.ConnUtil;
import com.sykj.edu.vo.Infoissue;
import com.sykj.edu.vo.OAInnernote;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @@Description:实现接口具体业务
 * @User:guohaotian
 * @Date: 2022/3/3 20:40
 * @package_Name: com.sykj.edu.dao.daoImpl
 * @Class_Name: NBDXXDaoImp
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class WelcomeDaoImpl implements WelcomeDao {
    private QueryRunner qr=new QueryRunner();

    @Override
    public Object FindFive(Integer uidf) {
        String sql="SELECT * FROM oa_innernote WHERE recid=? ORDER BY sendtime DESC LIMIT 0,5 ";
        Connection conn= ConnUtil.getConn();
        try {
            List<OAInnernote> query = qr.query(conn, sql, new BeanListHandler<>(OAInnernote.class), uidf);
            return query;
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
        return null;
    }

    @Override
    public Object FindInfoissue() {
        Connection conn= ConnUtil.getConn();
        String sql="SELECT * FROM infoissue ORDER BY pubTime DESC LIMIT 0,5 ";
        try {
            List<Infoissue> query = qr.query(conn, sql, new BeanListHandler<>(Infoissue.class));
            return query;
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
        return null;
    }
}
