package com.ye.dubbo.user.dao.entity;

import java.util.Date;


public class TbBaseEmployee {
    private Integer id;

    private String trueName;

    private String idNumber;

    private Integer gender;

    private String nation;

    private String cultureLevel;

    private String politicsStatus;

    private Date birthDate;

    private String mobile;

    private Date createTime;

    private Date updateTime;

    private Boolean isCachedUpdated;

    private Boolean isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName == null ? null : trueName.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
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

    public Boolean getIsCachedUpdated() {
        return isCachedUpdated;
    }

    public void setIsCachedUpdated(Boolean isCachedUpdated) {
        this.isCachedUpdated = isCachedUpdated;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}