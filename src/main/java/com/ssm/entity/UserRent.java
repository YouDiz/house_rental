package com.ssm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户
 * @TableName user_rent
 */
@TableName(value ="user_rent")
@Data
public class UserRent implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "rid", type = IdType.AUTO)
    private Long rid;

    /**
     * 用户名
     */
    @TableField(value = "rusername")
    private String rusername;

    /**
     * 密码
     */
    @TableField(value = "rpwd")
    private String rpwd;

    /**
     * 年龄
     */
    @TableField(value = "rage")
    private String rage;

    /**
     * 性别
     */
    @TableField(value = "rsex")
    private String rsex;

    /**
     * 手机
     */
    @TableField(value = "rphonenum")
    private String rphonenum;

    /**
     * 邮箱
     */
    @TableField(value = "rmail")
    private String rmail;

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
        UserRent other = (UserRent) that;
        return (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()))
            && (this.getRusername() == null ? other.getRusername() == null : this.getRusername().equals(other.getRusername()))
            && (this.getRpwd() == null ? other.getRpwd() == null : this.getRpwd().equals(other.getRpwd()))
            && (this.getRage() == null ? other.getRage() == null : this.getRage().equals(other.getRage()))
            && (this.getRsex() == null ? other.getRsex() == null : this.getRsex().equals(other.getRsex()))
            && (this.getRphonenum() == null ? other.getRphonenum() == null : this.getRphonenum().equals(other.getRphonenum()))
            && (this.getRmail() == null ? other.getRmail() == null : this.getRmail().equals(other.getRmail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getRusername() == null) ? 0 : getRusername().hashCode());
        result = prime * result + ((getRpwd() == null) ? 0 : getRpwd().hashCode());
        result = prime * result + ((getRage() == null) ? 0 : getRage().hashCode());
        result = prime * result + ((getRsex() == null) ? 0 : getRsex().hashCode());
        result = prime * result + ((getRphonenum() == null) ? 0 : getRphonenum().hashCode());
        result = prime * result + ((getRmail() == null) ? 0 : getRmail().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rid=").append(rid);
        sb.append(", rusername=").append(rusername);
        sb.append(", rpwd=").append(rpwd);
        sb.append(", rage=").append(rage);
        sb.append(", rsex=").append(rsex);
        sb.append(", rphonenum=").append(rphonenum);
        sb.append(", rmail=").append(rmail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}