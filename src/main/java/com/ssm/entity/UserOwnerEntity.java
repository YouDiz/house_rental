package com.ssm.entity;

public class UserOwnerEntity {
    private static final long serialVersionUID = 1L;
    /**
     * 房东id
     */
    private String oid;
    /**
     * 房东名称
     */
    private String ousername;
    /**
     * 房东密码
     */
    private String opwd;
    /**
     * 房东年龄
     */
    private String oage;
    /**
     * 房东性别
     */
    private String osex;
    /**
     * 房东电话
     */
    private String ophonenum;
    /**
     * 房东电子邮件
     */
    private String omail;
    //房东id

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }
    //房东名称

    public String getOusername() {
        return ousername;
    }

    public void setOusername(String ousername) {
        this.ousername = ousername;
    }
    //房东年龄

    public String getOage() {
        return oage;
    }

    public void setOage(String oage) {
        this.oage = oage;
    }
    //房东性别

    public String getOsex() {
        return osex;
    }

    public void setOsex(String osex) {
        this.osex = osex;
    }
    //房东电话

    public String getOphonenum() {
        return ophonenum;
    }

    public void setOphonenum(String ophonenum) {
        this.ophonenum = ophonenum;
    }
    //房东密码

    public String getOpwd() {
        return opwd;
    }

    public void setOpwd(String opwd) {
        this.opwd = opwd;
    }
    //房东电子邮件

    public String getOmail() {
        return omail;
    }

    public void setOmail(String omail) {
        this.omail = omail;
    }

}
