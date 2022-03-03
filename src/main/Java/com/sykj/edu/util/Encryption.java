package com.sykj.edu.util;

/**
  *Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/18 9:14
  @package_Name: com.sykj.edu.util
  @Class_Name: Encryption
  To change this template use File | Settings | File Templates.
*/


import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//加密类
public class Encryption {
    public static String md5(String data) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            return Hex.encodeHexString(md.digest(data.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}
