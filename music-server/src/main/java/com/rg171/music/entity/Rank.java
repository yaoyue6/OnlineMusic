package com.rg171.music.entity;

import java.io.Serializable;

/**
 * @description: 排行榜
 * @author: WangDongXu
 **/
public class Rank implements Serializable {

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 歌单ID
     */
    private Long songListId;

    /**
     * 消费者ID
     */
    private Long consumerId;

    /**
     * 评分
     */
    private Integer score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSongListId() {
        return songListId;
    }

    public void setSongListId(Long songListId) {
        this.songListId = songListId;
    }

    public Long getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}