package com.qfedu.service;

import com.qfedu.common.vo.PageVo;
import com.qfedu.common.vo.ResultVo;
import com.qfedu.domain.CeShi;


public interface CeShiService {
    boolean insert(CeShi ceShi);
    PageVo<CeShi> queryAll(int index, int count);
    int queryCount();
    ResultVo deteleById(int id);
}
