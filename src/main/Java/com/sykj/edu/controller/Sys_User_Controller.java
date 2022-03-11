package com.sykj.edu.controller;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/15 21:48
  @package_Name: com.sykj.edu.Controller
  @Class_Name: Sys_User_Controller
  To change this template use File | Settings | File Templates.
*/

import com.sykj.edu.dao.SysUser_Dao;
import com.sykj.edu.util.VCommList;
import com.sykj.edu.vo.SysUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("Sys_User")
@Controller
//用户管理控制层
public class Sys_User_Controller {
    @Autowired
    private SysUser_Dao sud;
    //    查询显示
    @RequestMapping("/findAll")
    @ResponseBody
    public Object findAll(SysUserVo su) {
        VCommList list = sud.findAll(su);
        return list;
    }
    //修改
    @RequestMapping("/update")
    @ResponseBody
    public Object upd(SysUserVo su, Integer uidf){
        return sud.upd(su,uidf);
    }

    //删除
    @RequestMapping("/del")
    @ResponseBody
    public Object del(Integer uidf){
    return sud.del(uidf);
    }

    //添加
    @RequestMapping("/add")
    @ResponseBody
    public Object add(SysUserVo su){
        return sud.add(su);
    }

    //查询部门信息
    @RequestMapping("/dept")
    @ResponseBody
    public Object dept(){
    return sud.dept();
    }

    //查询职位信息
    @RequestMapping("/job")
    @ResponseBody
    public Object job(){
        return sud.job();
    }

    //根据ID查看数据
    @RequestMapping("/find")
    @ResponseBody
    public Object find(Integer uidf){
        return sud.Userinfo(uidf);
    }

}
