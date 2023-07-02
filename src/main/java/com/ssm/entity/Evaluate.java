package com.ssm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 在线客服
 * @TableName evaluate
 */
@TableName(value ="evaluate")
@Data
public class Evaluate implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "eid", type = IdType.AUTO)
    private Long eid;

    /**
     * 创建时间
     */
    @TableField(value = "eaddtime")
    private Date eaddtime;

    /**
     * 房东
     */
    @TableField(value = "oid")
    private Long oid;

    /**
     * 租户
     */
    @TableField(value = "rid")
    private Long rid;

    /**
     * 内容
     */
    @TableField(value = "econtent")
    private String econtent;

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
        Evaluate other = (Evaluate) that;
        return (this.getEid() == null ? other.getEid() == null : this.getEid().equals(other.getEid()))
            && (this.getEaddtime() == null ? other.getEaddtime() == null : this.getEaddtime().equals(other.getEaddtime()))
            && (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()))
            && (this.getEcontent() == null ? other.getEcontent() == null : this.getEcontent().equals(other.getEcontent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEid() == null) ? 0 : getEid().hashCode());
        result = prime * result + ((getEaddtime() == null) ? 0 : getEaddtime().hashCode());
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getEcontent() == null) ? 0 : getEcontent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eid=").append(eid);
        sb.append(", eaddtime=").append(eaddtime);
        sb.append(", oid=").append(oid);
        sb.append(", rid=").append(rid);
        sb.append(", econtent=").append(econtent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}