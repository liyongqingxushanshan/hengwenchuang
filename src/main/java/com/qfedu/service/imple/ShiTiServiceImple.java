package com.qfedu.service.imple;

import com.qfedu.common.vo.PageVo;
import com.qfedu.common.vo.ResultVo;
import com.qfedu.dao.ShiTiMapper;
import com.qfedu.domain.ShiTi;
import com.qfedu.service.ShiTiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiTiServiceImple implements ShiTiService {

    @Autowired
    private ShiTiMapper mapper;

    @Override
    public ResultVo insert(ShiTi shiTi) {
        if (mapper.insert(shiTi) > 0) {
            return ResultVo.setOK("新增成功");
        } else {
            return ResultVo.setERROR("新增失败");
        }
    }

    @Override
    public PageVo<ShiTi> queryAll(int index, int count) {
        PageVo<ShiTi> pageVo = new PageVo<>();
        pageVo.setCode(0);
        pageVo.setData(mapper.queryAll((index - 1) * count, count));
        pageVo.setCount(mapper.queryCount());
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

    @Override
    public ResultVo updataById(ShiTi shiTi) {
        if (mapper.updataById(shiTi) > 0) {
            return ResultVo.setOK("编辑成功");
        } else {
            return ResultVo.setERROR("编辑失败");
        }
    }

    @Override
    public List<ShiTi> queryList() {
        return mapper.queryList();
    }

    @Override
    public ShiTi queryShiti(int id, String daan) {
        return mapper.queryShiti(id, daan);
    }
}
