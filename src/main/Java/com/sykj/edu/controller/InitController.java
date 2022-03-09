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

import com.sykj.edu.dao.InitDao;
import com.sykj.edu.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 返回初始化数据
 * */

@Controller
@RequestMapping("json")
public class InitController {
    @Autowired
    private InitDao InitDao;

    @RequestMapping("init/{uidf}")
    @ResponseBody
    public Object init(@PathVariable("uidf")Integer uidf) {

        List<Childs> allInit = InitDao.findAllInit(uidf);
        /**
         * homeInfo
         * */
        Home home=new Home("首页","Moudel1/WelcomeHome.html");
        /**
         * logoInfo
         * */
        Login login=new Login("信访系统","images/logo.png","");
        /**
         * menuInfo
         * */
        //        信访功能模块
        List xFGNMK=new ArrayList();

        //        首页
        final Childs sY=new Childs("首页","Moudel1/WelcomeHome.html","fa fa-home","_self",null);
        xFGNMK.add(sY);

        for(int i=0;i<allInit.size();i++){
        switch(allInit.get(i).getTitle()){
            case "信访登记":
                //        信访登记
                final   Childs xFDJ=new  Childs("信访登记","page/menu.html","fa fa-window-maximize","_self",null);
                xFGNMK.add(xFDJ);
                break;

            case"信访处理":
//      信访处理(待办件，非正常上访，已办件)
//        待办件
                final   Childs dBJ=new  Childs("待办件","Moudel2/table-dbj.html","fa fa-tachometer","_self",null);
//        非正常上访
                final   Childs fZCCSF=new  Childs("非正常上访","Moudel2/table-fzcsf.html","fa fa-tachometer","_self",null);
//        已办件
                final   Childs yBJ=new  Childs("已办件","Moudel2/YBJ.html","fa fa-tachometer","_self",null);
                List xFList=new ArrayList(){
                    {
                        add(dBJ);
                        add(fZCCSF);
                        add(yBJ);
                    }
                };
                final   Childs xFCL=new  Childs("信访处理","","fa fa-gears","_self",xFList);
                xFGNMK.add(xFCL);
                break;

            case "督查督办":
                //        督查督办(督办管理，实时督查，系统预警，督查统计)
//        督办管理
                final   Childs dBGL=new  Childs("督办管理","Moudel3/table.html","fa fa-list-alt","_self",null);
//        实时督查
                final   Childs sSDC=new  Childs("实时督查","Moudel3/ssdb.html","fa fa-navicon","_self",null);
//        系统预警
                final   Childs xTYJ=new  Childs("系统预警","Moudel3/xtyj.html","fa fa-tags","_self",null);
                List dCList=new ArrayList(){
                    {
                        add(dBGL);
                        add(sSDC);
                        add(xTYJ);
                    }
                };
                final   Childs dCDB=new  Childs("督察督办","","fa fa-gears","_self",dCList);
                xFGNMK.add(dCDB);
                break;

                case"查询统计":
                    //        查询统计(本局报表，上报报表，综合查询)
//        我区群众到省、市、区集体上访一览表
                    final   Childs SSQ=new  Childs("我区群众到省、市、区集体上访一览表","Moudel4/table1.html","fa fa-list-alt","_self",null);
//        我区群众到省、市集体上访明细表
                    final   Childs SSJT=new  Childs("我区群众到省、市、集体上访明细表","Moudel4/table2.html","fa fa-navicon","_self",null);
//        群众到我区集体上访明细表
                    final   Childs wq=new  Childs("群众到我区集体上访明细表","Moudel4/table3.html","fa fa-tags","_self",null);
//                    综合查询
                    final   Childs zHcx=new Childs("综合查询","Moudel4/zhcx.html","","_self",null);
                    List tJList=new ArrayList(){
                        {
                            add(SSQ);
                            add(SSJT);
                            add(wq);
                            add(zHcx);
                        }
                    };
                    final   Childs cXTJ=new  Childs("查询统计","","fa fa-gears","_self",tJList);
                    xFGNMK.add(cXTJ);
                    break;

            case"公共信息":
                //        公共信息(通知通告，内部短消息)
//        通知通告
                final   Childs tZTG=new  Childs("通知通告","page/login-1.html","fa fa-stumbleupon-circle","_blank",null);
//        内部短信息
                final   Childs nBDXX=new  Childs("内部短消息","page/login-2.html","fa fa-viacoin","_blank",null);
                List gGXXList=new ArrayList(){
                    {
                        add(tZTG);
                        add(nBDXX);
                    }
                };
                final   Childs gGXX=new  Childs("公共信息","","fa fa-flag-o","_self",gGXXList);
                xFGNMK.add(gGXX);
                break;

            case"系统管理":
                //        系统管理(用户管理，角色管理)
//        用户管理
                final   Childs yHGL=new  Childs("用户管理","page/404.html","fa fa-hourglass-end","_self",null);
//        角色管理
                final   Childs jSGL=new  Childs("角色管理","page/404.html","fa fa-hourglass-end","_self",null);
                List xTGLList=new ArrayList(){
                    {
                        add(yHGL);
                        add(jSGL);
                    }
                };
                final   Childs xTGL=new  Childs("系统管理","","fa fa-gears","_self",xTGLList);
                xFGNMK.add(xTGL);
                break;

            case "重点对象":
                //       重点对象管理(重点对象查询，维稳报表)
//        重点对象查询
                final   Childs zDDXCX=new  Childs("重点对象查询","page/button.html","fa fa-snowflake-o","_self",null);
//        维稳报表
                final   Childs wWBB=new  Childs("维稳报表","page/layer.html","fa fa-shield","_self",null);
                List zDDXGLList=new ArrayList(){
                    {
                        add(zDDXCX);
                        add(wWBB);
                    }
                };
                final   Childs zDDXGL=new  Childs("重点对象管理","","fa fa-snowflake-o","",zDDXGLList);
                xFGNMK.add(zDDXGL);
                break;
        }
        }



        final Menu menu =new Menu("信访功能模块","fa fa-address-book","","_self",xFGNMK);
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
