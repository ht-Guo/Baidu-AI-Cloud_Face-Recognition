package com.sykj.edu.util;


import com.sykj.edu.dao.daoImpl.SystemImpl;
import com.sykj.edu.vo.Xtyj2Vo;

import java.util.List;

public class MyThread extends Thread {


    SystemImpl system= new SystemImpl();
    @Override
    public void run() {
        while (true){
            String sql=" SELECT  (CASE WHEN DATEDIFF(NOW(),b.fillTimef)>=3 AND DATEDIFF(NOW(),b.fillTimef)<=7 THEN '1'\n" +
                    "\t WHEN  DATEDIFF(NOW(),b.fillTimef)>=7 THEN '2'\n" +
                    "\t ELSE '0' END) archivetype,\n" +
                    "\t a.idf,a.letterTitlef,a.registerTimef,c.dname,d.UIDF,d.truename\n" +
                    " FROM  letterbaseinfo a ,approveinfo b ,department c ,sys_user d \n" +
                    "WHERE b.let_idf = a.idf\n" +
                    "AND d.UIDF = b.userId\n" +
                    "AND c.did = d.depid\n" +
                    "AND a.state = 1    -- 已提交审批中\n" +
                    "AND b.state = '待办理'";
            List<Xtyj2Vo> objects = system.queryForList(sql, Xtyj2Vo.class);
            for (Xtyj2Vo a:objects){

                String sql1="INSERT INTO SystemArchive VALUES(NULL,'"+a.getIdf()+"','"+a.getUidf()+"','0','"+a.getArchivetype()+"',NOW())";
                int update = system.update(sql1);
                String sql2="";
                if(a.getArchivetype()==1) {
                     sql2="UPDATE approveinfo SET yellowWarning= 1  WHERE let_idf="+a.getIdf()+" and userid="+a.getUidf();
                    system.update(sql2);
                }else if(a.getArchivetype()==2){
                    sql2="UPDATE approveinfo SET redWarning= 1  WHERE let_idf="+a.getIdf()+" and userid="+a.getUidf();
                    system.update(sql2);
                }
       }
            try {
                sleep(1000*60*60*24);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
