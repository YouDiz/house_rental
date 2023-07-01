package com.ssm.entity;

import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

public class AadimnEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    public AadimnEntity(){

    }
    public AadimnEntity(T t){
        try {
            BeanUtils.copyProperties(this, t);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    /**
     *管理员id
     */
    private Long aaid;
    /**
     * 管理员名称
     */
    private String aaname;
    /**
     * 密码
     */
    private  String aapwd;
    //管理员id
    public Long getAaid() {
        return aaid;
    }

    public void setAaid(Long aaid) {
        this.aaid = aaid;
    }
    //管理员名称

    public String getAaname() {
        return aaname;
    }

    public void setAaname(String aaname) {
        this.aaname = aaname;
    }
    //管理员密码

    public String getAapwd() {
        return aapwd;
    }

    public void setAapwd(String aapwd) {
        this.aapwd = aapwd;
    }
}
