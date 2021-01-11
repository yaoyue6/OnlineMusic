package com.rg171.music.mapper;

import com.rg171.music.entity.Collect;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: 收藏
 * @author: WangDongXu
 **/
@Repository
public interface CollectMapper {

    /**
     * 插入
     *
     * @param record
     * @return
     */
    int insert(Collect record);

    /**
     * 插入非空字段
     *
     * @param record
     * @return
     */
    int insertSelective(Collect record);

    /**
     * 根据主键查询
     */
    Collect selectByPrimaryKey(Integer id);

    /**
     * 根据主键更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Collect record);

    /**
     * 判断是否含有歌曲
     *
     * @param userId
     * @param songId
     * @return
     */
    int existSongId(@Param("userId") Integer userId, @Param("songId") Integer songId);

    /**
     * 更新收藏
     *
     * @param collect
     * @return
     */
    int updateCollectMsg(Collect collect);

    /**
     * 删除收藏
     *
     * @param userId
     * @param songId
     * @return
     */
    int deleteCollect(@Param("userId") Integer userId, @Param("songId") Integer songId);

    /**
     * 获取所有歌单
     *
     * @return
     */
    List<Collect> allCollect();

    /**
     * 获取用户的所有收藏列表
     *
     * @param userId
     * @return
     */
    List<Collect> collectionOfUser(Integer userId);
}
