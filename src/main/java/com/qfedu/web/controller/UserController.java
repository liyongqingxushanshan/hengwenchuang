package com.qfedu.web.controller;

import com.qfedu.common.vo.BeanVo;
import com.qfedu.domain.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping(value = "/userLogin.do", method = {RequestMethod.POST})
    @ResponseBody
    public BeanVo adminLogin(String username, String password, HttpServletRequest request) {
        BeanVo<String> beanVo = new BeanVo();
        User user = service.queryByName(username);
        if (user != null) {
            if (password.equals(user.getPassword())) {
                beanVo.setCode(0);
                beanVo.setData(user.getRole() + "");
                beanVo.setMsg("登录成功");
                request.getSession().setAttribute("user",user);
            } else {
                beanVo.setCode(1);
                beanVo.setMsg("账号或密码不对");
            }
        } else {
            beanVo.setCode(1);
            beanVo.setMsg("该用户未注册");
        }
        return beanVo;
    }

    @RequestMapping(value = "/userRegister.do", method = {RequestMethod.POST})
    @ResponseBody
    public BeanVo userRegister(String username, String password, String sex) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setSex(sex);
        BeanVo<String> beanVo = new BeanVo();
        if (service.insert(user)) {
            beanVo.setCode(0);
            beanVo.setMsg("注册成功");
        } else {
            beanVo.setCode(1);
            beanVo.setMsg("注册失败");
        }
        return beanVo;
    }

    //注销
    @RequestMapping("/loginout.do")
    public String loginout(HttpServletRequest request) {
        request.getSession().removeAttribute("user");
        return "login";
    }
    @RequestMapping(value="/getUser.do",method= {RequestMethod.GET})
    @ResponseBody
    public User getStaff(HttpServletRequest request) {
        User admin = (User) request.getSession().getAttribute("user");
        return admin;
    }

}
