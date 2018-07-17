package com.qfedu.web.controller;

import com.qfedu.common.vo.PageVo;
import com.qfedu.common.vo.ResultVo;
import com.qfedu.domain.CeShi;
import com.qfedu.domain.DaTi;
import com.qfedu.domain.ShiTi;
import com.qfedu.domain.User;
import com.qfedu.service.CeShiService;
import com.qfedu.service.DaTiService;
import com.qfedu.service.ShiTiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CeShiController {
    @Autowired
    private CeShiService service;
    @Autowired
    private DaTiService daTiService;
    @Autowired
    private ShiTiService shiTiService;

    @RequestMapping(value = "/addceshi.do")
    @ResponseBody
    public ResultVo addceshi(int[] id, String[] daan, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        CeShi ceShi = new CeShi();
        ceShi.setUid(user.getId());
        ceShi.setUsername(user.getUsername());
        if (service.insert(ceShi)) {
            for (int i = 0; i < id.length; i++) {
                DaTi daTi = new DaTi();
                ShiTi shiTi = shiTiService.queryShiti(id[i], daan[i]);
                if (shiTi != null) {
                    daTi.setFlag(1);
                } else {
                    daTi.setFlag(0);
                }
                daTi.setCsid(ceShi.getId());
                daTi.setSid(id[i]);
                daTi.setDati(daan[i]);
                daTiService.insert(daTi);
            }
        } else {
            return ResultVo.setERROR("交卷失败");
        }
        return ResultVo.setOK("交卷成功");
    }


    @RequestMapping(value = "allceshi.do")
    @ResponseBody
    public PageVo<CeShi> queryPage(int page, int limit) {
        return service.queryAll(page, limit);
    }

    // 删除
    @RequestMapping(value = "ceshidelete.do", method = {RequestMethod.POST})
    @ResponseBody
    public ResultVo delete(int id) {
        return service.deteleById(id);
    }
}
