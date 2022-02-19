package com.sykj.edu.controller;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/17 19:27
  @package_Name: com.sykj.edu.Controller
  @Class_Name: Login_Controller
  To change this template use File | Settings | File Templates.
*/
//登录模块

import com.sykj.edu.dao.LoginDao;
import com.sykj.edu.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/Login")
@Controller
public class LoginController {
    @Autowired
    private LoginDao dao;

    @RequestMapping("/login")
    @ResponseBody
    public Object Login(String username,String password){
        LoginVo login = dao.Login(username, password);
        return login;
    }

}
