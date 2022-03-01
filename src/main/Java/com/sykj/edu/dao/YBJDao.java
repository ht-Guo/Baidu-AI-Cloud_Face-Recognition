package com.sykj.edu.dao;

/**
 * Created by IntelliJ IDEA.
 *
 * @User: guohaotian
 * @Date: 2022/2/28 17:27
 * @package_Name: com.sykj.edu.dao
 * @Class_Name: YBJDao
 * To change this template use File | Settings | File Templates.
 */
public interface YBJDao {

    /**
     * 根据用户id查询信访件信息
     *  信访人姓名、letterNamef,
     * 标题、letterTitlef
     *  信访来源：  letterSource
     * 模糊查询
     *
     *
     * */

    public Object FindAllLett(Integer userId,String letterNamef,String letterTitlef,String letterSource,Integer page,Integer limit);

    /**
     * 查询所有信访来源
     * */
    public Object FindAll();
}
