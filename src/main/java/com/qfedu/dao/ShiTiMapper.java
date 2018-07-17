package com.qfedu.dao;


import com.qfedu.domain.ShiTi;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShiTiMapper {
    int insert(ShiTi shiTi);

    List<ShiTi> queryAll(@Param("index") int index, @Param("count") int count);

    //总数量
    int queryCount();

    int deteleById(int id);

    int updataById(ShiTi shiTi);

    List<ShiTi> queryList();

    ShiTi queryShiti(@Param("id") int id, @Param("daan") String daan);
}
