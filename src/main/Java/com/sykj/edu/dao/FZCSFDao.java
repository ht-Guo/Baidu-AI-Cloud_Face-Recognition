package com.sykj.edu.dao;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @User: guohaotian
 * @Date: 2022/2/28 15:35
 * @package_Name: com.sykj.edu.dao
 * @Class_Name: FZCSFDao
 * To change this template use File | Settings | File Templates.
 */
public interface FZCSFDao {
    //当前操作人员进行办理的事项（排除属性类型为：非正常上访、敏感时期上访）
    /**
     *  当前操作人: userId
     *  信访标题：letterTitlef
     *  信访人姓名：letterNamef
     *  提交时间：registerTimef
     * */
    public List FindAll(Integer userId, String letterTitlef, String letterNamef, String registerTimef, Integer page, Integer limit);
    /**
     * 信访人基本信息，信访件基本信息
     * */
    public Object FindApp(Integer idf);


    /**
     * 信访来源 性质分类 曾访部门 责任地区 突出问题 来访异常情况 越级上访  来信形式
     * */
    public Object FindBasic(String baseValue);


    /**
     * 批示领导 受信人
     * */
    public Object FindSysUser();

    /**
     * 增加附件表(信访审批件id,附件名称，附件大小，附件类型,文件路径)
     * */
    public int InsertAcc(Integer idf,String aname,Integer asize,String atype,String path,Integer userid);

    /**
     * 查询当前待办件附件信息
     * */
    public Object FindAccessories(Integer idf,Integer page,Integer limit);

    /**
     * 办理流程
     * */
    public Object FindLC(Integer idf,Integer page,Integer limit);

    /**
     * 查询所有部门id和部门名称
     */
    public Object FindAllDepartment();

    /**
     * 根据部门id查询
     * */
    public Object FindSysUser(Integer did);

    /**
     * 发送审批流程，修改办理状态
     * */
    public Object UpdateApproveInfo(Integer idf,String suggestionContentf,Integer isAgreef,String letterPropertiesf,Integer isend,Integer personnel);
    /**
     * 根据信访流程id查询信访件中的登记人id
     * */
    public Object FindLetterRegisterIdf(Integer idf);
}
