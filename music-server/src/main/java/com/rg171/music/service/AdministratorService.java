package com.rg171.music.service;

/**
 * @description: 管理员
 * @author: WangDongXu
 **/
public interface AdministratorService {

    /**
     * 登录
     * @param name
     * @param password
     * @return
     */
    boolean login(String name, String password);
}
