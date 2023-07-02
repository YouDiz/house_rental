package com.ssm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户
 * @TableName user_owner
 */
@TableName(value ="user_owner")
@Data
public class UserOwner implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "oid")
    private Long oid;

    /**
     * 用户名
     */
    @TableField(value = "oname")
    private String oname;

    /**
     * 密码
     */
    @TableField(value = "opwd")
    private String opwd;

    /**
     * 年龄
     */
    @TableField(value = "oage")
    private String oage;

    /**
     * 性别
     */
    @TableField(value = "osex")
    private String osex;

    /**
     * 手机
     */
    @TableField(value = "ophonenum")
    private String ophonenum;

    /**
     * 邮箱
     */
    @TableField(value = "omail")
    private String omail;

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
        UserOwner other = (UserOwner) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getOname() == null ? other.getOname() == null : this.getOname().equals(other.getOname()))
            && (this.getOpwd() == null ? other.getOpwd() == null : this.getOpwd().equals(other.getOpwd()))
            && (this.getOage() == null ? other.getOage() == null : this.getOage().equals(other.getOage()))
            && (this.getOsex() == null ? other.getOsex() == null : this.getOsex().equals(other.getOsex()))
            && (this.getOphonenum() == null ? other.getOphonenum() == null : this.getOphonenum().equals(other.getOphonenum()))
            && (this.getOmail() == null ? other.getOmail() == null : this.getOmail().equals(other.getOmail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getOname() == null) ? 0 : getOname().hashCode());
        result = prime * result + ((getOpwd() == null) ? 0 : getOpwd().hashCode());
        result = prime * result + ((getOage() == null) ? 0 : getOage().hashCode());
        result = prime * result + ((getOsex() == null) ? 0 : getOsex().hashCode());
        result = prime * result + ((getOphonenum() == null) ? 0 : getOphonenum().hashCode());
        result = prime * result + ((getOmail() == null) ? 0 : getOmail().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", oname=").append(oname);
        sb.append(", opwd=").append(opwd);
        sb.append(", oage=").append(oage);
        sb.append(", osex=").append(osex);
        sb.append(", ophonenum=").append(ophonenum);
        sb.append(", omail=").append(omail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}