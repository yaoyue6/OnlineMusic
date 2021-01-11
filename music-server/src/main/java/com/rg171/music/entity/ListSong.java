package com.rg171.music.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @description:
 * @author: WangDongXu
 **/
public class ListSong implements Serializable {

    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 歌曲ID
     */
    private Integer songId;

    /**
     * 歌曲列表ID
     */
    private Integer songListId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public Integer getSongListId() {
        return songListId;
    }

    public void setSongListId(Integer songListId) {
        this.songListId = songListId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
