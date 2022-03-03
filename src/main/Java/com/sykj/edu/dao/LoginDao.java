package com.sykj.edu.dao;

import com.sykj.edu.vo.LoginVo;


/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/18 10:38
  @package_Name: com.sykj.edu.Dao
  @Class_Name: LoginDao
  To change this template use File | Settings | File Templates.
*/
public interface LoginDao {
    public LoginVo Login(String username, String password);
}
