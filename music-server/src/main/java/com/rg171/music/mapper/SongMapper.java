package com.rg171.music.mapper;

import com.rg171.music.entity.Song;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: 歌曲列表
 * @author: WangDongXu
 **/
@Repository
public interface SongMapper {

    /**
     * 插入
     * @param record
     * @return
     */
    int insert(Song record);

    /**
     * 插入非空字段
     * @param record
     * @return
     */
    int insertSelective(Song record);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    Song selectByPrimaryKey(Integer id);

    /**
     * 根据主键更新(包括图片)
     * @param record
     * @return
     */
    int updateByPrimaryKeyWithBLOBs(Song record);

    /**
     * 根据主键更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(Song record);

    /**
     * 更新歌曲信息
     * @param record
     * @return
     */
    int updateSongMsg(Song record);

    /**
     * 更新歌曲链接
     * @param record
     * @return
     */
    int updateSongUrl(Song record);

    /**
     * 更新歌曲图片
     * @param record
     * @return
     */
    int updateSongPic(Song record);

    /**
     * 删除指定歌曲
     * @param id
     * @return
     */
    int deleteSong(Integer id);

    /**
     * 获取所有歌曲信息
     * @return
     */
    List<Song> allSong();

    /**
     * 通过歌手ID获取歌曲集合
     * @param singerId
     * @return
     */
    List<Song> songOfSingerId(Integer singerId);

    /**
     * 通过ID获取歌曲集合
     * @param id
     * @return
     */
    List<Song> songOfId(Integer id);

    /**
     * 通过歌手名字获取歌曲集合
     * @param name
     * @return
     */
    List<Song> songOfSingerName(String name);

    /**
     * 通过名字获取歌曲集合
     * @param name
     * @return
     */
    List<Song> songOfName(String name);

}
