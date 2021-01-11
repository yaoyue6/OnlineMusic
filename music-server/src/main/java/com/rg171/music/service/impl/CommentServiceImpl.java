package com.rg171.music.service.impl;

import com.rg171.music.mapper.CommentMapper;
import com.rg171.music.entity.Comment;
import com.rg171.music.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 评论
 * @author: WangDongXu
 **/
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    /**
     * 添加评论
     *
     * @param comment
     * @return
     */
    @Override
    public boolean addComment(Comment comment) {
        return commentMapper.insertSelective(comment) > 0 ? true : false;
    }

    /**
     * 更新评论信息
     *
     * @param comment
     * @return
     */
    @Override
    public boolean updateCommentMsg(Comment comment) {
        return commentMapper.updateCommentMsg(comment) > 0 ? true : false;
    }

    /**
     * 删除评论
     *
     * @param id
     * @return
     */
    @Override
    public boolean deleteComment(Integer id) {
        return commentMapper.deleteComment(id) > 0 ? true : false;
    }

    /**
     * 获取所有评论
     *
     * @return
     */
    @Override
    public List<Comment> allComment() {
        return commentMapper.allComment();
    }

    /**
     * 通过歌曲ID获取该歌曲的所有评论
     *
     * @param songId
     * @return
     */
    @Override
    public List<Comment> commentOfSongId(Integer songId) {
        return commentMapper.commentOfSongId(songId);
    }

    /**
     * 通过歌单ID获取该歌单下的所有评论
     *
     * @param songListId
     * @return
     */
    @Override
    public List<Comment> commentOfSongListId(Integer songListId) {
        return commentMapper.commentOfSongListId(songListId);
    }
}
