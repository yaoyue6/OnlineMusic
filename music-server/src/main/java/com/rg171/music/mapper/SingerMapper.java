package com.rg171.music.mapper;

import com.rg171.music.entity.Singer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: 歌手
 * @author: WangDongXu
 **/
@Repository
public interface SingerMapper {

    /**
     * 插入
     * @param record
     * @return
     */
    int insert(Singer record);

    /**
     * 插入非空字段
     * @param record
     * @return
     */
    int insertSelective(Singer record);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    Singer selectByPrimaryKey(Integer id);

    /**
     * 根据主键更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(Singer record);

    /**
     * 更新歌手信息
     * @param record
     * @return
     */
    int updateSingerMsg(Singer record);

    /**
     * 更新歌手图片
     * @param record
     * @return
     */
    int updateSingerPic(Singer record);

    /**
     * 删除指定歌手
     * @param id
     * @return
     */
    int deleteSinger(Integer id);

    /**
     * 获取所有歌手信息
     * @return
     */
    List<Singer> allSinger();

    /**
     * 通过姓名获取歌手集合
     * @param name
     * @return
     */
    List<Singer> singerOfName(String name);

    /**
     * 通过性别获取歌手集合
     * @param sex
     * @return
     */
    List<Singer> singerOfSex(Integer sex);
}
