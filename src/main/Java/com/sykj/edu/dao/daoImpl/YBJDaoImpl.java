package com.sykj.edu.dao.daoImpl;

import com.sykj.edu.dao.YBJDao;
import com.sykj.edu.util.ConnUtil;
import com.sykj.edu.util.SqlUtil;
import com.sykj.edu.vo.YBJVo;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @User: guohaotian
 * @Date: 2022/2/28 17:28
 * @package_Name: com.sykj.edu.dao.daoImpl
 * @Class_Name: YBJDaoImpl
 * To change this template use File | Settings | File Templates.
 */

@Repository
public class YBJDaoImpl implements YBJDao {
    private QueryRunner qr=new QueryRunner();

    /**
     * 信访人姓名、letterNamef,
     * 标题、letterTitlef
     * 信访来源：  letterSource
     *模糊查询
     *
     * */
    @Override
    public Object FindAllLett(Integer userId,String letterNamef,String letterTitlef,String letterSource,Integer page,Integer limit) {
        String sql="select l.idf,s.truename,l.letterTitlef,case when l.state='0' then '未办理'  " +
                "when l.state='1' then '办理中'  " +
                "when l.state='2' then '已办结' " +
                "end state, " +
                "l.letterPropertiesf, " +
                "b.fillTimef ,"+
                "d.dataValue letterSource "+
                "from ( " +
                "select l.idf let_idf,max(a.idf) idf from approveinfo a  " +
                "inner join letterbaseinfo l  " +
                "on a.let_idf=l.idf " +
                "group by l.idf)a " +
                "inner join lettersinfo c "+
                "inner join letterbaseinfo l " +
                "inner join approveinfo b " +
                "inner join sys_user s " +
                "inner join (select id,dataValue from basicdata where basedatatypeid=2)d "+
                "on a.let_idf=l.idf " +
                "and a.idf=b.idf " +
                "and s.uidf=b.userid " +
                "and c.idf=letterIDf "+
                "and d.id=l.letterSource "+
                "where l.letterRegisterIdf='"+userId+"'";
        Connection conn= ConnUtil.getConn();
        if(letterNamef!=null && !letterNamef.equals("")){
            sql+=" and c.letterNamef like '%"+letterNamef+"%'";
        }
        if(letterTitlef!=null && !letterTitlef.equals("")){
            sql+=" and  l.letterTitlef like '%"+letterTitlef+"%' ";
        }
        if(letterSource!=null && !letterSource.equals("")){
            sql+=" and l.letterSource = '"+letterSource+"'";
        }
        Object count = SqlUtil.getCount(YBJVo.class, sql);
        sql="select * from ("+sql+")a order by a.fillTimef desc limit "+((page*limit)-limit)+","+limit+" ";
        try {
            List<YBJVo> query = qr.query(conn, sql, new BeanListHandler<>(YBJVo.class));
            List list=new ArrayList();
            list.add(count);
            list.add(query);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try{
                if(conn!=null){
                    DbUtils.close(conn);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 查询所有信访来源
     * */

    @Override
    public Object FindAll() {
        String sql="select id,dataValue from basicdata  where   basedataTypeid=2 ";
        Connection conn=ConnUtil.getConn();
        try {
            List<YBJVo> query = qr.query(conn, sql, new BeanListHandler<>(YBJVo.class));
            return query;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try{
                if(conn!=null){
                    DbUtils.close(conn);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
