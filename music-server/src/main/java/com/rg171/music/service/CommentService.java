package com.rg171.music.service;

import com.rg171.music.entity.Comment;

import java.util.List;

/**
 * @description: 评论
 * @author: WangDongXu
 **/
public interface CommentService {

    /**
     * 添加评论
     * @param comment
     * @return
     */
    boolean addComment(Comment comment);

    /**
     * 更新评论
     * @param comment
     * @return
     */
    boolean updateCommentMsg(Comment comment);

    /**
     * s删除指定评论
     * @param id
     * @return
     */
    boolean deleteComment(Integer id);

    /**
     * 获取所有评论
     * @return
     */
    List<Comment> allComment();

    /**
     * 通过歌曲ID获取歌曲的所有评论
     * @param songId
     * @return
     */
    List<Comment> commentOfSongId(Integer songId);

    /**
     * 通过歌单集合获取歌单下的所有评论
     * @param songListId
     * @return
     */
    List<Comment> commentOfSongListId(Integer songListId);

}
