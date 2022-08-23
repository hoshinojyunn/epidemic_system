package com.yiqing.epidemiccommon.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName leave_registration
 */
@TableName(value ="leave_registration")
public class LeaveRegistration implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 
     */
    @TableId
    private Date leaveTime;

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
    private String leaveReason;

    /**
     * 
     */
    private String leaveAddress;

    /**
     * 
     */
    private String whereToGo;

    /**
     * 
     */
    private String contactMember;

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
    public Date getLeaveTime() {
        return leaveTime;
    }

    /**
     * 
     */
    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
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
    public String getLeaveReason() {
        return leaveReason;
    }

    /**
     * 
     */
    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }

    /**
     * 
     */
    public String getLeaveAddress() {
        return leaveAddress;
    }

    /**
     * 
     */
    public void setLeaveAddress(String leaveAddress) {
        this.leaveAddress = leaveAddress;
    }

    /**
     * 
     */
    public String getWhereToGo() {
        return whereToGo;
    }

    /**
     * 
     */
    public void setWhereToGo(String whereToGo) {
        this.whereToGo = whereToGo;
    }

    /**
     * 
     */
    public String getContactMember() {
        return contactMember;
    }

    /**
     * 
     */
    public void setContactMember(String contactMember) {
        this.contactMember = contactMember;
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
        LeaveRegistration other = (LeaveRegistration) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLeaveTime() == null ? other.getLeaveTime() == null : this.getLeaveTime().equals(other.getLeaveTime()))
            && (this.getTemper() == null ? other.getTemper() == null : this.getTemper().equals(other.getTemper()))
            && (this.getHasMask() == null ? other.getHasMask() == null : this.getHasMask().equals(other.getHasMask()))
            && (this.getLeaveReason() == null ? other.getLeaveReason() == null : this.getLeaveReason().equals(other.getLeaveReason()))
            && (this.getLeaveAddress() == null ? other.getLeaveAddress() == null : this.getLeaveAddress().equals(other.getLeaveAddress()))
            && (this.getWhereToGo() == null ? other.getWhereToGo() == null : this.getWhereToGo().equals(other.getWhereToGo()))
            && (this.getContactMember() == null ? other.getContactMember() == null : this.getContactMember().equals(other.getContactMember()))
            && (this.getHealth() == null ? other.getHealth() == null : this.getHealth().equals(other.getHealth()))
            && (this.getMoreInfo() == null ? other.getMoreInfo() == null : this.getMoreInfo().equals(other.getMoreInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLeaveTime() == null) ? 0 : getLeaveTime().hashCode());
        result = prime * result + ((getTemper() == null) ? 0 : getTemper().hashCode());
        result = prime * result + ((getHasMask() == null) ? 0 : getHasMask().hashCode());
        result = prime * result + ((getLeaveReason() == null) ? 0 : getLeaveReason().hashCode());
        result = prime * result + ((getLeaveAddress() == null) ? 0 : getLeaveAddress().hashCode());
        result = prime * result + ((getWhereToGo() == null) ? 0 : getWhereToGo().hashCode());
        result = prime * result + ((getContactMember() == null) ? 0 : getContactMember().hashCode());
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
        sb.append(", leaveTime=").append(leaveTime);
        sb.append(", temper=").append(temper);
        sb.append(", hasMask=").append(hasMask);
        sb.append(", leaveReason=").append(leaveReason);
        sb.append(", leaveAddress=").append(leaveAddress);
        sb.append(", whereToGo=").append(whereToGo);
        sb.append(", contactMember=").append(contactMember);
        sb.append(", health=").append(health);
        sb.append(", moreInfo=").append(moreInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}