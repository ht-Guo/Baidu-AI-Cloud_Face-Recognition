package com.sykj.edu.dao;



import com.sykj.edu.util.VCommList;
import com.sykj.edu.vo.Dept;
import com.sykj.edu.vo.Job;
import com.sykj.edu.vo.SysUserVo;

import java.util.List;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/15 21:50
  @package_Name: com.sykj.edu.Dao
  @Class_Name: Sys_User
  To change this template use File | Settings | File Templates.
*/
//用户管理接口
public interface SysUser_Dao {
    //动态显示所有信息以及模糊查询
    public VCommList findAll(SysUserVo ui);
    //删除
    public Integer del(Integer uidf);
    //添加
    public Integer add(SysUserVo su);
    //查询部门
    List <Dept> dept();
    //查询职位
    List <Job> job();
    //根据ID查询信息
    public SysUserVo Userinfo(Integer uidf);
    //修改
    public Integer upd(SysUserVo su, Integer uidf);
}
