package com.sykj.edu.dao.daoImpl;



import com.sykj.edu.dao.SystemDao;
import com.sykj.edu.util.VCommList;
import com.sykj.edu.vo.XtyjVo;
import org.springframework.stereotype.Repository;

@Repository
public class SystemImpl extends BaseDaoImp implements SystemDao {


    @Override
    public VCommList querallList(XtyjVo xt){
        String sql="SELECT aa.*,e.SupervisorTimef FROM  " +
                " (SELECT  (CASE WHEN DATEDIFF(NOW(),b.endtime)>=3 AND DATEDIFF(NOW(),b.endtime)<=7 THEN '黄牌' " +
                "  WHEN  DATEDIFF(NOW(),b.endtime)>=7 THEN '红牌' " +
                "  ELSE '无' END) archivetype, " +
                "  a.idf,a.letterTitlef,a.registerTimef,c.dname,d.UIDF,d.truename " +
                "  FROM  letterbaseinfo a ,approveinfo b ,department c ,sys_user d  " +
                "  WHERE b.let_idf = a.idf " +
                "  AND d.UIDF = b.userId " +
                "  AND c.did = d.depid " +
                "  AND a.state = 1  " +
                "  AND b.state = '待办理'  " +
                "  ) aa  LEFT JOIN (SELECT let_idf,beenSupervisorf,MAX(SupervisorTimef) SupervisorTimef FROM SystemArchive GROUP BY idf,beenSupervisorf) e " +
                "  ON aa.idf=e.let_idf " +
                "  AND aa.UIDF = e.beenSupervisorf " +
                "  WHERE 1=1";
                if(xt.getTruename()!=null&&!equals("")){
                    sql+=" and aa.truename LIKE '%"+xt.getTruename()+"%'";
                }
                if (xt.getLetterTitlef()!=null&&!equals("")){
                    sql+=" and aa.letterTitlef LIKE '%"+xt.getLetterTitlef()+"%' ";
                }
                sql+=" ORDER BY idf DESC";
        return this.queryListForPage(xt,sql,XtyjVo.class);
    }
}
