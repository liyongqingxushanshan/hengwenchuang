package com.qfedu.service;

import com.qfedu.domain.DaTi;

import java.util.List;

public interface DaTiService {
    boolean insert(DaTi daTi);

    List<DaTi> queryAll(int csid);
}
