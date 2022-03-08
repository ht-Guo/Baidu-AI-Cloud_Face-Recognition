package com.sykj.edu.dao.daoImpl;

import com.sykj.edu.util.DBHelper;
import com.sykj.edu.util.VCommList;
import com.sykj.edu.vo.BaseVo;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


public class BaseDaoImp {

	/**
	 * 公共的分页查询的方法
	 * @param <T> 
	 * @param vo  封装分页信息的VO类
	 * @param sql 查询数据的SQL语句
	 * @param t   用于封装数据的的VO对象
	 * @return  封装了列表数据和分页信息的VCommList对象
	 */
	public <T> VCommList queryListForPage(T vo, String sql, Class t){
		BaseVo bv = null;//创建分页对象
		VCommList list = new VCommList();//创建分页查询对象
		List alldb=new ArrayList();
		List pagedb=new ArrayList();
		Connection conn=null;
		try {
			conn= DBHelper.getconn();
			bv =(BaseVo)vo;//分页对象转换
			//创建查询对象
			QueryRunner qr = new QueryRunner();
			//查询所有数据
	        alldb =  (ArrayList) qr.query(conn,sql,new BeanListHandler<>(t));
	        System.out.println("查询公共数据的SQL:"+sql);
	        //构建分页查询的sql
	        if(bv.getPage()!=null&&bv.getLimit()!=null) {
		        sql= "select * from ("+sql+") pagelistdb limit "+bv.getStartpage()+","+bv.getLimit();
	        }
	        System.out.println("查询分页数据的SQL:"+sql);
	        //查询分页数据
	        pagedb =  (ArrayList) qr.query(conn,sql,new BeanListHandler<>(t));
	        
	        //对分页方法进行封装
	         list.setPage(bv.getPage());
	 		 list.setLimit(bv.getLimit());
	         list.setCount(alldb.size());
	         list.setData(pagedb);
	         list.setCode(0);
	         list.setMsg("");
	         
		}catch(Exception e) {
			e.printStackTrace();
			list.setCode(1);
	        list.setMsg("系统查询异常");
		}finally {
			//关闭数据库连接
			try {
				DbUtils.close(conn);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
	
	/**
	 * 公共的查询方法（不进行分页查询）
	 * @param sql  查询数据的sql语句
	 * @param t     封装数据的VO对象
	 * @return      封装了列表数据和分页信息的VCommList对象
	 * @throws Exception
	 */
	public  VCommList queryListNoPage(String sql,Class t){
		VCommList list = new VCommList();//创建分页查询对象
		List alldb=new ArrayList();
		Connection conn=null;
		try {
			conn= DBHelper.getconn();
			//创建查询对象
			QueryRunner qr = new QueryRunner();
			//查询所有数据
			System.out.println("查询公共数据的SQL:"+sql);
	        alldb = (ArrayList) qr.query(conn,sql,new BeanListHandler<>(t));
	       System.out.println("数据长度："+alldb.size());
	        //对分页方法进行封装
	         list.setPage(0);
	 		 list.setLimit(15);
	         list.setCount(alldb.size());
	         list.setCode(0);
	         list.setMsg("");
	         list.setData(alldb);
	         
		}catch(Exception e) {
			list.setCode(1);
	        list.setMsg("系统查询异常");
		}finally {
			//关闭数据库连接
			try {
				DbUtils.close(conn);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
	
	
	/**
	 * 公共的查询方法-返回一个ArrayList集合（不进行分页查询,不进行列表数据封装）
	 * @param sql  查询数据的sql语句
	 * @param t     封装数据的VO对象
	 * @return      未经过任何封装的数据集合（ArrayList集合）
	 * @throws Exception
	 */
	public <T> List<T> queryForList(String sql,Class t){
		List<T> alldb=new ArrayList();
		Connection conn=null;
		try {
			conn= DBHelper.getconn();
			//创建查询对象
			QueryRunner qr = new QueryRunner();
			//查询所有数据
			System.out.println("查询公共数据的SQL:"+sql);
	        alldb =  (List<T>) qr.query(conn,sql,new BeanListHandler<>(t));
	        System.out.println("数据长度："+alldb.size());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//关闭数据库连接
			try {
				DbUtils.close(conn);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return alldb;
	}
	
	/**
	 * 公共的查询方法-返回一个JavaBean（VO）对象
	 * @param sql  查询数据的sql语句
	 * @param t     封装数据的VO对象
	 * @return      未经过任何封装的数据集合（ArrayList集合）
	 * @throws Exception
	 */
	public <T> T  queryForBean(String sql,Class t){
		T ts=null;
		Connection conn=null;
		try {
			conn= DBHelper.getconn();
			//创建查询对象
			QueryRunner qr = new QueryRunner();
			//查询所有数据
			System.out.println("查询公共数据的SQL:"+sql);
	        ts =  (T) qr.query(conn,sql,new BeanHandler<>(t));
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//关闭数据库连接
			try {
				DbUtils.close(conn);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return ts;
	}
	
	/**
	 * 公共的新增/修改方法-返回一个新增/修改了几条数据
	 * @param sql  对数据库新增/修改的sql语句
	 * @return     新增/修改成功几条数据
	 * @throws Exception
	 */
	public int  update(String sql){
		Connection conn=null;
		try {
			conn= DBHelper.getconn();
			//创建查询对象
			QueryRunner qr = new QueryRunner();
			//查询所有数据
			System.out.println("查询公共数据的SQL:"+sql);
	        int num =  qr.update(conn,sql);
	        return num;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//关闭数据库连接
			try {
				DbUtils.close(conn);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return 0;
	}
	
	
}
