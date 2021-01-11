package com.rg171.music.service;

import com.rg171.music.entity.ListSong;

import java.util.List;

/**
 * @description:
 * @author: WangDongXu
 **/
public interface ListSongService {

    /**
     * 添加列表
     * @param listSong
     * @return
     */
    boolean addListSong(ListSong listSong);

    /**
     * 更新列表
     * @param listSong
     * @return
     */
    boolean updateListSongMsg(ListSong listSong);

    /**
     * 删除指定列表
     * @param songId
     * @return
     */
    boolean deleteListSong(Integer songId);

    /**
     * 获取所有列表
     * @return
     */
    List<ListSong> allListSong();

    /**
     * 通过歌单集合获取所有列表
     * @param songListId
     * @return
     */
    List<ListSong> listSongOfSongId(Integer songListId);
}
