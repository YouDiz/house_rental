package com.ssm.entity;

import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class EvaluateEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    public EvaluateEntity(){

    }
    public EvaluateEntity(T t){
        try {
            BeanUtils.copyProperties(this, t);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    /**
     * 评价id
     */
    private Long eid;
    /**
     * 房东id
     */
    private Long oid;
    /**
     * 租户id
     */
    private Long rid;
    /**
     * 评价内容
     */
    private String econtent;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date eaddtime;

    public Date getEaddtime() {
        return eaddtime;
    }
    public void setEaddtime(Date eaddtime) {
        this.eaddtime = eaddtime;
    }
    //评价id


    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }
    //租户id

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getRid() {
        return rid;
    }
    //房东id

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {

    }
    //评价内容

    public String getEcontent() {
        return econtent;
    }

    public void setEcontent(String econtent) {
        this.econtent = econtent;
    }
}
