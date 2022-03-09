package com.sykj.edu.dao;


import com.sykj.edu.util.VCommList;
import com.sykj.edu.vo.Inform;

import java.util.Date;
import java.util.List;

/**
 * @Date 2022/2/28 - 20:17
 */
public interface Inform_Dao {

    //查询显示
    public VCommList findAll(Inform inform);
    //删除
    public Integer del(Integer idf);
    //添加
    public Integer add(Inform inform);
    //修改
    public Integer upd(Inform inform, Integer idf);
    //根据ID查询信息
    public Inform find(Integer idf);
}
