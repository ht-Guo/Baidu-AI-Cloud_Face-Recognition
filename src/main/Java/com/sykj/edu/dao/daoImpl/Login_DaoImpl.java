package com.sykj.edu.dao.daoImpl;

import com.sykj.edu.dao.LoginDao;
import com.sykj.edu.util.ConnUtil;
import com.sykj.edu.vo.LoginVo;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/17 19:14
  @package_Name: com.sykj.edu.Dao.DaoImpl
  @Class_Name: Login_DaoImpl
  To change this template use File | Settings | File Templates.
*/
//登录
@Repository
public class Login_DaoImpl implements LoginDao {
    private QueryRunner qr=new QueryRunner();

    @Override
    public LoginVo Login(String username, String password) {
        Connection conn= ConnUtil.getConn();
        LoginVo result=null;
        String sql="select * from Sys_User where username=? and password=? ";
        try {
            result=qr.query(conn,sql,new BeanHandler<>(LoginVo.class),username,password);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(conn!=null){
                    DbUtils.close(conn);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
