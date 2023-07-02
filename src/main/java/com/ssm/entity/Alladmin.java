package com.ssm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户表
 * @TableName alladmin
 */
@TableName(value ="alladmin")
@Data
public class Alladmin implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "aaid", type = IdType.AUTO)
    private Long aaid;

    /**
     * 用户名
     */
    @TableField(value = "aaname")
    private String aaname;

    /**
     * 密码
     */
    @TableField(value = "aapwd")
    private String aapwd;

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
        Alladmin other = (Alladmin) that;
        return (this.getAaid() == null ? other.getAaid() == null : this.getAaid().equals(other.getAaid()))
            && (this.getAaname() == null ? other.getAaname() == null : this.getAaname().equals(other.getAaname()))
            && (this.getAapwd() == null ? other.getAapwd() == null : this.getAapwd().equals(other.getAapwd()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAaid() == null) ? 0 : getAaid().hashCode());
        result = prime * result + ((getAaname() == null) ? 0 : getAaname().hashCode());
        result = prime * result + ((getAapwd() == null) ? 0 : getAapwd().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aaid=").append(aaid);
        sb.append(", aaname=").append(aaname);
        sb.append(", aapwd=").append(aapwd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}