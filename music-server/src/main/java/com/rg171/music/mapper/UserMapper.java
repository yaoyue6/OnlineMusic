package com.rg171.music.mapper;

import com.rg171.music.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: 用户
 * @author: WangDongXu
 **/
@Repository
public interface UserMapper {

    /**
     * 插入
     * @param record
     * @return
     */
    int insert(User record);

    /**
     * 插入非空字段
     * @param record
     * @return
     */
    int insertSelective(User record);

    /**
     * 根据主键更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(User record);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    int login(@Param("username") String username, @Param("password") String password);

    /**
     * 查询是否存在用户名
     * @param username
     * @return
     */
    int existUsername(String username);

    /**
     * 更新信息
     * @param record
     * @return
     */
    int updateUserMsg(User record);

    /**
     * 更换头像
     * @param record
     * @return
     */
    int updateUserAvatar(User record);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUser(Integer id);

    /**
     * 获取所有用户
     * @return
     */
    List<User> allUser();

    /**
     * 根据主键ID查询
     * @param id
     * @return
     */
    List<User> userOfId(Integer id);

    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    List<User> loginStatus(String username);

}
