package com.sykj.edu.controller;

//功能权限模块
/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/19 20:11
  @package_Name: com.sykj.edu.controller
  @Class_Name: InitController
  To change this template use File | Settings | File Templates.
*/

import com.sykj.edu.vo.InitVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回初始化数据
 * */

@Controller
@RequestMapping("json")
public class InitController {

    @RequestMapping("init")
    @ResponseBody
    public Object init(){
        InitVo iV=new InitVo();
        /**
         * homeInfo
         * */
        InitVo.home home=iV.new home("首页","page/welcome-1.html");
        /**
         * logoInfo
         * */
        InitVo.login login=iV.new login("信访系统","images/logo.png","");
        /**
         * menuInfo
         * */
//        首页
        final InitVo.childs sY=iV.new childs("首页","page/menu.html","fa fa-home","_self",null);

//        信访登记
        final InitVo.childs xFDJ=iV.new childs("信访登记","page/menu.html","fa fa-window-maximize","_self",null);

//      信访处理(待办件，非正常上访，已办件)
//        待办件
         final InitVo.childs dBJ=iV.new childs("待办件","page/welcome-1.html","fa fa-tachometer","_self",null);
//        非正常上访
         final InitVo.childs fZCCSF=iV.new childs("非正常上访","page/welcome-2.html","fa fa-tachometer","_self",null);
//        已办件
         final InitVo.childs yBJ=iV.new childs("已办件","page/welcome-3.html","fa fa-tachometer","_self",null);
        List xFList=new ArrayList(){
            {
                add(dBJ);
                add(fZCCSF);
                add(yBJ);
            }
        };
        final InitVo.childs xFCL=iV.new childs("信访处理","page/setting.html","fa fa-gears","_self",xFList);

//        督查督办(督办管理，实时督查，系统预警，督查统计)
//        督办管理
        final InitVo.childs dBGL=iV.new childs("督办管理","Moudel3/table.html","fa fa-list-alt","_self",null);
//        实时督查
        final InitVo.childs sSDC=iV.new childs("实时督查","page/table.html","fa fa-navicon","_self",null);
//        系统预警
        final InitVo.childs xTYJ=iV.new childs("系统预警","page/table.html","fa fa-tags","_self",null);
//        督查统计
        final InitVo.childs dCTJ=iV.new childs("督查统计","page/table.html","fa fa-tags","_self",null);
        List dCList=new ArrayList(){
            {
                add(dBGL);
                add(sSDC);
                add(xTYJ);
                add(dCTJ);
            }
        };
        final InitVo.childs dCDB=iV.new childs("督察督办","page/table.html","fa fa-gears","_self",dCList);

//        查询统计(本局报表，上报报表，综合查询)
//        本局报表
        final InitVo.childs bJBB=iV.new childs("本局报表","page/form.html","fa fa-list-alt","_self",null);
//        上报报表
        final InitVo.childs sBBB=iV.new childs("上报报表","page/form-step.html","fa fa-navicon","_self",null);
//        综合查询
        final InitVo.childs zHCX=iV.new childs("综合查询","page/login-3.html","fa fa-tags","_blank",null);
        List tJList=new ArrayList(){
            {
                add(bJBB);
                add(sBBB);
                add(zHCX);
            }
        };
        final InitVo.childs cXTJ=iV.new childs("查询统计","","fa fa-gears","_self",tJList);

//        公共信息(通知通告，内部短消息)
//        通知通告
        final InitVo.childs tZTG=iV.new childs("通知通告","page/login-1.html","fa fa-stumbleupon-circle","_blank",null);
//        内部短信息
        final InitVo.childs nBDXX=iV.new childs("内部短消息","page/login-2.html","fa fa-viacoin","_blank",null);
        List gGXXList=new ArrayList(){
            {
                add(tZTG);
                add(nBDXX);
            }
        };
        final InitVo.childs gGXX=iV.new childs("公共信息","","fa fa-flag-o","_self",gGXXList);

//        系统管理(用户管理，角色管理)
//        用户管理
        final InitVo.childs yHGL=iV.new childs("用户管理","page/404.html","fa fa-hourglass-end","_self",null);
//        角色管理
        final InitVo.childs jSGL=iV.new childs("角色管理","page/404.html","fa fa-hourglass-end","_self",null);
        List xTGLList=new ArrayList(){
            {
                add(yHGL);
                add(jSGL);
            }
        };
        final InitVo.childs xTGL=iV.new childs("查询统计","","fa fa-gears","_self",xTGLList);

//       重点对象管理(重点对象查询，维稳报表)
//        重点对象查询
        final InitVo.childs zDDXCX=iV.new childs("重点对象查询","page/button.html","fa fa-snowflake-o","_self",null);
//        维稳报表
        final InitVo.childs wWBB=iV.new childs("维稳报表","page/layer.html","fa fa-shield","_self",null);
        List zDDXGLList=new ArrayList(){
            {
                add(zDDXCX);
                add(wWBB);
            }
        };
        final InitVo.childs zDDXGL=iV.new childs("重点对象管理","","fa fa-snowflake-o","",zDDXGLList);

//        信访功能模块
        List xFGNMK=new ArrayList(){
            {
                add(sY);
                add(xFDJ);
                add(xFCL);
                add(dCDB);
                add(cXTJ);
                add(gGXX);
                add(xTGL);
                add(zDDXGL);
            }
        };
        final InitVo.menu menu =iV.new menu("信访功能模块","fa fa-address-book","","_self",xFGNMK);
        List meNuCount=new ArrayList(){
            {
                add(menu);
            }
        };

//        总模块
        InitVo i=new InitVo(home,login,meNuCount);
        return i;
    }
};
