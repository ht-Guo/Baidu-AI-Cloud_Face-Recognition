package com.sykj.edu.dao.daoImpl;


import com.sykj.edu.dao.VipManage_Dao;
import com.sykj.edu.util.VCommList;
import com.sykj.edu.vo.VipManage;
import org.springframework.stereotype.Repository;

@Repository
public class VipManage_Daolmpl extends BaseDaoImp implements VipManage_Dao {
    @Override
    public VCommList queryallList(VipManage vipManage) {
        String sql = "select v.*,su.truename from vipmanage v, sys_user su where v.useridf = su.uidf";
        return this.queryListForPage(vipManage,sql,VipManage.class);
    }

    @Override
    public Integer toinsert(VipManage v) {
        String sql = "insert into vipmanage (userIdf,titlef,recordTypef,contentf) values ("+v.getVipidf()+",'"+v.getTitlef()+"',"+v.getRecordTypef()+",'"+v.getContentf()+"');";
        System.out.println(sql);
        return this.update(sql);
    }
}
