package com.rg171.music.mapper;

import com.rg171.music.entity.Rank;
import org.springframework.stereotype.Repository;

/**
 * @description: 评分
 * @author: WangDongXu
 **/
@Repository
public interface RankMapper {

    /**
     * 插入
     * @param record
     * @return
     */
    int insert(Rank record);

    /**
     * 插入非空字段
     * @param record
     * @return
     */
    int insertSelective(Rank record);

    /**
     * 查总分
     * @param songListId
     * @return
     */
    int selectScoreSum(Long songListId);

    /**
     * 查总评分人数
     * @param songListId
     * @return
     */
    int selectRankNum(Long songListId);
}
