package com.ssm.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 系统公告
 * @TableName news
 */
@TableName(value ="news")
@Data
public class News implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Long nid;

    /**
     * 创建时间
     */
    private Date naddtime;

    /**
     * 标题
     */
    private String ntitle;

    /**
     * 图片
     */
    private String npicture;

    /**
     * 内容
     */
    private String ncontent;

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
        News other = (News) that;
        return (this.getNid() == null ? other.getNid() == null : this.getNid().equals(other.getNid()))
            && (this.getNaddtime() == null ? other.getNaddtime() == null : this.getNaddtime().equals(other.getNaddtime()))
            && (this.getNtitle() == null ? other.getNtitle() == null : this.getNtitle().equals(other.getNtitle()))
            && (this.getNpicture() == null ? other.getNpicture() == null : this.getNpicture().equals(other.getNpicture()))
            && (this.getNcontent() == null ? other.getNcontent() == null : this.getNcontent().equals(other.getNcontent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNid() == null) ? 0 : getNid().hashCode());
        result = prime * result + ((getNaddtime() == null) ? 0 : getNaddtime().hashCode());
        result = prime * result + ((getNtitle() == null) ? 0 : getNtitle().hashCode());
        result = prime * result + ((getNpicture() == null) ? 0 : getNpicture().hashCode());
        result = prime * result + ((getNcontent() == null) ? 0 : getNcontent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nid=").append(nid);
        sb.append(", naddtime=").append(naddtime);
        sb.append(", ntitle=").append(ntitle);
        sb.append(", npicture=").append(npicture);
        sb.append(", ncontent=").append(ncontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}