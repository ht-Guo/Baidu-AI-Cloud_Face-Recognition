package com.sykj.edu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBHelper {
	public static Connection getconn() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/projecttest?characterEncoding=utf8&useSSL=false&serverTimezone=UTC";
			conn = DriverManager.getConnection(url,"root","root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * 关闭数据库连接
	 * @param rs
	 * @param stm
	 * @param conn
	 */
	public static void  closeConn(ResultSet rs,Statement stm,Connection conn) {
		try {
			if(rs!=null)rs.close();
			if(stm!=null)stm.close();
			if(conn!=null)conn.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
