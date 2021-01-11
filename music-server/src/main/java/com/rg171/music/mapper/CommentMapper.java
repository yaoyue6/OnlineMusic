package com.rg171.music.mapper;

import com.rg171.music.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: 评论
 * @author: WangDongXu
 **/
@Repository
public interface CommentMapper {

    /**
     * 插入
     * @param record
     * @return
     */
    int insert(Comment record);

    /**
     * 插入非空字段
     * @param record
     * @return
     */
    int insertSelective(Comment record);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    Comment selectByPrimaryKey(Integer id);

    /**
     * 根据主键更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(Comment record);

    /**
     * 更新评论
     * @param record
     * @return
     */
    int updateCommentMsg(Comment record);

    /**
     * 根据主键删除评论
     * @param id
     * @return
     */
    int deleteComment(Integer id);

    /**
     * 获取所有评论
     * @return
     */
    List<Comment> allComment();

    /**
     * 根据歌曲ID获取该歌曲的全部评论
     * @param songId
     * @return
     */
    List<Comment> commentOfSongId(Integer songId);

    /**
     * 根据歌单ID获取该歌单的全部评论
     * @param songListId
     * @return
     */
    List<Comment> commentOfSongListId(Integer songListId);
}
