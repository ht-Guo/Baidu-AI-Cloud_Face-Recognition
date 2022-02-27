package com.sykj.edu.util;

import com.sykj.edu.vo.ApproveLetterBaseInfo;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.lang.reflect.Method;
import java.sql.Connection;

/**
 * Created by IntelliJ IDEA.
 *
 * @User: guohaotian
 * @Date: 2022/2/27 14:32
 * @package_Name: com.sykj.edu.util
 * @Class_Name: SqlUtil
 * To change this template use File | Settings | File Templates.
 */
public class  SqlUtil {
    private static QueryRunner qr=new QueryRunner();

    /**
     *总数
     * */
    public static Object getCount(Class c, String sql){
        Connection conn=ConnUtil.getConn();
        String endSql="select count(*) count from ("+sql+")a ";
        try{
            Object query = qr.query(conn, endSql, new BeanHandler<>(c));
            //获取特定方法
            Method getCount = c.getMethod("getCount", null);
            //执行
            Object invoke = getCount.invoke(query, null);
            return invoke;
        }
        catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(conn!=null){
                    DbUtils.close(conn);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return 0;
    }

    /**
     * 分页查询
     * */
    public static String limitSql(String sql,Integer page,Integer limit){
        String endSql="select * from ("+sql+")a limit "+((page*limit)-limit)+","+limit+" ";
        return endSql;
    }

}
