package com.rg171.music.service.impl;

import com.rg171.music.mapper.CollectMapper;
import com.rg171.music.entity.Collect;
import com.rg171.music.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 收藏
 * @author: WangDongXu
 **/
@Service
public class CollectServiceImpl implements CollectService {
    @Autowired
    private CollectMapper collectMapper;

    /**
     * 新增收藏
     * @param collect
     * @return
     */
    @Override
    public boolean addCollection(Collect collect) {
        return collectMapper.insertSelective(collect) > 0 ? true : false;
    }

    /**
     * 判断收藏中是否存在歌曲
     * @param userId
     * @param songId
     * @return
     */
    @Override
    public boolean existSongId(Integer userId, Integer songId) {
        return collectMapper.existSongId(userId, songId) > 0 ? true : false;
    }

    /**
     * 更新收藏
     * @param collect
     * @return
     */
    @Override
    public boolean updateCollectMsg(Collect collect) {
        return collectMapper.updateCollectMsg(collect) > 0 ? true : false;
    }

    /**
     * 删除收藏
     * @param userId
     * @param songId
     * @return
     */
    @Override
    public boolean deleteCollect(Integer userId, Integer songId) {
        return collectMapper.deleteCollect(userId, songId) > 0 ? true : false;
    }

    /**
     * 获取所有收藏
     * @return
     */
    @Override
    public List<Collect> allCollect() {
        return collectMapper.allCollect();
    }

    /**
     * 获取用户的所有收藏
     * @param userId
     * @return
     */
    @Override
    public List<Collect> collectionOfUser(Integer userId) {
        return collectMapper.collectionOfUser(userId);
    }
}
