package com.ssm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 出租订单
 * @TableName contract
 */
@TableName(value ="contract")
@Data
public class Contract implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "cid", type = IdType.AUTO)
    private Long cid;

    /**
     * 创建时间
     */
    @TableField(value = "caddtime")
    private Date caddtime;

    /**
     * 房屋编号
     */
    @TableField(value = "chid")
    private String chid;

    /**
     * 出租定金
     */
    @TableField(value = "cdeposit")
    private String cdeposit;

    /**
     * 出租价格
     */
    @TableField(value = "cprice")
    private String cprice;

    /**
     * 租客id
     */
    @TableField(value = "rid")
    private Long rid;

    /**
     * 房东id
     */
    @TableField(value = "oid")
    private Long oid;

    /**
     * 备注
     */
    @TableField(value = "cnotes")
    private String cnotes;

    /**
     * 
     */
    @TableField(value = "ifownerexamine")
    private String ifownerexamine;

    /**
     * 
     */
    @TableField(value = "ifadminexamine")
    private String ifadminexamine;

    /**
     * 租借月份
     */
    @TableField(value = "leasetime")
    private Integer leasetime;

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
        Contract other = (Contract) that;
        return (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getCaddtime() == null ? other.getCaddtime() == null : this.getCaddtime().equals(other.getCaddtime()))
            && (this.getChid() == null ? other.getChid() == null : this.getChid().equals(other.getChid()))
            && (this.getCdeposit() == null ? other.getCdeposit() == null : this.getCdeposit().equals(other.getCdeposit()))
            && (this.getCprice() == null ? other.getCprice() == null : this.getCprice().equals(other.getCprice()))
            && (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()))
            && (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCnotes() == null ? other.getCnotes() == null : this.getCnotes().equals(other.getCnotes()))
            && (this.getIfownerexamine() == null ? other.getIfownerexamine() == null : this.getIfownerexamine().equals(other.getIfownerexamine()))
            && (this.getIfadminexamine() == null ? other.getIfadminexamine() == null : this.getIfadminexamine().equals(other.getIfadminexamine()))
            && (this.getLeasetime() == null ? other.getLeasetime() == null : this.getLeasetime().equals(other.getLeasetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getCaddtime() == null) ? 0 : getCaddtime().hashCode());
        result = prime * result + ((getChid() == null) ? 0 : getChid().hashCode());
        result = prime * result + ((getCdeposit() == null) ? 0 : getCdeposit().hashCode());
        result = prime * result + ((getCprice() == null) ? 0 : getCprice().hashCode());
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCnotes() == null) ? 0 : getCnotes().hashCode());
        result = prime * result + ((getIfownerexamine() == null) ? 0 : getIfownerexamine().hashCode());
        result = prime * result + ((getIfadminexamine() == null) ? 0 : getIfadminexamine().hashCode());
        result = prime * result + ((getLeasetime() == null) ? 0 : getLeasetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cid=").append(cid);
        sb.append(", caddtime=").append(caddtime);
        sb.append(", chid=").append(chid);
        sb.append(", cdeposit=").append(cdeposit);
        sb.append(", cprice=").append(cprice);
        sb.append(", rid=").append(rid);
        sb.append(", oid=").append(oid);
        sb.append(", cnotes=").append(cnotes);
        sb.append(", ifownerexamine=").append(ifownerexamine);
        sb.append(", ifadminexamine=").append(ifadminexamine);
        sb.append(", leasetime=").append(leasetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}