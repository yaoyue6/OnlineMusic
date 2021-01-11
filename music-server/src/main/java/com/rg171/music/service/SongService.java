package com.rg171.music.service;

import com.rg171.music.entity.Song;

import java.util.List;

/**
 * @description: 歌曲
 * @author: WangDongXu
 **/
public interface SongService {

    /**
     * 添加歌曲信息
     * @param song
     * @return
     */
    boolean addSong (Song song);

    /**
     * 更新歌曲信息
     * @param song
     * @return
     */
    boolean updateSongMsg(Song song);

    /**
     * 更新歌曲链接
     * @param song
     * @return
     */
    boolean updateSongUrl(Song song);

    /**
     * 更新歌曲图片
     * @param song
     * @return
     */
    boolean updateSongPic(Song song);

    /**
     * 删除指定歌曲
     * @param id
     * @return
     */
    boolean deleteSong(Integer id);

    /**
     * 获取所有歌曲信息
     * @return
     */
    List<Song> allSong();

    /**
     * 根据歌手ID获取歌曲集合
     * @param singerId
     * @return
     */
    List<Song> songOfSingerId(Integer singerId);

    /**
     * 根据ID获取歌曲集合
     * @param id
     * @return
     */
    List<Song> songOfId(Integer id);

    /**
     * 根据歌手名获取歌曲集合
     * @param name
     * @return
     */
    List<Song> songOfSingerName(String name);

    /**
     * 根据歌曲名获取歌曲集合
     * @param name
     * @return
     */
    List<Song> songOfName(String name);
}
