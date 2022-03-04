package com.sykj.edu.controller;

import com.sykj.edu.dao.WelcomeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * @@Description:内部短消息控制层
 * @User:guohaotian
 * @Date: 2022/3/3 20:46
 * @package_Name: com.sykj.edu.controller
 * @Class_Name: NBDXXController
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("NBXX")
public class WelcomeController {
    @Autowired
    private WelcomeDao dao;

    //查询前五条消息
    @RequestMapping("FindFive")
    @ResponseBody
    public Object FindFive(Integer uidf){
        return dao.FindFive(uidf);
    }

    //查询通知公告
    @RequestMapping("TZGG")
    @ResponseBody
    public Object FindInfoissue(){
        return dao.FindInfoissue();
    }
}
