package com.sykj.edu.controller;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/15 21:48
  @package_Name: com.sykj.edu.controller
  @Class_Name: Sys_User_Controller
  To change this template use File | Settings | File Templates.
*/
import com.sykj.edu.dao.SysUserDao;
import com.sykj.edu.vo.SysUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("SysUser")
@Controller
//用户管理控制层
public class SysUserController {
    @Autowired
    private SysUserDao sud;
    //    查询显示
    @RequestMapping("findAll")
    @ResponseBody
    public Object findAll(String truename,String state) {
        List<SysUserVo> ucdAll = sud.findAll(truename,state);
        return ucdAll;
    }

    @RequestMapping("abc")
    @ResponseBody
    public Object abv(){
        String str="[code:0,msg:,count:100,data:"+findAll(null,null)+"]";
        return str;
    }
}
