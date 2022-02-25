package com.sykj.edu.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/24 8:51
  @package_Name: com.sykj.edu.util
  @Class_Name: DateUtil
  To change this template use File | Settings | File Templates.
*/
//获取系统时间
public class DateUtil {
    public static String getDate(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        return format;
    }
}
