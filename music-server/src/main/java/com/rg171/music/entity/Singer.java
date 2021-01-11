package com.rg171.music.entity;

import java.util.Date;

/**
 * @description: 歌手
 * @author: WangDongXu
 **/
public class Singer {

    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 歌手名
     */
    private String name;

    /**
     * 性别
     */
    private Byte sex;

    /**
     * 图片
     */
    private String pic;

    /**
     * 出生日期
     */
    private Date birth;

    /**
     * 家庭住址
     */
    private String location;

    /**
     * 个人简介
     */
    private String introduction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}
