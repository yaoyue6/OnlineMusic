package com.rg171.music.mapper;

import com.rg171.music.entity.Administrator;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @description: 管理员
 * @author: WangDongXu
 **/
@Repository
public interface AdministratorMapper {

    /**
     * 根据主键删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入
     * @param record
     * @return
     */
    int insert(Administrator record);

    /**
     * 根据条件插入
     * @param record
     * @return
     */
    int insertSelective(Administrator record);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    Administrator selectByPrimaryKey(Integer id);

    /**
     * 根据主键更新值不为空的字段
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Administrator record);

    /**
     * 根据主键更新字段
     * @param record
     * @return
     */
    int updateByPrimaryKey(Administrator record);

    /**
     * 检验用户名、密码是否正确
     * @param username
     * @param password
     * @return
     */
    int login(@Param("username") String username, @Param("password") String password);
}