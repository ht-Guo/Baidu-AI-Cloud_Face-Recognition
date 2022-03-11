package com.sykj.edu.dao.daoImpl;


import com.sykj.edu.dao.Innernote_Dao;
import com.sykj.edu.util.VCommList;
import com.sykj.edu.vo.Innernote;
import com.sykj.edu.vo.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Date 2022/3/1 - 11:00
 */

@Repository
public class Innernote_Daomlpl extends BaseDaoImp implements Innernote_Dao {
    //查询显示
    @Override
    public VCommList findAll(Innernote innernote) {
        String sql = "select o.msgid,l.letterNamef,o.content,o.isreaded,o.sendtime,o.readtime,o.msgtype,b.dataValue\n" +
                "from oa_innernote o,lettersinfo l,basicdata b\n" +
                "where o.msgid=l.idf AND b.id=o.msgtype ";
        if (innernote.getSendtime() != null && !"".equals(innernote.getSendtime())) {
            sql += " and sendtime like '%" + innernote.getSendtime() + "%'";
        }
        if (innernote.getLetterNamef() != null && !"".equals(innernote.getLetterNamef())) {
            sql += " and letterNamef like '%" + innernote.getLetterNamef() + "%'";
        }
        sql="select * from ("+sql+")a order by a.sendtime desc ";
        return this.queryListForPage(innernote, sql, Innernote.class);

        //删除
    }

    @Override
    public Integer del(Integer msgid) {
        String sql = "delete from oa_innernote where msgid ="+msgid;
        return this.update(sql);
    }

    //添加
    @Override
    public Integer add(Innernote innernote) {
        String sql = "insert into oa_innernote VALUES(null,'"+ innernote.getTitle()+"'" +
                ",'"+innernote.getContent()+"',"+innernote.getSendid()+",'"+innernote.getSendtime()+"'" +
                ","+innernote.getRecid()+","+innernote.getIsreaded()+","+innernote.getIsdel()+"" +
                ",'"+innernote.getReadtime()+"',"+innernote.getMsgtype()+")";
            return update(sql);
    }

    @Override
    public List<Type> typeAll() {
        String sql = "select * from basicdatatype";
        return queryForList(sql, Type.class);
    }

    @Override
    public Innernote find(Integer msgid) {
        String sql = "select * from oa_innernote where msgid ="+msgid;
        return this.queryForBean(sql,Innernote.class);
    }

}
