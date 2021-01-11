package com.rg171.music.service;

import com.rg171.music.entity.Rank;

/**
 * @description: 评分
 * @author: WangDongXu
 **/
public interface RankService {

    /**
     * 通过歌单ID获取歌单评分
     * @param songListId
     * @return
     */
    int rankOfSongListId(Long songListId);

    /**
     * 添加评分
     * @param rank
     * @return
     */
    boolean addRank(Rank rank);
}
