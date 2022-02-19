package com.sykj.edu.controller;

import com.sykj.edu.dao.VipManageDao;
import com.sykj.edu.vo.VipManageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class VipManageController {
          @Autowired
    private VipManageDao vipDao;
          @RequestMapping("findAll")
          @ResponseBody
      public Object findAll(String letterOriRegAdsf, String letterNamef){
              List<VipManageVo> vipmanages = vipDao.findAll(letterOriRegAdsf,letterNamef);
              return vipmanages;
          }
}
