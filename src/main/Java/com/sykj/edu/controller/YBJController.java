package com.sykj.edu.controller;

/**
 * Created by IntelliJ IDEA.
 *
 * @User: guohaotian
 * @Date: 2022/2/28 17:27
 * @package_Name: com.sykj.edu.controller
 * @Class_Name: YBJController
 * To change this template use File | Settings | File Templates.
 */

import com.sykj.edu.dao.YBJDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 已办结
 * */

@RequestMapping("YBJ")
@Controller
public class YBJController {
    @Autowired
    private YBJDao dao;

    @RequestMapping("Find")
    @ResponseBody
    public Object Find(Integer userId,String letterNamef,String letterTitlef,String letterSource,Integer page,Integer limit){
        Object o = dao.FindAllLett(userId, letterNamef, letterTitlef, letterSource, page, limit);
        return o;
    }

    /**
     * 查询所有信访来源
     * */
    @RequestMapping("FindAll")
    @ResponseBody
    public Object FindAll(){
        Object o = dao.FindAll();
        return o;
    }
}
