package com.sykj.edu.dao.daoImpl;


import com.sykj.edu.dao.Inform_Dao;
import com.sykj.edu.util.VCommList;
import com.sykj.edu.vo.Inform;
import org.springframework.stereotype.Repository;


/**
 * @Date 2022/2/28 - 20:20
 */

@Repository
public class Inform_Daomlpl extends BaseDaoImp implements Inform_Dao {
    @Override
    //查询显示
    public VCommList findAll(Inform inform) {
        String sql = "select i.idf,i.titlef,s.rolename,i.type,i.pubtime from infoissue i,sys_role s where i.useridf = s.roleId";

        if(inform.getTitlef()!=null&&!"".equals(inform.getTitlef())){
            sql +=" and i.titlef like '%"+inform.getTitlef()+"%'";
            System.out.println(sql);
        }

        if(inform.getType()!=null&&!"".equals(inform.getType())){
            sql +=" and i.type like '%"+inform.getType()+"%'";
            System.out.println(sql);
        }

        sql="select * from ("+sql+")a order by a.pubtime desc ";
        return this.queryListForPage(inform,sql,Inform.class);
    }

    //删除
    @Override
    public Integer del(Integer idf) {
        String sql = "delete from infoissue where idf ="+idf;
        return this.update(sql);
    }
    //添加
    @Override
    public Integer add(Inform inform) {
        String sql = "insert into infoissue values(null,"+inform.getType()+"" +
                ",'"+inform.getTitlef()+"',"+inform.getUseridf()+",'"+inform.getContentf()+"'" +
                ","+inform.getIsuserf()+",'"+inform.getPubtime()+"')";
        return this.update(sql);
    }

    //修改
    @Override
    public Integer upd(Inform inform, Integer idf) {
        String sql ="update infoissue set type="+inform.getType()+",titlef='"+inform.getTitlef()+"',\n" +
                "useridf="+inform.getUseridf()+",contentf='"+inform.getContentf()+"',isuserf="+inform.getIsuserf()+",\n" +
                "pubtime='"+inform.getPubtime()+"' where idf ="+idf;
        return this.update(sql);
    }

    //根据ID查询信息
    @Override
    public Inform find(Integer idf) {
        String sql = "select * from infoissue where idf="+idf;
        return this.queryForBean(sql,Inform.class);
    }
}
