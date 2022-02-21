package com.sykj.edu.dao;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/21 8:23
  @package_Name: com.sykj.edu.dao
  @Class_Name: InitDao
  To change this template use File | Settings | File Templates.
*/

import com.sykj.edu.vo.Childs;

import java.util.List;

//登录功能权限
public interface InitDao {
    public List<Childs> findAllInit(int uidf);
}
