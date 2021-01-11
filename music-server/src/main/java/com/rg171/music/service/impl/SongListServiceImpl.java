package com.rg171.music.service.impl;

import com.rg171.music.mapper.SongListMapper;
import com.rg171.music.entity.SongList;
import com.rg171.music.service.SongListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 歌曲列表
 * @author: WangDongXu
 **/
@Service
public class SongListServiceImpl implements SongListService {

    @Autowired
    private SongListMapper songListMapper;

    /**
     * 更新歌单信息
     *
     * @param songList
     * @return
     */
    @Override
    public boolean updateSongListMsg(SongList songList) {
        return songListMapper.updateSongListMsg(songList) > 0 ? true : false;
    }

    /**
     * 删除指定歌单
     *
     * @param id
     * @return
     */
    @Override
    public boolean deleteSongList(Integer id) {
        return songListMapper.deleteSongList(id) > 0 ? true : false;
    }

    /**
     * 获取所有歌单信息
     *
     * @return
     */
    @Override
    public List<SongList> allSongList() {
        return songListMapper.allSongList();
    }

    /**
     * 标题模糊查询获取歌单信息集合
     *
     * @param title
     * @return
     */
    @Override
    public List<SongList> likeTitle(String title) {
        return songListMapper.likeTitle(title);
    }

    /**
     * 类型模糊查询获取歌单信息集合
     *
     * @param style
     * @return
     */
    @Override
    public List<SongList> likeStyle(String style) {
        return songListMapper.likeStyle(style);
    }

    /**
     * 根据标题信息获取歌单信息集合
     *
     * @param title
     * @return
     */
    @Override
    public List<SongList> songListOfTitle(String title) {
        return songListMapper.songListOfTitle(title);
    }

    /**
     * 添加歌单信息
     *
     * @param songList
     * @return
     */
    @Override
    public boolean addSongList(SongList songList) {
        return songListMapper.insertSelective(songList) > 0 ? true : false;
    }

    /**
     * 更新歌单信息图片
     *
     * @param songList
     * @return
     */
    @Override
    public boolean updateSongListImg(SongList songList) {
        return songListMapper.updateSongListImg(songList) > 0 ? true : false;
    }
}
