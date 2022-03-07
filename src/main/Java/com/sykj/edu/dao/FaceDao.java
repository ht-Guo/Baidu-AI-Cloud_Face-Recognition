package com.sykj.edu.dao;

import com.sykj.edu.vo.FaceVo;

import java.util.List;

//bdy人脸库
public interface FaceDao {
    /**
     *查询所有信息
     **/
    public List<FaceVo> FindAll();

    /**
     * 通过百度云编号查询uidf
     * */
    public Object FindUidf(String bdy_userId);

    /**
     * 是否已经录入人脸
     * */
    public FaceVo isFaceEmpty(String uidf);

    /**
     * 录入人脸
     * */
    public int insertFace(String uidf);
}
