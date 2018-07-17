package com.qfedu.web.controller;

import com.qfedu.domain.DaTi;
import com.qfedu.service.DaTiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DaTiController {
    @Autowired
    private DaTiService service;

    @RequestMapping(value = "/adddati.do", method = {RequestMethod.POST})
    @ResponseBody
    public boolean adddati(DaTi daTi) {

        return service.insert(daTi);
    }

    @RequestMapping(value = "/alldati.do")
    @ResponseBody
    public List<DaTi> alldati(int csid) {

        return service.queryAll(csid);
    }

}
