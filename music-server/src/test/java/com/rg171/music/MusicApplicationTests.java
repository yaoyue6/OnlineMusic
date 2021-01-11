package com.rg171.music;

import com.rg171.music.entity.*;
import com.rg171.music.service.impl.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MusicApplicationTests {

    @Autowired
    private SongServiceImpl songService;
    private SingerServiceImpl singerService;
    private SongListServiceImpl songListService;
    private UserServiceImpl userService;
    private RankServiceImpl rankService;

    @Test
    public void contextLoads() {

    }

    @Test
    public void songTest() {
        Song song = new Song();
        song.setName("Sanna Nielsen-Undo");
        song.setPic("/img/songPic/1775711278864263.jpg");
        song.setSingerId(42);
        song.setCreateTime(new Date());
        song.setUpdateTime(new Date());
        song.setIntroduction("Undo");
        song.setLyric("[00:00:00]暂无歌词");
        song.setUrl("/song/Sanna Nielsen-Undo.mp3");
        songService.addSong(song);
    }


    /**
     * 歌手
     *
     * @param:
     * @return:
     */
    @Test
    public void singerTest() {
        Singer singer = new Singer();
        singer.setName("Álvaro Soler");
        singer.setSex(new Byte("1"));
        singer.setPic("/img/singerPic/soler.jpg");
        singer.setBirth(new Date());
        singer.setLocation("西班牙");
        singer.setIntroduction("全名是Álvaro Tauchert Soler，是一位新晋西班牙歌手，流行音乐作曲家。出生于1991年，西班牙巴塞罗纳。");
        singerService.addSinger(singer);
    }

    @Test
    public void singerTest2() {
        System.out.println(singerService.allSinger());
    }

    /**
     * 歌单
     *
     * @param:
     * @return:
     */
    @Test
    public void songListTest() {

        SongList songList = new SongList();
        songList.setTitle("国风传统器乐赏~~♪");
        songList.setPic("/img/songListPic/19169985230816413.jpg");
        songList.setIntroduction(" 都是自己很喜欢的吉他指弹");
        songList.setStyle("乐器");
        songListService.addSongList(songList);
    }

    @Test
    public void songListTest2() {
        System.out.println(songListService.allSongList());
    }

    /**
     * 用户
     *
     * @param:
     * @return:
     */
    @Test
    public void userTest() {

        User user = new User();
        user.setUsername("test");
        user.setPassword("123");
        user.setSex(new Byte("0"));
        user.setPhone("15666412237");
        user.setEmail("1239679@qq.com");
        user.setBirth(new Date());
        user.setIntroduction("");
        user.setLocation("");
        user.setAvatar("/img/user.jpg");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        userService.addUser(user);
    }

    @Test
    public void uTest2() {
        System.out.println(userService.allUser());
    }
}

