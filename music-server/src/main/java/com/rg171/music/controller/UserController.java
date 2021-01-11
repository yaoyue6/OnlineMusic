package com.rg171.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.rg171.music.entity.User;
import com.rg171.music.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: 用户
 * @author: WangDongXu
 **/
@RestController
@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Configuration
    public class MyPicConfig implements WebMvcConfigurer {
        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/avatarImages/**").addResourceLocations("classpath:/img/");
        }
    }

    /**
     * 添加用户
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public Object addUser(HttpServletRequest req) {
        JSONObject jsonObject = new JSONObject();
        String username = req.getParameter("username").trim();
        String password = req.getParameter("password").trim();
        String sex = req.getParameter("sex").trim();
        String phone = req.getParameter("phone").trim();
        String email = req.getParameter("email").trim();
        String birth = req.getParameter("birth").trim();
        String introduction = req.getParameter("introduction").trim();
        String location = req.getParameter("location").trim();

        if (username.equals("") || username == null) {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "用户名或密码错误");
            return jsonObject;
        }
        User consumer = new User();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date myBirth = new Date();
        try {
            myBirth = dateFormat.parse(birth);
        } catch (Exception e) {
            e.printStackTrace();
        }
        consumer.setUsername(username);
        consumer.setPassword(password);
        consumer.setSex(new Byte(sex));
        if (StringUtils.isEmpty(phone)) {
            consumer.setPhone(null);
        } else {
            consumer.setPhone(phone);
        }

        if (StringUtils.isEmpty(email)) {
            consumer.setEmail(null);
        } else {
            consumer.setEmail(email);
        }
        consumer.setBirth(myBirth);
        consumer.setIntroduction(introduction);
        consumer.setLocation(location);
        consumer.setCreateTime(new Date());
        consumer.setUpdateTime(new Date());

        boolean res = userService.addUser(consumer);
        if (res) {
            jsonObject.put("code", 1);
            jsonObject.put("msg", "注册成功");
        } else {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "注册失败");
        }
        return jsonObject;
    }

    /**
     * 判断是否登录成功
     *
     * @param req
     * @param session
     * @return
     */
    @RequestMapping(value = "/user/login/status", method = RequestMethod.POST)
    public String loginStatus(HttpServletRequest req, HttpSession session) {

        JSONObject jsonObject = new JSONObject();
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        boolean res = userService.login(username, password);

        if (res) {
            jsonObject.put("code", 1);
            jsonObject.put("msg", "登录成功");
            jsonObject.put("userMsg", userService.loginStatus(username));
            session.setAttribute("username", username);
        } else {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "用户名或密码错误");
        }
        return jsonObject.toJSONString();

    }

    /**
     * 返回所有用户
     *
     * @return
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Object allUser() {
        return userService.allUser();
    }

    /**
     * 返回指定ID的用户
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/user/detail", method = RequestMethod.GET)
    public Object userOfId(HttpServletRequest req) {
        String id = req.getParameter("id");
        return userService.userOfId(Integer.parseInt(id));
    }

    /**
     * 删除用户
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/user/delete", method = RequestMethod.GET)
    public Object deleteUser(HttpServletRequest req) {
        String id = req.getParameter("id");
        return userService.deleteUser(Integer.parseInt(id));
    }

    /**
     * 更新用户信息
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/user/update", method = RequestMethod.POST)
    public Object updateUserMsg(HttpServletRequest req) {
        JSONObject jsonObject = new JSONObject();
        String id = req.getParameter("id").trim();
        String username = req.getParameter("username").trim();
        String password = req.getParameter("password").trim();
        String sex = req.getParameter("sex").trim();
        String phone = req.getParameter("phone").trim();
        String email = req.getParameter("email").trim();
        String birth = req.getParameter("birth").trim();
        String introduction = req.getParameter("introduction").trim();
        String location = req.getParameter("location").trim();

        if (StringUtils.isEmpty(username)) {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "用户名或密码错误");
            return jsonObject;
        }
        User consumer = new User();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date myBirth = new Date();
        try {
            myBirth = dateFormat.parse(birth);
        } catch (Exception e) {
            e.printStackTrace();
        }
        consumer.setId(Integer.parseInt(id));
        consumer.setUsername(username);
        consumer.setPassword(password);
        consumer.setSex(new Byte(sex));
        consumer.setPhone(phone);
        consumer.setEmail(email);
        consumer.setBirth(myBirth);
        consumer.setIntroduction(introduction);
        consumer.setLocation(location);
        consumer.setUpdateTime(new Date());

        boolean res = userService.updateUserMsg(consumer);
        if (res) {
            jsonObject.put("code", 1);
            jsonObject.put("msg", "修改成功");
        } else {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "修改失败");
        }
        return jsonObject;
    }

    /**
     * 更新用户头像
     *
     * @param avatarFile
     * @param id
     * @return
     */
    @RequestMapping(value = "/user/avatar/update", method = RequestMethod.POST)
    public Object updateUserPic(@RequestParam("file") MultipartFile avatarFile, @RequestParam("id") int id) {
        JSONObject jsonObject = new JSONObject();

        if (avatarFile.isEmpty()) {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "文件上传失败！");
            return jsonObject;
        }
        String fileName = System.currentTimeMillis() + avatarFile.getOriginalFilename();
        String filePath = System.getProperty("user.dir") + System.getProperty("file.separator") + "avatarImages";
        File file1 = new File(filePath);
        if (!file1.exists()) {
            file1.mkdir();
        }

        File dest = new File(filePath + System.getProperty("file.separator") + fileName);
        String storeAvatarPath = "/avatarImages/" + fileName;
        try {
            avatarFile.transferTo(dest);
            User consumer = new User();
            consumer.setId(id);
            consumer.setAvatar(storeAvatarPath);
            boolean res = userService.updateUserAvatar(consumer);
            if (res) {
                jsonObject.put("code", 1);
                jsonObject.put("avatar", storeAvatarPath);
                jsonObject.put("msg", "上传成功");
                return jsonObject;
            } else {
                jsonObject.put("code", 0);
                jsonObject.put("msg", "上传失败");
                return jsonObject;
            }
        } catch (IOException e) {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "上传失败" + e.getMessage());
            return jsonObject;
        } finally {
            return jsonObject;
        }
    }
}
