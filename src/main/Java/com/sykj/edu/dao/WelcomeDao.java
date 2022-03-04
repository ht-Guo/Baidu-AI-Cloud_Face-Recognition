package com.sykj.edu.dao;

/**
 * Created by IntelliJ IDEA.
 * @Description:内部短消息前五条数据
 * @User:guohaotian
 * @Date: 2022/3/3 20:29
 * @package_Name: com.sykj.edu.dao
 * @Class_Name: NBDXXDao
 * To change this template use File | Settings | File Templates.
 */

public interface WelcomeDao {
    /**
     * 查询属于本人的前五条内部消息
     * */
    public Object FindFive(Integer uidf);

    /**
     * 查询五条通知通告
     * */
    public Object FindInfoissue();
}
