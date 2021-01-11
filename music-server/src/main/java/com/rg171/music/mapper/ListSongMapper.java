package com.rg171.music.mapper;

import com.rg171.music.entity.ListSong;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @author: WangDongXu
 **/
@Repository
public interface ListSongMapper {

    /**
     * 插入非空字段
     * @param record
     * @return
     */
    int insertSelective(ListSong record);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    ListSong selectByPrimaryKey(Integer id);

    /**
     * 根据主键更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(ListSong record);

    /**
     * 更新歌曲列表信息
     * @param record
     * @return
     */
    int updateListSongMsg(ListSong record);

    /**
     * 通过歌曲ID删除指定列表
     * @param songId
     * @return
     */
    int deleteListSong(Integer songId);

    /**
     * 获取所有列表信息
     * @return
     */
    List<ListSong> allListSong();

    /**
     * 通过歌曲列表ID获取列表信息
     * @param songListId
     * @return
     */
    List<ListSong> listSongOfSongId(Integer songListId);
}
