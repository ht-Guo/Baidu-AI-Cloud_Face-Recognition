package com.sykj.edu.dao.daoImpl;

import com.sykj.edu.dao.VipManageDao;
import com.sykj.edu.util.ConnUtil;
import com.sykj.edu.vo.VipManageVo;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Repository
public class VipManageDaolmpl implements VipManageDao {
    @Override
    //模糊查询
    public List<VipManageVo> findAll(String letterOriRegAdsf, String letterNamef) {
        List<VipManageVo> vipManages = null;
        Connection conn = ConnUtil.getConn();
        QueryRunner qr = new QueryRunner();
        String sql = "select le.*,vip.recordDatef from lettersinfo le,vipmanage vip where le.idf=vip.idf;";
        System.out.println(sql);
        if(letterOriRegAdsf != null && !"".equals(letterOriRegAdsf)){
            sql += " and le.letterOriRegAdsf like '%"+letterOriRegAdsf+"%'";
            System.out.println(sql);
        }
        if(letterNamef != null && !"".equals(letterNamef)){
            sql += " and vip.letterNamef like '%"+letterNamef+"%'";
        }
        try{
            vipManages = qr.query(conn,sql,new BeanListHandler<VipManageVo>(VipManageVo.class));
            return vipManages;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try{
                DbUtils.close(conn);
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
