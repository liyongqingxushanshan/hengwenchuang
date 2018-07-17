package com.qfedu.web.controller;

import com.qfedu.common.vo.PageVo;
import com.qfedu.common.vo.ResultVo;
import com.qfedu.domain.ShiTi;
import com.qfedu.service.ShiTiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ShiTiController {
    @Autowired
    private ShiTiService service;

    // 查询 --分页
    @RequestMapping(value = "allShiTi.do")
    @ResponseBody
    public PageVo<ShiTi> queryPage(int page, int limit) {
        return service.queryAll(page, limit);
    }

    // 删除
    @RequestMapping(value = "shitidelete.do", method = {RequestMethod.POST})
    @ResponseBody
    public ResultVo delete(int id) {
        return service.deteleById(id);
    }

    //试题编辑
    @RequestMapping(value = "shitiedit.do")
    @ResponseBody
    public ResultVo delete(int id, String timu, String daan) {
        ShiTi shiTi = new ShiTi();
        shiTi.setId(id);
        shiTi.setDaan(daan);
        shiTi.setTimu(timu);
        return service.updataById(shiTi);
    }
    //试题编辑
    @RequestMapping(value = "shitiadd.do")
    @ResponseBody
    public ResultVo delete(String timu, String daan) {
        ShiTi shiTi = new ShiTi();
        shiTi.setDaan(daan);
        shiTi.setTimu(timu);
        return service.insert(shiTi);
    }

    @RequestMapping(value = "queryList.do")
    @ResponseBody
    public List<ShiTi> queryList() {
        return service.queryList();
    }
}
