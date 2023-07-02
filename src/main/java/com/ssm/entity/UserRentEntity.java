package com.ssm.entity;

import java.util.Date;

public class UserRentEntity {
    private Integer rid;

    /**
     * 用户账号
     */
    private String rusername;

    /**
     * 密码
     */
    private String rpwd;

    /**
     * 用户年龄
     */
    private String rage;

    /**
     * 用户性别
     */
    private String rname;

    /**
     * 用户手机号
     */
    private Integer rphonenum;

    /**
     * 用户邮箱
     */
    private String rmail;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRusername() {
        return rusername;
    }

    public void setRusername(String rusername) {
        this.rusername = rusername;
    }

    public String getRpwd() {
        return rpwd;
    }

    public void setRpwd(String rpwd) {
        this.rpwd = rpwd;
    }

    public String getRage() {
        return rage;
    }

    public void setRage(String rage) {
        this.rage = rage;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Integer getRphonenum() {
        return rphonenum;
    }

    public void setRphonenum(Integer rphonenum) {
        this.rphonenum = rphonenum;
    }

    public String getRmail() {
        return rmail;
    }

    public void setRmail(String rmail) {
        this.rmail = rmail;
    }
}
