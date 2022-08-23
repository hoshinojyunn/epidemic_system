package com.yiqing.epidemiccommon.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName enter_registration
 */
@TableName(value ="enter_registration")
public class EnterRegistration implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 
     */
    @TableId
    private Date enterTime;

    /**
     * 
     */
    private Double temper;

    /**
     * 
     */
    private Boolean hasMask;

    /**
     * 
     */
    private Boolean isEpidemicLocate;

    /**
     * 
     */
    private String health;

    /**
     * 
     */
    private String moreInfo;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     */
    public Date getEnterTime() {
        return enterTime;
    }

    /**
     * 
     */
    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }

    /**
     * 
     */
    public Double getTemper() {
        return temper;
    }

    /**
     * 
     */
    public void setTemper(Double temper) {
        this.temper = temper;
    }

    /**
     * 
     */
    public Boolean getHasMask() {
        return hasMask;
    }

    /**
     * 
     */
    public void setHasMask(Boolean hasMask) {
        this.hasMask = hasMask;
    }

    /**
     * 
     */
    public Boolean getIsEpidemicLocate() {
        return isEpidemicLocate;
    }

    /**
     * 
     */
    public void setIsEpidemicLocate(Boolean isEpidemicLocate) {
        this.isEpidemicLocate = isEpidemicLocate;
    }

    /**
     * 
     */
    public String getHealth() {
        return health;
    }

    /**
     * 
     */
    public void setHealth(String health) {
        this.health = health;
    }

    /**
     * 
     */
    public String getMoreInfo() {
        return moreInfo;
    }

    /**
     * 
     */
    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

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
        EnterRegistration other = (EnterRegistration) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEnterTime() == null ? other.getEnterTime() == null : this.getEnterTime().equals(other.getEnterTime()))
            && (this.getTemper() == null ? other.getTemper() == null : this.getTemper().equals(other.getTemper()))
            && (this.getHasMask() == null ? other.getHasMask() == null : this.getHasMask().equals(other.getHasMask()))
            && (this.getIsEpidemicLocate() == null ? other.getIsEpidemicLocate() == null : this.getIsEpidemicLocate().equals(other.getIsEpidemicLocate()))
            && (this.getHealth() == null ? other.getHealth() == null : this.getHealth().equals(other.getHealth()))
            && (this.getMoreInfo() == null ? other.getMoreInfo() == null : this.getMoreInfo().equals(other.getMoreInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEnterTime() == null) ? 0 : getEnterTime().hashCode());
        result = prime * result + ((getTemper() == null) ? 0 : getTemper().hashCode());
        result = prime * result + ((getHasMask() == null) ? 0 : getHasMask().hashCode());
        result = prime * result + ((getIsEpidemicLocate() == null) ? 0 : getIsEpidemicLocate().hashCode());
        result = prime * result + ((getHealth() == null) ? 0 : getHealth().hashCode());
        result = prime * result + ((getMoreInfo() == null) ? 0 : getMoreInfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", enterTime=").append(enterTime);
        sb.append(", temper=").append(temper);
        sb.append(", hasMask=").append(hasMask);
        sb.append(", isEpidemicLocate=").append(isEpidemicLocate);
        sb.append(", health=").append(health);
        sb.append(", moreInfo=").append(moreInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}