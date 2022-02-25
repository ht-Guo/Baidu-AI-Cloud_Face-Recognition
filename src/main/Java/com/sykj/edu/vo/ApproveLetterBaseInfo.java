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
    private int idf; //编号
    private int let_idf;//信访件编号
    private String suggestionContentf;//意见内容
    private int userId;//办理人编号
    private String fillTimef;//填写时间
    private int isAgreef;//是否同意
    private String letterPropertiesf;//建议属性类别
    private int sortid;//排列序号
    private String Astate;//办理状态
    private String endtime;//办理期限
    private int yellowWarning;//黄牌
    private int redWarning;//红牌

    //信访件基本信息
        private String  registreTimef;//登记时间
        private int letterRegisterIdf;//信访登记人编号
        private int letterSource;//信访来源
        private int isPublic;//是否公开
        private int letterIDf;//信访人编号
        private int natureType;//性质分类编号
        private int letterCount;//信访次数
        private int visitedDept;//曾访部门
         private String visitScope;//来访规模
         private int visiterCount;//来访人数
         private int dutyArea;//责任区
         private String happenAddressf;//事发单位或地址
         private String thirdQuestionType;//三级问题分类
         private int standQuestion;//突出问题
         private int visitExeceptionCasef;//来访异常情况编号
         private int overVisitf;//越级上访编号
         private String questionAffiliations;//问题所属单位
         private int approveLeader;//批示领导编号
         private String toPassDept;//转交来单位
         private String documentNof;//来文号
         private String toPassTimef;//转交来时间
         private int letterStylef;//来信形式编号
         private int letterReceiverf;//受信人编号
         private String letterReceiveTimef;//收信日期
         private String limitDatef;//办理时限
         private String acceptNumber;//受理形式哪几条
         private String letterItemf;//信访事项
         private int isRegist;//是否立案
         private String passDept;//转送单位
         private int letterTemplatef;//模板编号
         private String passLimitDatef;//回复时间
         private int letterNumf;//越秀区信访局编号
         private int isReply;//已答复还是转其他单位
         private String letterReplyContentf;//已答复内容
         private int thirdAccept;//受理形式3之选项
         private int isThirdEnd;//是否已三级终结
         private String letterTitlef;//标题
         private int state;//状态
    //附件表
    /**
     * 附件编号 aid
     * 所属信访件编号 letterBaseId
     * 附件名称 aname
     * 附件大小 asize
     * 附件类型 atype
     * 上传者标号 userid
     * 上传时间 atime
     * 附件所在路径 path
     * 备用 info
     * */


}
