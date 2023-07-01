package com.ssm.entity;

import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

public class AdminEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    public AdminEntity(){

    }
    public AdminEntity(T t){
        BeanUtils.copyProperties(this, t);
    }
    /**
     *管理员id
     */
    private Long aid;
    /**
     * 管理员名称
     */
    private String aname;
    /**
     * 密码
     */
    private  String apwd;
    //管理员id
    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }
    //管理员名称

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }
    //管理员密码

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }
}
