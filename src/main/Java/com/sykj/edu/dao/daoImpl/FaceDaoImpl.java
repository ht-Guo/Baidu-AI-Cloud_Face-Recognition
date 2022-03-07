package com.sykj.edu.dao.daoImpl;

import com.sykj.edu.dao.FaceDao;
import com.sykj.edu.util.ConnUtil;
import com.sykj.edu.vo.FaceVo;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @@Description:人脸接口实现
 * @User:guohaotian
 * @Date: 2022/3/5 10:16
 * @package_Name: com.sykj.edu.dao.daoImpl
 * @Class_Name: FaceDaoImpl
 * To change this template use File | Settings | File Templates.
 */


@Repository
public class FaceDaoImpl implements FaceDao {
    private QueryRunner qr=new QueryRunner();

    @Override
    public List<FaceVo> FindAll() {
        String sql="SELECT * FROM facespot ";
        Connection conn= ConnUtil.getConn();
        try {
            List<FaceVo> query = qr.query(conn, sql, new BeanListHandler<>(FaceVo.class));
            return query;
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }finally {
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
    public Object FindUidf(String bdy_userId) {
        String sql="SELECT f.*,s.username,s.truename\n" +
                "FROM facespot f " +
                "INNER JOIN sys_user s " +
                "ON s.uidf=f.uidf " +
                "WHERE f.bdy_userId=?  ";
        Connection conn=ConnUtil.getConn();
        try {
            FaceVo query = qr.query(conn, sql, new BeanHandler<>(FaceVo.class),bdy_userId);
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
    public FaceVo isFaceEmpty(String uidf) {
        String sql="SELECT * FROM facespot where uidf=? ";
        Connection conn=ConnUtil.getConn();
        try {
            FaceVo query = qr.query(conn, sql, new BeanHandler<>(FaceVo.class), uidf);
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
    public int insertFace(String uidf) {
        String sql="INSERT INTO facespot  VALUES(?,'face1',?) ";
        Connection conn= ConnUtil.getConn();
        try {
            int update = qr.update(conn, sql, uidf,uidf);
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
}
