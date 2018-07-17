package com.qfedu.dao;


import com.qfedu.domain.CeShi;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CeShiMapper {
    int insert(CeShi ceShi);
    List<CeShi> queryAll(@Param("index") int index, @Param("count") int count);
    //总数量
    int queryCount();

    int deteleById(int id);
}
