package com.qfedu.service;

import com.qfedu.common.vo.PageVo;
import com.qfedu.common.vo.ResultVo;
import com.qfedu.domain.ShiTi;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ShiTiService {
    ResultVo insert(ShiTi shiTi);

    PageVo<ShiTi> queryAll(int index, int count);

    //总数量
    int queryCount();

    ResultVo deteleById(int id);

    ResultVo updataById(ShiTi shiTi);




    List<ShiTi> queryList();

    ShiTi queryShiti(int id, String daan);
}
