package com.ssm.entity;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class NewsEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


    public NewsEntity() {

    }

    public NewsEntity(T t) {
        try {
            BeanUtils.copyProperties(this, t);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 主键id
     */
    private Long nid;
    /**
     * 标题
     */

    private String ntitle;

    /**
     * 图片
     */

    private String npicture;

    /**
     * 内容
     */

    private String ncontent;


    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date naddtime;

    public Date getNaddtime() {
        return naddtime;
    }
    public void setNaddtime(Date naddtime) {
        this.naddtime = naddtime;
    }

    public Long getNid() {
        return nid;
    }

    public void setNid(Long nid) {
        this.nid = nid;
    }
    /**
     * 设置：标题
     */
    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }
    /**
     * 获取：标题
     */
    public String getNtitle() {
        return ntitle;
    }
    /**
     * 设置：图片
     */
    public void setNpicture(String npicture) {
        this.npicture = npicture;
    }
    /**
     * 获取：图片
     */
    public String getNpicture() {
        return npicture;
    }
    /**
     * 设置：内容
     */
    public void setNcontent(String ncontent) {
        this.ncontent = ncontent;
    }
    /**
     * 获取：内容
     */
    public String getNcontent() {
        return ncontent;
    }

}

