package com.rg171.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.rg171.music.entity.ListSong;
import com.rg171.music.service.impl.ListSongServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: WangDongXu
 **/
@RestController
@Controller
public class ListSongController {

    @Autowired
    private ListSongServiceImpl listSongService;

    /**
     * 添加列表信息
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/ListSong/add", method = RequestMethod.POST)
    public Object addListSong(HttpServletRequest req) {
        JSONObject jsonObject = new JSONObject();
        String song_id = req.getParameter("songId").trim();
        String song_list_id = req.getParameter("songListId").trim();

        ListSong listsong = new ListSong();
        listsong.setSongId(Integer.parseInt(song_id));
        listsong.setSongListId(Integer.parseInt(song_list_id));

        boolean res = listSongService.addListSong(listsong);
        if (res) {
            jsonObject.put("code", 1);
            jsonObject.put("msg", "添加成功");
        } else {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "添加失败");
        }
        return jsonObject;
    }

    /**
     * 返回所有的列表信息
     *
     * @return
     */
    @RequestMapping(value = "/listSong", method = RequestMethod.GET)
    public Object allListSong() {
        return listSongService.allListSong();
    }

    /**
     * 通过歌曲ID获取列表集合
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/listSong/detail", method = RequestMethod.GET)
    public Object listSongOfSongId(HttpServletRequest req) {
        String songListId = req.getParameter("songListId");
        return listSongService.listSongOfSongId(Integer.parseInt(songListId));
    }

    /**
     * 删除歌单里的歌曲
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/ListSong/delete", method = RequestMethod.GET)
    public Object deleteListSong(HttpServletRequest req) {
        String songId = req.getParameter("songId");
        return listSongService.deleteListSong(Integer.parseInt(songId));
    }

    /**
     * 更新歌单里面的歌曲信息
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/listSong/update", method = RequestMethod.POST)
    public Object updateListSongMsg(HttpServletRequest req) {
        JSONObject jsonObject = new JSONObject();
        String id = req.getParameter("id").trim();
        String song_id = req.getParameter("songId").trim();
        String song_list_id = req.getParameter("songListId").trim();

        ListSong listsong = new ListSong();
        listsong.setId(Integer.parseInt(id));
        listsong.setSongId(Integer.parseInt(song_id));
        listsong.setSongListId(Integer.parseInt(song_list_id));

        boolean res = listSongService.updateListSongMsg(listsong);
        if (res) {
            jsonObject.put("code", 1);
            jsonObject.put("msg", "修改成功");
        } else {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "修改失败");
        }
        return jsonObject;
    }
}
