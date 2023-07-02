package com.ssm.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 房屋租售
 * @TableName houseimfomatiom
 */
@TableName(value ="houseimfomatiom")
@Data
public class Houseimfomatiom implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Long hid;

    /**
     * 创建时间
     */
    private Date haddtime;

    /**
     * 房屋编号
     */
    private String hhousenum;

    /**
     * 标题
     */
    private String htitle;

    /**
     * 房型
     */
    private String hhousetype;

    /**
     * 图片
     */
    private String hpicture;

    /**
     * 地址
     */
    private String haddress;

    /**
     * 出租定金
     */
    private String hdeposit;

    /**
     * 出租价格
     */
    private String hprice;

    /**
     * 房屋基本信息
     */
    private String himformation;

    /**
     * 房屋面积
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
     * 
     */
    private Long oid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Houseimfomatiom other = (Houseimfomatiom) that;
        return (this.getHid() == null ? other.getHid() == null : this.getHid().equals(other.getHid()))
            && (this.getHaddtime() == null ? other.getHaddtime() == null : this.getHaddtime().equals(other.getHaddtime()))
            && (this.getHhousenum() == null ? other.getHhousenum() == null : this.getHhousenum().equals(other.getHhousenum()))
            && (this.getHtitle() == null ? other.getHtitle() == null : this.getHtitle().equals(other.getHtitle()))
            && (this.getHhousetype() == null ? other.getHhousetype() == null : this.getHhousetype().equals(other.getHhousetype()))
            && (this.getHpicture() == null ? other.getHpicture() == null : this.getHpicture().equals(other.getHpicture()))
            && (this.getHaddress() == null ? other.getHaddress() == null : this.getHaddress().equals(other.getHaddress()))
            && (this.getHdeposit() == null ? other.getHdeposit() == null : this.getHdeposit().equals(other.getHdeposit()))
            && (this.getHprice() == null ? other.getHprice() == null : this.getHprice().equals(other.getHprice()))
            && (this.getHimformation() == null ? other.getHimformation() == null : this.getHimformation().equals(other.getHimformation()))
            && (this.getHhousearea() == null ? other.getHhousearea() == null : this.getHhousearea().equals(other.getHhousearea()))
            && (this.getHhousefloor() == null ? other.getHhousefloor() == null : this.getHhousefloor().equals(other.getHhousefloor()))
            && (this.getHhousedirection() == null ? other.getHhousedirection() == null : this.getHhousedirection().equals(other.getHhousedirection()))
            && (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHid() == null) ? 0 : getHid().hashCode());
        result = prime * result + ((getHaddtime() == null) ? 0 : getHaddtime().hashCode());
        result = prime * result + ((getHhousenum() == null) ? 0 : getHhousenum().hashCode());
        result = prime * result + ((getHtitle() == null) ? 0 : getHtitle().hashCode());
        result = prime * result + ((getHhousetype() == null) ? 0 : getHhousetype().hashCode());
        result = prime * result + ((getHpicture() == null) ? 0 : getHpicture().hashCode());
        result = prime * result + ((getHaddress() == null) ? 0 : getHaddress().hashCode());
        result = prime * result + ((getHdeposit() == null) ? 0 : getHdeposit().hashCode());
        result = prime * result + ((getHprice() == null) ? 0 : getHprice().hashCode());
        result = prime * result + ((getHimformation() == null) ? 0 : getHimformation().hashCode());
        result = prime * result + ((getHhousearea() == null) ? 0 : getHhousearea().hashCode());
        result = prime * result + ((getHhousefloor() == null) ? 0 : getHhousefloor().hashCode());
        result = prime * result + ((getHhousedirection() == null) ? 0 : getHhousedirection().hashCode());
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hid=").append(hid);
        sb.append(", haddtime=").append(haddtime);
        sb.append(", hhousenum=").append(hhousenum);
        sb.append(", htitle=").append(htitle);
        sb.append(", hhousetype=").append(hhousetype);
        sb.append(", hpicture=").append(hpicture);
        sb.append(", haddress=").append(haddress);
        sb.append(", hdeposit=").append(hdeposit);
        sb.append(", hprice=").append(hprice);
        sb.append(", himformation=").append(himformation);
        sb.append(", hhousearea=").append(hhousearea);
        sb.append(", hhousefloor=").append(hhousefloor);
        sb.append(", hhousedirection=").append(hhousedirection);
        sb.append(", oid=").append(oid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}