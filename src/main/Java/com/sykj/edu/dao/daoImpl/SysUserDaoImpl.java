package com.sykj.edu.dao.daoImpl;

import com.sykj.edu.dao.SysUserDao;
import com.sykj.edu.util.ConnUtil;
import com.sykj.edu.vo.SysUserVo;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/15 21:54
  @package_Name: com.sykj.edu.dao.daoImpl
  @Class_Name: Sys_User_DaoImpl
  To change this template use File | Settings | File Templates.
*/
//用户管理接口实现类

@Repository
public class SysUserDaoImpl implements SysUserDao {
    private QueryRunner qr=new QueryRunner();

    @Override
    public List<SysUserVo> findAll(String truename, String state) {
        List<SysUserVo>userControls = null;
        Connection conn = ConnUtil.getConn();
        String sql = "select * from sys_user where uidf = uidf";
        if(truename != null && !"".equals(truename)){
            sql += "and truename like '%"+truename+"%'";
        }
        if(state != null && !"".equals(state)){
            sql+="and state like '%"+state+"%'";
        }
        try {
            userControls = qr.query(conn,sql,new BeanListHandler<SysUserVo>(SysUserVo.class));
            return userControls;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public int addUser(SysUserVo uc) {
        return 0;
    }

    @Override
    public int updUser(SysUserVo uc) {
        return 0;
    }

    @Override
    public SysUserVo findid(int uidf) {
        return null;
    }

    @Override
    public void del(int uidf) {

    }
}
