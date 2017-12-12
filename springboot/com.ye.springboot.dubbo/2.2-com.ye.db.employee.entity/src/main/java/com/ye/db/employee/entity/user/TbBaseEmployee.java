package com.ye.db.employee.entity.user;

import java.math.BigDecimal;
import java.util.Date;

public class TbBaseEmployee {
    private BigDecimal id;

    private String userName;

    private BigDecimal userGender;

    private String nation;

    private String idNumber;

    private String cultureLevel;

    private String politicsStatus;

    private Date birthDate;

    private String mobileTelephone;

    private Date createTime;

    private Date updateTime;

    private BigDecimal isDelete;

    private BigDecimal isSync;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public BigDecimal getUserGender() {
        return userGender;
    }

    public void setUserGender(BigDecimal userGender) {
        this.userGender = userGender;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getCultureLevel() {
        return cultureLevel;
    }

    public void setCultureLevel(String cultureLevel) {
        this.cultureLevel = cultureLevel == null ? null : cultureLevel.trim();
    }

    public String getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus == null ? null : politicsStatus.trim();
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMobileTelephone() {
        return mobileTelephone;
    }

    public void setMobileTelephone(String mobileTelephone) {
        this.mobileTelephone = mobileTelephone == null ? null : mobileTelephone.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(BigDecimal isDelete) {
        this.isDelete = isDelete;
    }

    public BigDecimal getIsSync() {
        return isSync;
    }

    public void setIsSync(BigDecimal isSync) {
        this.isSync = isSync;
    }
}