package com.rg171.music.service;

import com.rg171.music.entity.SongList;

import java.util.List;

/**
 * @description: 歌曲列表
 * @author: WangDongXu
 **/
public interface SongListService {

    /**
     * 添加歌单信息
     * @param songList
     * @return
     */
    boolean addSongList (SongList songList);

    /**
     * 更新歌单信息
     * @param songList
     * @return
     */
    boolean updateSongListMsg(SongList songList);

    /**
     * 更新歌单图片
     * @param songList
     * @return
     */
    boolean updateSongListImg(SongList songList);

    /**
     * 删除指定歌单
     * @param id
     * @return
     */
    boolean deleteSongList(Integer id);

    /**
     * 获取所有歌单信息
     * @return
     */
    List<SongList> allSongList();

    /**
     * 通过标题模糊查询所有歌单信息集合
     * @param title
     * @return
     */
    List<SongList> likeTitle(String title);

    /**
     * 通过类型模糊插叙所有歌单信息集合
     * @param style
     * @return
     */
    List<SongList> likeStyle(String style);

    /**
     * 通过标题查询歌单信息集合
     * @param title
     * @return
     */
    List<SongList> songListOfTitle(String title);

}
