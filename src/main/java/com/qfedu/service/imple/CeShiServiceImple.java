package com.qfedu.service.imple;

import com.qfedu.common.vo.PageVo;
import com.qfedu.common.vo.ResultVo;
import com.qfedu.dao.CeShiMapper;
import com.qfedu.dao.DaTiMapper;
import com.qfedu.domain.CeShi;
import com.qfedu.domain.DaTi;
import com.qfedu.domain.ShiTi;
import com.qfedu.service.CeShiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CeShiServiceImple implements CeShiService {
    @Autowired
    private CeShiMapper mapper;
    @Autowired
    private DaTiMapper daTiMapper;
    @Override
    public boolean insert(CeShi ceShi) {
        return mapper.insert(ceShi) > 0;
    }

    @Override
    public PageVo<CeShi> queryAll(int index, int count) {
        PageVo<CeShi> pageVo = new PageVo<>();
        pageVo.setCode(0);
        pageVo.setData(mapper.queryAll((index - 1) * count, count));
        pageVo.setCount(mapper.queryCount());
        for (int i = 0; i < pageVo.getData().size(); i++) {
            CeShi ceShi =pageVo.getData().get(i);
            List<DaTi> list = daTiMapper.queryAll2(ceShi.getId());
            ceShi.setScore(list.size()*10);
        }
        return pageVo;
    }

    @Override
    public int queryCount() {
        return mapper.queryCount();
    }

    @Override
    public ResultVo deteleById(int id) {
        // TODO Auto-generated method stub
        if (mapper.deteleById(id) > 0) {
            return ResultVo.setOK("删除成功");
        } else {
            return ResultVo.setERROR("删除失败");
        }
    }
}
