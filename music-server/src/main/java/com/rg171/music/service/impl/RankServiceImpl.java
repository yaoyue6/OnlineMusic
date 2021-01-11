package com.rg171.music.service.impl;

import com.rg171.music.mapper.RankMapper;
import com.rg171.music.entity.Rank;
import com.rg171.music.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 评分
 * @author: WangDongXu
 **/
@Service
public class RankServiceImpl implements RankService {

    @Autowired
    private RankMapper rankMapper;

    /**
     * 获取歌单总评分
     *
     * @param songListId
     * @return
     */
    @Override
    public int rankOfSongListId(Long songListId) {
        return rankMapper.selectScoreSum(songListId) / rankMapper.selectRankNum(songListId);
    }

    /**
     * 添加评分
     *
     * @param rank
     * @return
     */
    @Override
    public boolean addRank(Rank rank) {
        return rankMapper.insertSelective(rank) > 0 ? true : false;
    }
}
