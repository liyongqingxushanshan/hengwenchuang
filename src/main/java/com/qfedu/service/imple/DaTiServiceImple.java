package com.qfedu.service.imple;

import com.qfedu.dao.DaTiMapper;
import com.qfedu.domain.DaTi;
import com.qfedu.service.DaTiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DaTiServiceImple implements DaTiService {

    @Autowired
    private DaTiMapper mapper;

    @Override
    public boolean insert(DaTi daTi) {
        return mapper.insert(daTi)>0;
    }

    @Override
    public List<DaTi> queryAll(int csid) {
        return mapper.queryAll(csid);
    }
}
