package com.sykj.edu.dao.daoImpl;


import com.sykj.edu.dao.SysUser_Dao;
import com.sykj.edu.util.VCommList;
import com.sykj.edu.vo.Dept;
import com.sykj.edu.vo.Job;
import com.sykj.edu.vo.SysUserVo;
import org.springframework.stereotype.Repository;

import java.util.List;


/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/15 21:54
  @package_Name: com.sykj.edu.Dao.DaoImpl
  @Class_Name: Sys_User_DaoImpl
  To change this template use File | Settings | File Templates.
*/
//用户管理接口实现类

@Repository
public class Sys_User_DaoImpl extends BaseDaoImp implements SysUser_Dao {

    //查询显示
    @Override
    public VCommList findAll(SysUserVo ui) {
        String sql = "select uidf,username,truename,mobilePhone,email,isactive\n" +
                "from sys_user\n" +
                "where\t1=1";
        if(ui.getTruename()!=null&&!"".equals(ui.getTruename())){
            sql+=" and truename like '%"+ui.getTruename()+"%'";
        }
        if(ui.getIsActive()!=0&&!"".equals(ui.getIsActive())){
            sql+=" and isActive like '%"+ui.getIsActive()+"%'";
        }
        return this.queryListForPage(ui,sql,SysUserVo.class);
    }

    //删除
    @Override
    public Integer del(Integer uidf) {
        String sql = "delete from sys_user where uidf ="+uidf;
        return this.update(sql);
    }

    //添加
    @Override
    public Integer add(SysUserVo su) {
        String sql = "insert into sys_user values(null,'"+su.getPassword()+"'"+",'"+su.getUsername()+"','"+su.getTruename()+"','"+su.getEmail()+"'" + ",'"+su.getMobilePhone()+"','"+su.getHomePhone()+"','"+su.getOfficePhone()+"'" +
                ",'"+su.getAddr()+"',"+su.getIsActive()+","+su.getDepid()+","+su.getJobid()+")";
        return this.update(sql);
    }

    @Override
    public List<Dept> dept() {
        String sql = "select * from department";
        return this.queryForList(sql, Dept.class);
    }

    @Override
    public List<Job> job() {
        String sql = "select * from job";
        return this.queryForList(sql,Job.class);
    }

    @Override
    public SysUserVo Userinfo(Integer uidf) {
        String sql = "select * from sys_user where uidf="+uidf;
        return this.queryForBean(sql,SysUserVo.class);
    }

    @Override
    public Integer upd(SysUserVo su,Integer uidf) {
    String sql = "update sys_user set truename='"+su.getTruename()+"',mobilePhone='"+su.getMobilePhone()+"',\n" +
                "email='"+su.getEmail()+"',homePhone='"+su.getHomePhone()+"',officePhone='"+su.getOfficePhone()+"',addr='"+su.getAddr()+"',\n" +
                "isActive="+su.getIsActive()+",depid="+su.getDepid()+",jobid="+su.getJobid()+" where uidf ="+uidf;
        return this.update(sql);
    }

}
