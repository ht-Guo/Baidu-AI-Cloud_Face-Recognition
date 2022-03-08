package com.sykj.edu.dao.daoImpl;


import com.sykj.edu.dao.InquiryStatisticsDao;
import com.sykj.edu.util.ConnUtil;
import com.sykj.edu.vo.InquiryStatistics;
import com.sykj.edu.vo.IntegratedQuery;
import com.sykj.edu.vo.ListOftheMasses;
import com.sykj.edu.vo.PublicList;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Repository
public class InquiryStatisticsDaoImpl extends BaseDaoImp implements InquiryStatisticsDao {

    private QueryRunner qr = new QueryRunner();

    @Override
    public List<InquiryStatistics> findAll(String registerTimef) {
        List<InquiryStatistics> inquiryStatistics = null;
        Connection conn = ConnUtil.getConn();
        String sql = "select bc.id,bc.dataValue,ifnull(sum(shengrs),0) shengrs ,ifnull(sum(shengpc),0) shengpc,ifnull(sum(tqshengrs),0) tqshengrs,ifnull(sum(tqshengpc),0)tqshengpc,\n" +
                "ifnull(sum(shirs),0)shirs,ifnull(sum(shipc),0)shipc,ifnull(sum(tqshirs),0)tqshirs,ifnull(sum(tqshipc),0)tqshipc,\n" +
                "ifnull(sum(qurs),0)qurs,ifnull(sum(qupc),0)qupc,ifnull(sum(tqqurs),0)tqqurs,ifnull(sum(tqqupc),0)tqqupc\n" +
                "from(\n" +
                "\tselect aa.dutyArea, \n" +
                "\t\tsum(case aa.visitedDept when 87 then aa.rs else 0 end ) shengrs ,\n" +
                "\t\tsum(case aa.visitedDept when 87 then aa.pc else 0 end ) shengpc,\n" +
                "\t\tsum(case aa.visitedDept when 88 then aa.rs else 0 end ) shirs ,\n" +
                "\t\tsum(case aa.visitedDept when 88 then aa.pc else 0 end ) shipc,\n" +
                "\t\tsum(case aa.visitedDept when 89 then aa.rs else 0 end ) qurs ,\n" +
                "\t\tsum(case aa.visitedDept when 89 then aa.pc else 0 end ) qupc,\n" +
                "\t\t0 tqshengrs,0 tqshengpc,0 tqshirs,0 tqshipc,0 tqqurs,0 tqqupc\n" +
                "\tfrom (\n" +
                "\t\tselect  dutyArea ,(case when  visitedDept=87 then 87 when visitedDept\n" +
                "\t\t=88 then 88 when visitedDept>=89 and visitedDept<=99 then 89 else 86 end) visitedDept,(visiterCount) rs ,1 pc  from  letterbaseinfo where registerTimef>='2021-11-11' and registerTimef<='2021-12-30') aa \n" +
                "\tgroup by  aa.dutyArea\n" +
                "\tunion all \n" +
                "\tselect aa.dutyArea, \n" +
                "\t\t0 shengrs,0 shengpc,0 shirs,0 shipc,0 qurs,0 qupc ,\n" +
                "\t\tsum(case aa.visitedDept when 87 then aa.rs else 0 end ) tqshengrs ,\n" +
                "\t\tsum(case aa.visitedDept when 87 then aa.pc else 0 end ) tqshengpc,\n" +
                "\t\tsum(case aa.visitedDept when 88 then aa.rs else 0 end ) tqshirs ,\n" +
                "\t\tsum(case aa.visitedDept when 88 then aa.pc else 0 end ) tqshipc,\n" +
                "\t\tsum(case aa.visitedDept when 89 then aa.rs else 0 end ) tqqurs ,\n" +
                "\t\tsum(case aa.visitedDept when 89 then aa.pc else 0 end ) tqqupc\n" +
                "\tfrom (\n" +
                "\t\tselect  dutyArea ,(case when  visitedDept=87 then 87 when visitedDept\n" +
                "\t\t=88 then 88 when visitedDept>=89 and visitedDept<=99 then 89 else 86 end) visitedDept,(visiterCount) rs ,1 pc \n" +
                "\t\t from  letterbaseinfo where registerTimef>='2020-11-11' and registerTimef<='2020-12-30') aa \n" +
                "\tgroup by  aa.dutyArea) bb  right join basicdata bc \n" +
                "\ton  bb.dutyArea = bc.id\n" +
                "\twhere  bc.baseDataTypeId=5\n" +
                "\tgroup by  bc.id,bc.dataValue";
        try {
            System.out.println("查询数据的sql:" + sql);
            inquiryStatistics = qr.query(conn, sql, new BeanListHandler<InquiryStatistics>(InquiryStatistics.class));

            return inquiryStatistics;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<ListOftheMasses> findAlll(String registerTimef) {
        List<ListOftheMasses> listOftheMasses = null;
        Connection conn = ConnUtil.getConn();
        String sql = "SELECT l.idf,l.registerTimef,le.letterNamef,l.visiterCount,l.thirdQuestionType,l.questionAffiliations,le.letterAddressf,b.dataValue FROM letterbaseinfo l,lettersinfo le,basicdata b WHERE l.letterIDf=le.idf AND b.id=l.overVisitf ";
        if (registerTimef != null && !"".equals("registerTimef")){
            sql += " and l.registerTimef like'%" +registerTimef+ "%'";
            System.out.println(sql);
        }

        try {
            listOftheMasses = qr.query(conn, sql, new BeanListHandler<ListOftheMasses>(ListOftheMasses.class));
            return listOftheMasses;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<PublicList> findas(String registerTimef) {
        List<PublicList> publicLists = null;
        Connection conn = ConnUtil.getConn();
        String sql = "SELECT l.idf,l.registerTimef,le.letterNamef,l.visiterCount,l.thirdQuestionType,l.questionAffiliations,le.letterAddressf FROM letterbaseinfo l,lettersinfo le WHERE l.letterIDf=le.idf";
        if (registerTimef != null && !"".equals("registerTimef")){
            sql += " and l.registerTimef like'%" +registerTimef+ "%'";
            System.out.println(sql);
        }
        try {
            publicLists = qr.query(conn, sql, new BeanListHandler<PublicList>(PublicList.class));
            return publicLists;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Object findss(IntegratedQuery idq) {
        List<IntegratedQuery> integratedQueries = null;
        Connection conn = ConnUtil.getConn();
        String sql = "SELECT le.idf,le.letterIDf,lett.letterNamef,le.registerTimef,le.letterTitlef,le.questionAffiliations,sy.truename,le.state FROM letterbaseinfo le,lettersinfo lett,sys_user sy WHERE le.letterIDf=lett.idf AND le.letterRegisterIdf=sy.UIDF";
        //1.总序号
        if (idq.getLetterIDF() != null && !"".equals(idq.getLetterIDF())){
            sql += " and le.letterIDf like'%" +idq.getLetterIDF()+ "%'";
            System.out.println(sql);
        }
        //2.信访人
        if (idq.getLetterNamef() != null && !"".equals(idq.getLetterNamef())){
            sql += " and lett.letterNamef like'%" +idq.getLetterNamef()+ "%'";
            System.out.println(sql);
        }
        //3.登记时间
        if (idq.getRegisterTimef() != null && !"".equals(idq.getRegisterTimef())){
            sql += " and le.registerTimef like'%" +idq.getRegisterTimef()+ "%'";
            System.out.println(sql);
        }
        //4.标题
        if (idq.getLetterTitlef() != null && !"".equals(idq.getLetterTitlef())){
            sql += " and le.letterTitlef like'%" +idq.getLetterTitlef()+ "%'";
            System.out.println(sql);
        }
        // 5.登记人
        if (idq.getTruename() != null && !"".equals(idq.getTruename())){
            sql += " and sy.truename like'%" +idq.getTruename()+ "%'";
            System.out.println(sql);
        }
        //6.状态
        if (idq.getState() != null && !"".equals(idq.getState())){
            sql += " and le.state like'%" +idq.getState()+ "%'";
            System.out.println(sql);
        }
            return this.queryListForPage(idq,sql,IntegratedQuery.class);

    }


}




