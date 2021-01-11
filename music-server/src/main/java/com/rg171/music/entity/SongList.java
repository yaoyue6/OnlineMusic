package com.rg171.music.entity;

/**
 * @description: 歌曲列表
 * @author: WangDongXu
 **/
public class SongList {

    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 歌单名
     */
    private String title;

    /**
     * 图片
     */
    private String pic;

    /**
     * 歌单风格
     */
    private String style;

    /**
     * 歌单介绍
     */
    private String introduction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

}
