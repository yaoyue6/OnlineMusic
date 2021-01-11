package com.rg171.music.service.impl;

import com.rg171.music.mapper.SingerMapper;
import com.rg171.music.entity.Singer;
import com.rg171.music.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 歌手
 * @author: WangDongXu
 **/
@Service
public class SingerServiceImpl implements SingerService {

    @Autowired
    private SingerMapper singerMapper;

    /**
     * 更新歌手信息
     *
     * @param singer
     * @return
     */
    @Override
    public boolean updateSingerMsg(Singer singer) {
        return singerMapper.updateSingerMsg(singer) > 0 ? true : false;
    }

    /**
     * 更新歌手图片
     *
     * @param singer
     * @return
     */
    @Override
    public boolean updateSingerPic(Singer singer) {
        return singerMapper.updateSingerPic(singer) > 0 ? true : false;
    }

    /**
     * 删除指定歌手
     *
     * @param id
     * @return
     */
    @Override
    public boolean deleteSinger(Integer id) {
        return singerMapper.deleteSinger(id) > 0 ? true : false;
    }

    /**
     * 获取所有歌手信息
     *
     * @return
     */
    @Override
    public List<Singer> allSinger() {
        return singerMapper.allSinger();
    }

    /**
     * 添加歌手信息
     *
     * @param singer
     * @return
     */
    @Override
    public boolean addSinger(Singer singer) {
        return singerMapper.insertSelective(singer) > 0 ? true : false;
    }

    /**
     * 通过歌手名字查找歌手集合
     *
     * @param name
     * @return
     */
    @Override
    public List<Singer> singerOfName(String name) {
        return singerMapper.singerOfName(name);
    }

    /**
     * 通过歌手性别查找歌手集合
     *
     * @param sex
     * @return
     */
    @Override
    public List<Singer> singerOfSex(Integer sex) {
        return singerMapper.singerOfSex(sex);
    }
}
