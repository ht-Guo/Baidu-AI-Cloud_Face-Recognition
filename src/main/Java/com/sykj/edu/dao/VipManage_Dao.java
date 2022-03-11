package com.sykj.edu.dao;


import com.sykj.edu.util.VCommList;
import com.sykj.edu.vo.VipManage;

public interface VipManage_Dao {
      public VCommList queryallList(VipManage vipManage);

      public Integer toinsert(VipManage v);


}
