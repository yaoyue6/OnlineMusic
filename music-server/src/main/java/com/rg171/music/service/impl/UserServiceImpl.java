package com.rg171.music.service.impl;

import com.rg171.music.mapper.UserMapper;
import com.rg171.music.entity.User;
import com.rg171.music.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 用户
 * @author: WangDongXu
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 新增用户
     *
     * @param consumer
     * @return
     */
    @Override
    public boolean addUser(User consumer) {
        return userMapper.insertSelective(consumer) > 0 ? true : false;
    }

    /**
     * 更改用户信息
     *
     * @param consumer
     * @return
     */
    @Override
    public boolean updateUserMsg(User consumer) {
        return userMapper.updateUserMsg(consumer) > 0 ? true : false;
    }

    /**
     * 更换用户头像
     *
     * @param consumer
     * @return
     */
    @Override
    public boolean updateUserAvatar(User consumer) {
        return userMapper.updateUserAvatar(consumer) > 0 ? true : false;
    }

    /**
     * 判断是否存在此用户
     *
     * @param username
     * @return
     */
    @Override
    public boolean existUser(String username) {
        return userMapper.existUsername(username) > 0 ? true : false;
    }

    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public boolean login(String username, String password) {
        return userMapper.login(username, password) > 0 ? true : false;
    }

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    @Override
    public boolean deleteUser(Integer id) {
        return userMapper.deleteUser(id) > 0 ? true : false;
    }

    /**
     * 获取所有用户
     *
     * @return
     */
    @Override
    public List<User> allUser() {
        return userMapper.allUser();
    }

    /**
     * 通过用户ID获取用户
     *
     * @param id
     * @return
     */
    @Override
    public List<User> userOfId(Integer id) {
        return userMapper.userOfId(id);
    }

    /**
     * 通过用户名获取用户
     *
     * @param username
     * @return
     */
    @Override
    public List<User> loginStatus(String username) {
        return userMapper.loginStatus(username);
    }
}
