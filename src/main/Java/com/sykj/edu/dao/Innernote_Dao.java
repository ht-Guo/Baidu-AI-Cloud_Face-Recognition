package com.sykj.edu.dao;


import com.sykj.edu.util.VCommList;
import com.sykj.edu.vo.Innernote;
import com.sykj.edu.vo.Type;

import java.util.List;

/**
 * @Date 2022/3/1 - 10:51
 */
public interface Innernote_Dao {
    //查询显示
    public VCommList findAll(Innernote innernote);
    //删除
    public Integer del(Integer msgid);
    //添加
    public Integer add(Innernote innernote);
    //查询所有信息类型
    List <Type> typeAll();
    //根据ID查询信息
    public Innernote find(Integer msgid);
}
