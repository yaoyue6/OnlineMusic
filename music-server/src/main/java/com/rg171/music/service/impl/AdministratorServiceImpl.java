package com.rg171.music.service.impl;

import com.rg171.music.mapper.AdministratorMapper;
import com.rg171.music.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 管理员
 * @author: WangDongXu
 **/
@Service
public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    private AdministratorMapper administratorMapper;

    /**
     * 登录
     *
     * @param name
     * @param password
     * @return
     */
    @Override
    public boolean login(String name, String password) {
        return administratorMapper.login(name, password) > 0 ? true : false;
    }
}
