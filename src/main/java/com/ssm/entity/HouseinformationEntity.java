package com.ssm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class HouseinformationEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
   /* public HouseinformationEntity(){

    }
    public HouseinformationEntity(T t){
        try {
            BeanUtils.copyProperties(this, t);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }*/
    /**
     * 房屋id
     */
    private Long hid;
    /**
     * 房间数量
     */
    private String hhousenum;
    /**
     * 房屋标题
     */
    private String htitle;
    /**
     * 房屋类型
     */
    private String hhousetype;
    /**
     * 房屋图片
     */
    private String hpicture;
    /**
     * 房屋地址
     */
    private String hadress;
    /**
     * 房屋定金
     */
    private String hdeposit;
    /**
     * 房屋价格
     */
    private String hprice;
    /**
     * 房屋信息
     */
    private String hinformation;
    /**
     * 房源地区
     */
    private String hhousearea;
    /**
     * 房屋楼层
     */
    private String hhousefloor;
    /**
     * 房屋朝向
     */
    private String hhousedirection;
    /**
     * 房东id
     */
    private Long oid;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date haddtime;

    public Date getHaddtime() {
        return haddtime;
    }
    public void setHaddtime(Date haddtime) {
        this.haddtime = haddtime;
    }

    //房屋id

    public Long getHid() {
        return hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }
    //房间数量

    public String getHhousenum() {
        return hhousenum;
    }

    public void setHhousenum(String hhousenum) {
        this.hhousenum = hhousenum;
    }
    //房屋标题

    public String getHtitle() {
        return htitle;
    }

    public void setHtitle(String htitle) {
        this.htitle = htitle;
    }
    //房屋类型

    public String getHhousetype() {
        return hhousetype;
    }

    public void setHhousetype(String hhousetype) {
        this.hhousetype = hhousetype;
    }
    //房屋图片

    public String getHpicture() {
        return hpicture;
    }

    public void setHpicture(String hpicture) {
        this.hpicture = hpicture;
    }
    //房屋地址

    public String getHadress() {
        return hadress;
    }

    public void setHadress(String hadress) {
        this.hadress = hadress;
    }
    //房屋定金

    public String getHdeposit() {
        return hdeposit;
    }

    public void setHdeposit(String hdeposit) {
        this.hdeposit = hdeposit;
    }
    //房屋价格

    public String getHprice() {
        return hprice;
    }

    public void setHprice(String hprice) {
        this.hprice = hprice;
    }
    //房屋信息

    public void setHinformation(String hinformation) {
        this.hinformation = hinformation;
    }

    public String getHinformation() {
        return hinformation;
    }
    //房屋区域

    public String getHhousearea() {
        return hhousearea;
    }

    public void setHhousearea(String hhousearea) {
        this.hhousearea = hhousearea;
    }
    //房屋楼层

    public String getHhousefloor() {
        return hhousefloor;
    }

    public void setHhousefloor(String hhousefloor) {
        this.hhousefloor = hhousefloor;
    }
    //房屋面向

    public String getHhousedirection() {
        return hhousedirection;
    }

    public void setHhousedirection(String hhousedirection) {
        this.hhousedirection = hhousedirection;
    }
    //房东id

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }
}



