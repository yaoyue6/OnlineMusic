package com.rg171.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.rg171.music.service.impl.AdministratorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @description: 管理员
 * @author: WangDongXu
 **/
@RestController
@Controller
public class AdministratorController {

    @Autowired
    private AdministratorServiceImpl adminService;

    /**
     * 判断是否登录成功
     * @param req
     * @param session
     * @return
     */
    @RequestMapping(value = "/admin/login/status", method = RequestMethod.POST)
    public Object loginStatus(HttpServletRequest req, HttpSession session){
        JSONObject jsonObject = new JSONObject();

        String name = req.getParameter("name");
        String password = req.getParameter("password");

        boolean res = adminService.login(name, password);
        if (res) {
            jsonObject.put("code", 1);
            jsonObject.put("msg", "登录成功");
            session.setAttribute("name", name);
        } else {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "用户名或密码错误");
        }
        return jsonObject;
    }
}
