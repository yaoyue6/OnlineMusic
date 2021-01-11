package com.rg171.music.mapper;

import com.rg171.music.entity.SongList;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: 歌曲列表
 * @author: WangDongXu
 **/
@Repository
public interface SongListMapper {

    /**
     * 插入
     * @param record
     * @return
     */
    int insert(SongList record);

    /**
     * 插入非空字段
     * @param record
     * @return
     */
    int insertSelective(SongList record);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    SongList selectByPrimaryKey(Integer id);

    /**
     * 根据主键更新（包括图片）
     * @param record
     * @return
     */
    int updateByPrimaryKeyWithBLOBs(SongList record);

    /**
     * 根据主键更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(SongList record);

    /**
     * 根据歌曲列表信息
     * @param record
     * @return
     */
    int updateSongListMsg(SongList record);

    /**
     * 更新歌曲列表信息
     * @param record
     * @return
     */
    int updateSongListImg(SongList record);

    /**
     * 删除指定歌曲列表
     * @param id
     * @return
     */
    int deleteSongList(Integer id);

    /**
     * 获取所有歌曲列表信息
     * @return
     */
    List<SongList> allSongList();

    /**
     * 标题模糊查询获取歌曲列表集合
     * @param title
     * @return
     */
    List<SongList> likeTitle(String title);

    /**
     * 类型模糊查询获取歌曲列表集合
     * @param style
     * @return
     */
    List<SongList> likeStyle(String style);

    /**
     * 根据歌单标题获取歌曲列表集合
     * @param title
     * @return
     */
    List<SongList> songListOfTitle(String title);
}
