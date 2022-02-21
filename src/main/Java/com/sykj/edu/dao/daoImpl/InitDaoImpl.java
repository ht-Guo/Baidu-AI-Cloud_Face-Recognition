package com.sykj.edu.dao.daoImpl;

import com.sykj.edu.dao.InitDao;
import com.sykj.edu.util.ConnUtil;
import com.sykj.edu.vo.Childs;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.List;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/21 8:25
  @package_Name: com.sykj.edu.dao.daoImpl
  @Class_Name: InitDaoImpl
  To change this template use File | Settings | File Templates.
*/

@Repository
public class InitDaoImpl implements InitDao {
    QueryRunner qr=new QueryRunner();
    @Override
    public List<Childs> findAllInit(int uidf) {
        Connection conn= ConnUtil.getConn();
        String sql="select distinct(sf.name) as title from Sys_user su inner join Sys_user_role sur inner join Sys_role_function srf inner join Sys_function sf on su.uidf=sur.user_id and sur.role_id=srf.role_id and srf.function_id=sf.id where su.uidf=? ";
        try {
            List<Childs> query = qr.query(conn, sql, new BeanListHandler<>(Childs.class), uidf);
            return query;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try{
                if(conn!=null){
                    DbUtils.close(conn);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
