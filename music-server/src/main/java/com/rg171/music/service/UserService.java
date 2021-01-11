package com.rg171.music.service;

import com.rg171.music.entity.User;

import java.util.List;

/**
 * @description: 用户
 * @author: WangDongXu
 **/
public interface UserService {

    /**
     * 添加用户信息
     * @param consumer
     * @return
     */
    boolean addUser(User consumer);

    /**
     * 更新用户信息
     * @param consumer
     * @return
     */
    boolean updateUserMsg(User consumer);

    /**
     * 更新用户头像
     * @param consumer
     * @return
     */
    boolean updateUserAvatar(User consumer);

    /**
     * 通过用户名判断是否存在此用户
     * @param username
     * @return
     */
    boolean existUser(String username);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    boolean login(String username, String password);

    /**
     * 删除指定用户
     * @param id
     * @return
     */
    boolean deleteUser(Integer id);

    /**
     * 获取所有用户信息
     * @return
     */
    List<User> allUser();

    /**
     * 通过ID获取用户信息
     * @param id
     * @return
     */
    List<User> userOfId(Integer id);

    /**
     * 通过用户名获取用户信息
     * @param username
     * @return
     */
    List<User> loginStatus(String username);

}
