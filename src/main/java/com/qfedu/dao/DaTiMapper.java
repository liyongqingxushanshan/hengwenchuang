package com.qfedu.dao;


import com.qfedu.domain.DaTi;

import java.util.List;

public interface DaTiMapper {
    int insert(DaTi daTi);

    List<DaTi> queryAll(int csid);

    List<DaTi> queryAll2(int csid);
}
