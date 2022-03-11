package com.sykj.edu.dao.daoImpl;


import com.sykj.edu.dao.Lettersinfo_Dao;
import com.sykj.edu.util.ConnUtil;
import com.sykj.edu.util.VCommList;
import com.sykj.edu.vo.Lettersinfo;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;

@Repository
//模糊查询
public class Lettersinfo_Daolmpl extends BaseDaoImp implements Lettersinfo_Dao {
    @Override
    public VCommList queryallList(Lettersinfo vip) {
        String sql = "select le.*,vip.recordDatef from lettersinfo le,vipmanage vip where le.idf=vip.idf";
        if(vip.getLetterOriRegAdsf() != null && !"".equals(vip.getLetterOriRegAdsf())){
            sql += " and le.letterOriRegAdsf like '%"+vip.getLetterOriRegAdsf()+"%'";
        }
        if(vip.getLetterNamef() != null && !"".equals(vip.getLetterNamef())){
            sql += " and le.LetterNamef like '%"+vip.getLetterNamef()+"%'";
        }
        return this.queryListForPage(vip,sql,Lettersinfo.class);
    }
    @Override
    public Integer todelete(Integer idf) {
        String sql = "delete from lettersinfo where idf =" + idf;
        return this.update(sql);
    }

    @Override
    public Integer toinsert(Lettersinfo v) {
        String sql = "insert into lettersinfo VALUES(null,'"+v.getLetterNamef()+"'"+","+v.getCardTypef()+",'"+v.getLetterCardNof()+"','"+v.getLetterMobilef()+"'"+ ",'"+v.getWorkDept()+"','"+v.getLetterPostNof()+"','"+v.getLetterAddressf()+"'"+",'"+v.getLetterAdsPostNof()+"','"+v.getLetterHomeAddrf()+"','"+v.getLetterOriRegAdsf()+"',"+v.getIsVIPf()+")";
         return this.update(sql);
    }

    @Override
    public Lettersinfo toupdate(Integer idf) {
        String sql = "select * from lettersinfo where idf = " + idf;
        return this.queryForBean(sql, Lettersinfo.class);
    }

    @Override
    public Integer update(Lettersinfo vi) {
        int num = 0;
        Connection conn = ConnUtil.getConn();
        QueryRunner qr = new QueryRunner();
        String sql = "update lettersinfo set letterNamef = ?,letterCardNof = ?,letterMobilef = ?,workDept = ?,letterOriRegAdsf = ? where idf = ?";
        try{
            num = qr.update(conn,sql,vi.getLetterNamef(),vi.getLetterCardNof(),vi.getLetterMobilef(),vi.getWorkDept(),vi.getLetterOriRegAdsf(),vi.getIdf());
            return num;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try{
                DbUtils.close(conn);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return 0;
    }
}