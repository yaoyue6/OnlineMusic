package com.rg171.music.service;

import com.rg171.music.entity.Singer;

import java.util.List;

/**
 * @description: 歌手
 * @author: WangDongXu
 **/
public interface SingerService {

    /**
     * 添加歌手信息
     * @param singer
     * @return
     */
    boolean addSinger (Singer singer);

    /**
     * 更新歌手信息
     * @param singer
     * @return
     */
    boolean updateSingerMsg(Singer singer);

    /**
     * 更新歌手图片信息
     * @param singer
     * @return
     */
    boolean updateSingerPic(Singer singer);

    /**
     * 删除歌手信息
     * @param id
     * @return
     */
    boolean deleteSinger(Integer id);

    /**
     * 获取所有歌手信息
     * @return
     */
    List<Singer> allSinger();

    /**
     * 通过歌手姓名获取歌手信息
     * @param name
     * @return
     */
    List<Singer> singerOfName(String name);

    /**
     * 通过性别获取歌手信息
     * @param sex
     * @return
     */
    List<Singer> singerOfSex(Integer sex);
}
