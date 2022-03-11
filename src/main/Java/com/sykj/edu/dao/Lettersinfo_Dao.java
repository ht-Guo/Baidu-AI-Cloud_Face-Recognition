package com.sykj.edu.dao;


import com.sykj.edu.util.VCommList;
import com.sykj.edu.vo.Lettersinfo;

public interface Lettersinfo_Dao {
        VCommList queryallList(Lettersinfo vip);

        Integer todelete(Integer idf);

        public Integer toinsert(Lettersinfo v);

        public Lettersinfo toupdate(Integer idf);

        public Integer update(Lettersinfo vi);
}

