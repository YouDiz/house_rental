package com.ssm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class ContractEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
   /* public ContractEntity(){

    };
    public ContractEntity(T t){
        try {
            BeanUtils.copyProperties(this, t);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }*/
    /**
     * 主键id
     */
    private long cid;

    /**
     * 房源id
     */
    private long chid;

    /**
     * 定金
     */
    private String cdeposit;

    /**
     * 价格
     */
    private String cprice;

    /**
     * 租户id
     */
    private  String rid;

    /**
     * 房东id
     */
    private  String oid;

    /**
     * 备注
     */
    private String cnote;

    /**
     * 房东确认
     */
    private String ifownerexamine;

    /**
     * 管理员确认
     */
    private String ifadminexamine;

    /**
     * 租房时间
     */
    private int leasetime;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date caddtime;

    public Date getCaddtime() {
        return caddtime;
    }
    public void setCaddtime(Date caddtime) {
        this.caddtime = caddtime;
    }

    //主键
    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }
    //房源id
    public long getChid() {
        return chid;
    }

    public void setChid(long chid) {
        this.chid = chid;
    }
    //定金
    public String getCdeposit() {
        return cdeposit;
    }

    public void setCdeposit(String cdeposit) {
        this.cdeposit = cdeposit;
    }
    //价格

    public String getCprice() {
        return cprice;
    }

    public void setCprice(String cprice) {
        this.cprice = cprice;
    }
    //租户id

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }
    //房东id


    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }
    //备注

    public String getCnote() {
        return cnote;
    }

    public void setCnote(String cnote) {
        this.cnote = cnote;
    }
    //房东确认

    public String getIfownerexamine() {
        return ifownerexamine;
    }

    public void setIfownerexamine(String ifownerexamine) {
        this.ifownerexamine = ifownerexamine;
    }
    //管理员确认

    public String getIfadminexamine() {
        return ifadminexamine;
    }

    public void setIfadminexamine(String ifadminexamine) {
        this.ifadminexamine = ifadminexamine;
    }
    //租房时间

    public int getLeasetime() {
        return leasetime;
    }

    public void setLeasetime(int leasetime) {
        this.leasetime = leasetime;
    }
}
