package com.rg171.music.service.impl;

import com.rg171.music.mapper.ListSongMapper;
import com.rg171.music.entity.ListSong;
import com.rg171.music.service.ListSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: WangDongXu
 **/
@Service
public class ListSongServiceImpl implements ListSongService {

    @Autowired
    private ListSongMapper listSongMapper;

    /**
     * 获取所有列表信息
     *
     * @return
     */
    @Override
    public List<ListSong> allListSong() {
        return listSongMapper.allListSong();
    }

    /**
     * 更新列表信息
     *
     * @param listSong
     * @return
     */
    @Override
    public boolean updateListSongMsg(ListSong listSong) {
        return listSongMapper.updateListSongMsg(listSong) > 0 ? true : false;
    }

    /**
     * 删除指定列表
     *
     * @param songId
     * @return
     */
    @Override
    public boolean deleteListSong(Integer songId) {
        return listSongMapper.deleteListSong(songId) > 0 ? true : false;
    }

    /**
     * 添加列表
     *
     * @param listSong
     * @return
     */
    @Override
    public boolean addListSong(ListSong listSong) {
        return listSongMapper.insertSelective(listSong) > 0 ? true : false;
    }

    /**
     * 通过歌单ID获取列表集合
     *
     * @param songListId
     * @return
     */
    @Override
    public List<ListSong> listSongOfSongId(Integer songListId) {
        return listSongMapper.listSongOfSongId(songListId);
    }

}
