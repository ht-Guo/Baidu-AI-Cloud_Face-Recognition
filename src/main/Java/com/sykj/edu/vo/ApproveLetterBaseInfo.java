package com.sykj.edu.vo;

/**
  *Created by IntelliJ IDEA.
  *@User: guohaotian
  *@Date: 2022/2/24 16:46
  *@package_Name: com.sykj.edu.vo
  *@Class_Name: ApproveLetterBaseInfo
  *To change this template use File | Settings | File Templates.
*/

/**
 *待办件实体类
 * */
public class ApproveLetterBaseInfo {
    //流程审批明细表
    private int idf; //流程审批编号
    private String dataValue;//信访来源
    private String letterNamef;//信访人姓名
    private String letterMobilef;//信访人联系电话
    private String letterTitlef;//标题
    private String truename;//提交人
    private String registerTimef;//提交时间
    private String letterPropertiesf;//建议属性类别
    private int count;

    //信访人基本信息
    /**信访人: letterNamef String
    身份证:letterCardNof String
    联系电话: letterMobilef String
    工作单位:workDept String
    工作邮编: letterPostNof String
    联系地址: letterAddressf String
    联系地址邮编:letterAdsPostNof String
    常驻地址:letterHomeAddrf String
    户籍地址:letterOriRegAdsf String
     */

    private String letterCardNof;
    private String workDept;
    private String letterPostNof;
    private String letterAddressf;
    private String letterAdsPostNof;
    private String letterHomeAddrf;
    private String letterOriRegAdsf;

    //信访件基本信息
    /**登记人: letterRegisterName String
    信访标题: letterTitlef String
    信访来源: letterSource int
    是否公开:  isPublic int
    性质分类: natureType int
    信访次数: letterCount int
    曾访部门: visitedDept int
    来访规模: visitScope  String
    来访人数: visiterCount int
     */
    private String letterRegisterName;
    private int letterSource;
    private int isPublic;
    private int natureType;
    private int letterCount;
    private int visitedDept;
    private String visitScope;
    private int visiterCount;
    /**责任地区: dutyArea  int
    事发单位或地址: happenAddressf String
    问题分类: thirdQuestionType String
    突出问题: standQuestion int
    来访异常情况: visitExeceptionCasef int
    越级上访: overVisitf int
    问题所属单位: questionAffiliations String
    批示领导: approveLeader int
    转/交来单位: toPassDept String
     */
    private int dutyArea;
    private String happenAddressf;
    private String thirdQuestionType;
    private int standQuestion;
    private int visitExeceptionCasef;
    private int overVisitf;
    private String questionAffiliations;
    private int approveLeader;
    private String toPassDept;

   /**来文号: documentNof String
    转/交来时间: toPassTimef String
    来信形式: letterStylef int
    受信人: letterReceiverf int
    收信日期: letterReceiveTimef String
    信访事项: letterItemf String
     受理形式三之选项 thirdAccept int
     */
   private String documentNof;
   private String toPassTimef;
   private int letterStylef;
   private int letterReceiverf;
   private String letterReceiveTimef;
   private String letterItemf;
   private int thirdAccept;

   /**
    *基础数据编号 id int
    * 基础数据名称 dataValue String
    * 用户id uidf int
    * 用户真实姓名 truename
    * 信访件登记人编号 letterRegisterIdf
    * */
   private int id;
   private int uidf;
   private int letterRegisterIdf;

   /**
    * 附件编号 aid int
    * 所属信访件编号 letterBaseId int
    * 附件名称 aname String
    * 附件大小 asize int
    * 附件类型 atype String
    * 上传者标号 userid int
    * 上传时间 atime String
    * 附件所在路径 path Strnig
    * 备用 info String
    * */
   private int aid;
   private int letterBaseId;
   private String aname;
   private int asize;
   private String atype;
   private String atime;
   private String path;
   private String info;
   private int userid;

   /**
    *流程日志
    * fillTimef：完成日期
    * endtime：办理期限
    * */
   private String fillTimef;
   private String endtime;

   /**
    * did：部门编号
    * dname:部门名称
    * */
   private int did;
   private String dname;

   /**
    * 办理人编号
    * 信访件编号 let_idf
    *  意见内容 suggestionContentf
    * 办理人编号 userId
    *  办理时间 fillTimef
    * 是否同意 isAgreef
    * 建议属性类别 letterPropertiesf
    * 排列序号  sortid
    * 办理状态 state
    * 办理期限 endtime
    * */
   private int let_idf;
   private String suggestionContentf;
   private int userId;
   private int isAgreef;
   private int sortid;
   private String state;


    public ApproveLetterBaseInfo() {
    }

    public ApproveLetterBaseInfo(int idf, String dataValue, String letterNamef, String letterMobilef, String letterTitlef, String truename, String registerTimef, String letterPropertiesf, int count, String letterCardNof, String workDept, String letterPostNof, String letterAddressf, String letterAdsPostNof, String letterHomeAddrf, String letterOriRegAdsf, String letterRegisterName, int letterSource, int isPublic, int natureType, int letterCount, int visitedDept, String visitScope, int visiterCount, int dutyArea, String happenAddressf, String thirdQuestionType, int standQuestion, int visitExeceptionCasef, int overVisitf, String questionAffiliations, int approveLeader, String toPassDept, String documentNof, String toPassTimef, int letterStylef, int letterReceiverf, String letterReceiveTimef, String letterItemf, int thirdAccept, int id, int uidf, int letterRegisterIdf, int aid, int letterBaseId, String aname, int asize, String atype, String atime, String path, String info, int userid, String fillTimef, String endtime, int did, String dname) {
        this.idf = idf;
        this.dataValue = dataValue;
        this.letterNamef = letterNamef;
        this.letterMobilef = letterMobilef;
        this.letterTitlef = letterTitlef;
        this.truename = truename;
        this.registerTimef = registerTimef;
        this.letterPropertiesf = letterPropertiesf;
        this.count = count;
        this.letterCardNof = letterCardNof;
        this.workDept = workDept;
        this.letterPostNof = letterPostNof;
        this.letterAddressf = letterAddressf;
        this.letterAdsPostNof = letterAdsPostNof;
        this.letterHomeAddrf = letterHomeAddrf;
        this.letterOriRegAdsf = letterOriRegAdsf;
        this.letterRegisterName = letterRegisterName;
        this.letterSource = letterSource;
        this.isPublic = isPublic;
        this.natureType = natureType;
        this.letterCount = letterCount;
        this.visitedDept = visitedDept;
        this.visitScope = visitScope;
        this.visiterCount = visiterCount;
        this.dutyArea = dutyArea;
        this.happenAddressf = happenAddressf;
        this.thirdQuestionType = thirdQuestionType;
        this.standQuestion = standQuestion;
        this.visitExeceptionCasef = visitExeceptionCasef;
        this.overVisitf = overVisitf;
        this.questionAffiliations = questionAffiliations;
        this.approveLeader = approveLeader;
        this.toPassDept = toPassDept;
        this.documentNof = documentNof;
        this.toPassTimef = toPassTimef;
        this.letterStylef = letterStylef;
        this.letterReceiverf = letterReceiverf;
        this.letterReceiveTimef = letterReceiveTimef;
        this.letterItemf = letterItemf;
        this.thirdAccept = thirdAccept;
        this.id = id;
        this.uidf = uidf;
        this.letterRegisterIdf = letterRegisterIdf;
        this.aid = aid;
        this.letterBaseId = letterBaseId;
        this.aname = aname;
        this.asize = asize;
        this.atype = atype;
        this.atime = atime;
        this.path = path;
        this.info = info;
        this.userid = userid;
        this.fillTimef = fillTimef;
        this.endtime = endtime;
        this.did = did;
        this.dname = dname;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getIdf() {
        return idf;
    }

    public void setIdf(int idf) {
        this.idf = idf;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public String getLetterNamef() {
        return letterNamef;
    }

    public void setLetterNamef(String letterNamef) {
        this.letterNamef = letterNamef;
    }

    public String getLetterMobilef() {
        return letterMobilef;
    }

    public void setLetterMobilef(String letterMobilef) {
        this.letterMobilef = letterMobilef;
    }

    public String getLetterTitlef() {
        return letterTitlef;
    }

    public void setLetterTitlef(String letterTitlef) {
        this.letterTitlef = letterTitlef;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getRegisterTimef() {
        return registerTimef;
    }

    public void setRegisterTimef(String registerTimef) {
        this.registerTimef = registerTimef;
    }

    public String getLetterPropertiesf() {
        return letterPropertiesf;
    }

    public void setLetterPropertiesf(String letterPropertiesf) {
        this.letterPropertiesf = letterPropertiesf;
    }

    public String getLetterCardNof() {
        return letterCardNof;
    }

    public void setLetterCardNof(String letterCardNof) {
        this.letterCardNof = letterCardNof;
    }

    public String getWorkDept() {
        return workDept;
    }

    public void setWorkDept(String workDept) {
        this.workDept = workDept;
    }

    public String getLetterPostNof() {
        return letterPostNof;
    }

    public void setLetterPostNof(String letterPostNof) {
        this.letterPostNof = letterPostNof;
    }

    public String getLetterAddressf() {
        return letterAddressf;
    }

    public void setLetterAddressf(String letterAddressf) {
        this.letterAddressf = letterAddressf;
    }

    public String getLetterAdsPostNof() {
        return letterAdsPostNof;
    }

    public void setLetterAdsPostNof(String letterAdsPostNof) {
        this.letterAdsPostNof = letterAdsPostNof;
    }

    public String getLetterHomeAddrf() {
        return letterHomeAddrf;
    }

    public void setLetterHomeAddrf(String letterHomeAddrf) {
        this.letterHomeAddrf = letterHomeAddrf;
    }

    public String getLetterOriRegAdsf() {
        return letterOriRegAdsf;
    }

    public void setLetterOriRegAdsf(String letterOriRegAdsf) {
        this.letterOriRegAdsf = letterOriRegAdsf;
    }

    public String getLetterRegisterName() {
        return letterRegisterName;
    }

    public void setLetterRegisterName(String letterRegisterName) {
        this.letterRegisterName = letterRegisterName;
    }

    public int getLetterSource() {
        return letterSource;
    }

    public void setLetterSource(int letterSource) {
        this.letterSource = letterSource;
    }

    public int getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(int isPublic) {
        this.isPublic = isPublic;
    }

    public int getNatureType() {
        return natureType;
    }

    public void setNatureType(int natureType) {
        this.natureType = natureType;
    }

    public int getLetterCount() {
        return letterCount;
    }

    public void setLetterCount(int letterCount) {
        this.letterCount = letterCount;
    }

    public int getVisitedDept() {
        return visitedDept;
    }

    public void setVisitedDept(int visitedDept) {
        this.visitedDept = visitedDept;
    }

    public String getVisitScope() {
        return visitScope;
    }

    public void setVisitScope(String visitScope) {
        this.visitScope = visitScope;
    }

    public int getVisiterCount() {
        return visiterCount;
    }

    public void setVisiterCount(int visiterCount) {
        this.visiterCount = visiterCount;
    }

    public int getDutyArea() {
        return dutyArea;
    }

    public void setDutyArea(int dutyArea) {
        this.dutyArea = dutyArea;
    }

    public String getHappenAddressf() {
        return happenAddressf;
    }

    public void setHappenAddressf(String happenAddressf) {
        this.happenAddressf = happenAddressf;
    }

    public String getThirdQuestionType() {
        return thirdQuestionType;
    }

    public void setThirdQuestionType(String thirdQuestionType) {
        this.thirdQuestionType = thirdQuestionType;
    }

    public int getStandQuestion() {
        return standQuestion;
    }

    public void setStandQuestion(int standQuestion) {
        this.standQuestion = standQuestion;
    }

    public int getVisitExeceptionCasef() {
        return visitExeceptionCasef;
    }

    public void setVisitExeceptionCasef(int visitExeceptionCasef) {
        this.visitExeceptionCasef = visitExeceptionCasef;
    }

    public int getOverVisitf() {
        return overVisitf;
    }

    public void setOverVisitf(int overVisitf) {
        this.overVisitf = overVisitf;
    }

    public String getQuestionAffiliations() {
        return questionAffiliations;
    }

    public void setQuestionAffiliations(String questionAffiliations) {
        this.questionAffiliations = questionAffiliations;
    }

    public int getApproveLeader() {
        return approveLeader;
    }

    public void setApproveLeader(int approveLeader) {
        this.approveLeader = approveLeader;
    }

    public String getToPassDept() {
        return toPassDept;
    }

    public void setToPassDept(String toPassDept) {
        this.toPassDept = toPassDept;
    }

    public String getDocumentNof() {
        return documentNof;
    }

    public void setDocumentNof(String documentNof) {
        this.documentNof = documentNof;
    }

    public String getToPassTimef() {
        return toPassTimef;
    }

    public void setToPassTimef(String toPassTimef) {
        this.toPassTimef = toPassTimef;
    }

    public int getLetterStylef() {
        return letterStylef;
    }

    public void setLetterStylef(int letterStylef) {
        this.letterStylef = letterStylef;
    }

    public int getLetterReceiverf() {
        return letterReceiverf;
    }

    public void setLetterReceiverf(int letterReceiverf) {
        this.letterReceiverf = letterReceiverf;
    }

    public String getLetterReceiveTimef() {
        return letterReceiveTimef;
    }

    public void setLetterReceiveTimef(String letterReceiveTimef) {
        this.letterReceiveTimef = letterReceiveTimef;
    }

    public String getLetterItemf() {
        return letterItemf;
    }

    public void setLetterItemf(String letterItemf) {
        this.letterItemf = letterItemf;
    }

    public int getThirdAccept() {
        return thirdAccept;
    }

    public void setThirdAccept(int thirdAccept) {
        this.thirdAccept = thirdAccept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUidf() {
        return uidf;
    }

    public void setUidf(int uidf) {
        this.uidf = uidf;
    }

    public int getLetterRegisterIdf() {
        return letterRegisterIdf;
    }

    public void setLetterRegisterIdf(int letterRegisterIdf) {
        this.letterRegisterIdf = letterRegisterIdf;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getLetterBaseId() {
        return letterBaseId;
    }

    public void setLetterBaseId(int letterBaseId) {
        this.letterBaseId = letterBaseId;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAsize() {
        return asize;
    }

    public void setAsize(int asize) {
        this.asize = asize;
    }

    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype;
    }

    public String getAtime() {
        return atime;
    }

    public void setAtime(String atime) {
        this.atime = atime;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getFillTimef() {
        return fillTimef;
    }

    public void setFillTimef(String fillTimef) {
        this.fillTimef = fillTimef;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
