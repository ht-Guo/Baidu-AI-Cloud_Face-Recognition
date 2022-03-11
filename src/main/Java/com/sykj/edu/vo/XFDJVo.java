package com.sykj.edu.vo;

public class XFDJVo {
    //信访人信息
    private String letterNamef;//姓名
    private String cardTypef;//证件类型编号
    private String letterCardNof;//信访人证件号
    private String letterMobilef;//联系电话
    private String workDept;//工作单位
    private String letterPostNof;//单位邮编
    private String letterAddressf;//联系地址
    private String letterAdsPostNof;//联系地址邮编
    private String letterHomeAddrf; //常住地址
    private String letterOriRegAdsf; //户籍地址
    private String isVIPf; //重点维稳对象

    //******************************************************************************
   //信访件基本信息
    private Integer idf;//信访件编号
    private String registerTimef;// 登记时间
    private Integer letterRegisterIdf;//信访登记人编号
    private Integer letterSource;//信访来源
    private Integer isPublic;//是否公开
    private Integer letterIDf;//信访人编号
    private Integer natureType;//性质分类编号
    private Integer letterCount;//信访次数
    private Integer visitedDept;//曾访部门
    private String visitScope;//来访规模
    private Integer visiterCount;//来访人数
    private Integer dutyArea;//责任区
    private String happenAddressf;//事发单位或地址
    private String thirdQuestionType;//三级问题分类
    private Integer standQuestion;//突出问题
    private Integer visitExeceptionCasef;//来访异常情况编号
    private Integer overVisitf;//越级上访编号
    private String questionAffiliations;//问题所属单位
    private Integer approveLeader;//批示领导编号
    private String toPassDept;//转交来单位
    private String documentNof;//来文号
    private String toPassTimef;//转交来时间
    private Integer letterStylef;//来信形式编号
    private Integer letterReceiverf;//受信人编号
    private String letterReceiveTimef;//收信日期
    private String limitDatef;//办理时限
    private String acceptNumber;//受理形式哪几条
    private String letterItemf;//信访事项
    private Integer isRegist;//是否立案
    private String passDept;//转送单位
    private Integer letterTemplatef;//模板编号
    private String passLimitDatef;//回复时间
    private Integer letterNumf;//越秀区信访局编号
    private Integer isReply;//已答复还是转其他单位
    private String letterReplyContentf;//已答复内容
    private String letterPropertiesf;//属性类别
    private Integer thirdAccept;//受理形式3之选项
    private Integer isThirdEnd;//是否已三级终结
    private String letterTitlef;//标题
    private Integer state;//状态

    //重点对象维稳表
    private int vipIDf;//信访人编号
    private int userIdf;//登记人编号
    private String recordDatef;//登记日期
    private int recordTypef;//登记类别
    private String titlef;//标题
    private String contentf;//登记内容
    private String result;//处理意见

    //审批流程表
     private int let_idf;// 信访件编号
    private String suggestionContentf;//意见内容
    private int userId;//办理人编号
    private String  createtime;//待办时间
    private String fillTimef;//填写时间
    private int isAgreef;//是否同意
    private int sortid;//排列序号
    private String endtime;//办理期限
    private int yellowWarning;//黄牌
    private int redWarning;//红牌
    //组织单位
    private Integer did;//单位编号
    private String dname;//单位名称

    //领导编号领导名字
    private Integer uidf;
    private String truename;

    public Integer getUidf() {
        return uidf;
    }

    public void setUidf(Integer uidf) {
        this.uidf = uidf;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public int getLet_idf() {
        return let_idf;
    }

    public void setLet_idf(int let_idf) {
        this.let_idf = let_idf;
    }

    public String getSuggestionContentf() {
        return suggestionContentf;
    }

    public void setSuggestionContentf(String suggestionContentf) {
        this.suggestionContentf = suggestionContentf;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getFillTimef() {
        return fillTimef;
    }

    public void setFillTimef(String fillTimef) {
        this.fillTimef = fillTimef;
    }

    public int getIsAgreef() {
        return isAgreef;
    }

    public void setIsAgreef(int isAgreef) {
        this.isAgreef = isAgreef;
    }

    public int getSortid() {
        return sortid;
    }

    public void setSortid(int sortid) {
        this.sortid = sortid;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public int getYellowWarning() {
        return yellowWarning;
    }

    public void setYellowWarning(int yellowWarning) {
        this.yellowWarning = yellowWarning;
    }

    public int getRedWarning() {
        return redWarning;
    }

    public void setRedWarning(int redWarning) {
        this.redWarning = redWarning;
    }

    public int getVipIDf() {
        return vipIDf;
    }

    public void setVipIDf(int vipIDf) {
        this.vipIDf = vipIDf;
    }

    public int getUserIdf() {
        return userIdf;
    }

    public void setUserIdf(int userIdf) {
        this.userIdf = userIdf;
    }

    public String getRecordDatef() {
        return recordDatef;
    }

    public void setRecordDatef(String recordDatef) {
        this.recordDatef = recordDatef;
    }

    public int getRecordTypef() {
        return recordTypef;
    }

    public void setRecordTypef(int recordTypef) {
        this.recordTypef = recordTypef;
    }

    public String getTitlef() {
        return titlef;
    }

    public void setTitlef(String titlef) {
        this.titlef = titlef;
    }

    public String getContentf() {
        return contentf;
    }

    public void setContentf(String contentf) {
        this.contentf = contentf;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }







    /**
     * 基础数据
     * **/
    private int id;
    private String dataValue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCardTypef() {
        return cardTypef;
    }

    public void setCardTypef(String cardTypef) {
        this.cardTypef = cardTypef;
    }

    public String getLetterCardNof() {
        return letterCardNof;
    }

    public void setLetterCardNof(String letterCardNof) {
        this.letterCardNof = letterCardNof;
    }

    public String getLetterMobilef() {
        return letterMobilef;
    }

    public void setLetterMobilef(String letterMobilef) {
        this.letterMobilef = letterMobilef;
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

    public String getIsVIPf() {
        return isVIPf;
    }

    public void setIsVIPf(String isVIPf) {
        this.isVIPf = isVIPf;
    }

    public Integer getIdf() {
        return idf;
    }

    public void setIdf(Integer idf) {
        this.idf = idf;
    }

    public String getRegisterTimef() {
        return registerTimef;
    }

    public void setRegisterTimef(String registerTimef) {
        this.registerTimef = registerTimef;
    }

    public Integer getLetterRegisterIdf() {
        return letterRegisterIdf;
    }

    public void setLetterRegisterIdf(Integer letterRegisterIdf) {
        this.letterRegisterIdf = letterRegisterIdf;
    }

    public Integer getLetterSource() {
        return letterSource;
    }

    public void setLetterSource(Integer letterSource) {
        this.letterSource = letterSource;
    }

    public Integer getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    public Integer getLetterIDf() {
        return letterIDf;
    }

    public void setLetterIDf(Integer letterIDf) {
        this.letterIDf = letterIDf;
    }

    public Integer getNatureType() {
        return natureType;
    }

    public void setNatureType(Integer natureType) {
        this.natureType = natureType;
    }

    public Integer getLetterCount() {
        return letterCount;
    }

    public void setLetterCount(Integer letterCount) {
        this.letterCount = letterCount;
    }

    public Integer getVisitedDept() {
        return visitedDept;
    }

    public void setVisitedDept(Integer visitedDept) {
        this.visitedDept = visitedDept;
    }

    public String getVisitScope() {
        return visitScope;
    }

    public void setVisitScope(String visitScope) {
        this.visitScope = visitScope;
    }

    public Integer getVisiterCount() {
        return visiterCount;
    }

    public void setVisiterCount(Integer visiterCount) {
        this.visiterCount = visiterCount;
    }

    public Integer getDutyArea() {
        return dutyArea;
    }

    public void setDutyArea(Integer dutyArea) {
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

    public Integer getStandQuestion() {
        return standQuestion;
    }

    public void setStandQuestion(Integer standQuestion) {
        this.standQuestion = standQuestion;
    }

    public Integer getVisitExeceptionCasef() {
        return visitExeceptionCasef;
    }

    public void setVisitExeceptionCasef(Integer visitExeceptionCasef) {
        this.visitExeceptionCasef = visitExeceptionCasef;
    }

    public Integer getOverVisitf() {
        return overVisitf;
    }

    public void setOverVisitf(Integer overVisitf) {
        this.overVisitf = overVisitf;
    }

    public String getQuestionAffiliations() {
        return questionAffiliations;
    }

    public void setQuestionAffiliations(String questionAffiliations) {
        this.questionAffiliations = questionAffiliations;
    }

    public Integer getApproveLeader() {
        return approveLeader;
    }

    public void setApproveLeader(Integer approveLeader) {
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

    public Integer getLetterStylef() {
        return letterStylef;
    }

    public void setLetterStylef(Integer letterStylef) {
        this.letterStylef = letterStylef;
    }

    public Integer getLetterReceiverf() {
        return letterReceiverf;
    }

    public void setLetterReceiverf(Integer letterReceiverf) {
        this.letterReceiverf = letterReceiverf;
    }

    public String getLetterReceiveTimef() {
        return letterReceiveTimef;
    }

    public void setLetterReceiveTimef(String letterReceiveTimef) {
        this.letterReceiveTimef = letterReceiveTimef;
    }

    public String getLimitDatef() {
        return limitDatef;
    }

    public void setLimitDatef(String limitDatef) {
        this.limitDatef = limitDatef;
    }

    public String getAcceptNumber() {
        return acceptNumber;
    }

    public void setAcceptNumber(String acceptNumber) {
        this.acceptNumber = acceptNumber;
    }

    public String getLetterItemf() {
        return letterItemf;
    }

    public void setLetterItemf(String letterItemf) {
        this.letterItemf = letterItemf;
    }

    public Integer getIsRegist() {
        return isRegist;
    }

    public void setIsRegist(Integer isRegist) {
        this.isRegist = isRegist;
    }

    public String getPassDept() {
        return passDept;
    }

    public void setPassDept(String passDept) {
        this.passDept = passDept;
    }

    public Integer getLetterTemplatef() {
        return letterTemplatef;
    }

    public void setLetterTemplatef(Integer letterTemplatef) {
        this.letterTemplatef = letterTemplatef;
    }

    public String getPassLimitDatef() {
        return passLimitDatef;
    }

    public void setPassLimitDatef(String passLimitDatef) {
        this.passLimitDatef = passLimitDatef;
    }

    public Integer getLetterNumf() {
        return letterNumf;
    }

    public void setLetterNumf(Integer letterNumf) {
        this.letterNumf = letterNumf;
    }

    public Integer getIsReply() {
        return isReply;
    }

    public void setIsReply(Integer isReply) {
        this.isReply = isReply;
    }

    public String getLetterReplyContentf() {
        return letterReplyContentf;
    }

    public void setLetterReplyContentf(String letterReplyContentf) {
        this.letterReplyContentf = letterReplyContentf;
    }

    public String getLetterPropertiesf() {
        return letterPropertiesf;
    }

    public void setLetterPropertiesf(String letterPropertiesf) {
        this.letterPropertiesf = letterPropertiesf;
    }

    public Integer getThirdAccept() {
        return thirdAccept;
    }

    public void setThirdAccept(Integer thirdAccept) {
        this.thirdAccept = thirdAccept;
    }

    public Integer getIsThirdEnd() {
        return isThirdEnd;
    }

    public void setIsThirdEnd(Integer isThirdEnd) {
        this.isThirdEnd = isThirdEnd;
    }

    public String getLetterTitlef() {
        return letterTitlef;
    }

    public void setLetterTitlef(String letterTitlef) {
        this.letterTitlef = letterTitlef;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
