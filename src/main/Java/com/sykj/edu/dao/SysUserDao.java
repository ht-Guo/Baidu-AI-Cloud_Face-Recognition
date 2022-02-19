package com.sykj.edu.dao;


import com.sykj.edu.vo.SysUserVo;

import java.util.List;


/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/15 21:50
  @package_Name: com.sykj.edu.dao
  @Class_Name: SysUserVo
  To change this template use File | Settings | File Templates.
*/
//用户管理接口
public interface SysUserDao {
    //动态显示所有信息以及模糊查询
    public List<SysUserVo> findAll(String truename, String state);
    //添加新用户
    public int addUser(SysUserVo uc);
    //修改
    public int updUser(SysUserVo uc);
    //根据id查看
    public SysUserVo findid(int uidf);
    //删除
    public void del(int uidf);
}
