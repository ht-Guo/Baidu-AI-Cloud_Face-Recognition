package com.sykj.edu.util;

import java.sql.Connection;
import java.sql.DriverManager;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/14 20:05
  @package_Name: com.sykj.edu.util
  @Class_Name: ConnUtil
  To change this template use File | Settings | File Templates.
*/
//获取数据库连接
public class ConnUtil {
    public static Connection getConn(){
        Connection conn=null;
        String url="jdbc:mysql://localhost/projecttest?characterEncoding=utf-8&serverTimezone=GMT&useSSL=false";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection(url,"root","root");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
//  测试类
//    public static void main(String[] args) {
//        Connection conn = ConnUtil.getConn();
//        System.out.println(conn);
//    }
}
