package com.rg171.music.service;

import com.rg171.music.entity.Collect;

import java.util.List;

/**
 * @description:
 * @author: WangDongXu
 **/
public interface CollectService {

    /**
     * 添加收藏信息
     * @param collect
     * @return
     */
    boolean addCollection(Collect collect);

    /**
     * 判断是否存在歌曲
     * @param userId
     * @param songId
     * @return
     */
    boolean existSongId(Integer userId, Integer songId);

    /**
     * 更新收藏信息
     * @param collect
     * @return
     */
    boolean updateCollectMsg(Collect collect);

    /**
     * 删除指定收藏列表
     * @param userId
     * @param songId
     * @return
     */
    boolean deleteCollect(Integer userId, Integer songId);

    /**
     * 获取所有收藏列表
     * @return
     */
    List<Collect> allCollect();

    /**
     * 通过用户ID获取指定用户的收藏集合
     * @param userId
     * @return
     */
    List<Collect> collectionOfUser(Integer userId);
}
