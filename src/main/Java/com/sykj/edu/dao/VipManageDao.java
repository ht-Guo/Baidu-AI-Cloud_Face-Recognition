package com.sykj.edu.dao;

import com.sykj.edu.vo.VipManageVo;

import java.util.List;

public interface VipManageDao {
       public List<VipManageVo> findAll(String letterOriRegAdsf, String letterNamef);
}

