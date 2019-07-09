package com.admin.sys.entity;

import java.util.Date;

public class SystemOperator extends BaseEntity {
	
    private String operatorId;

    private String loginName;

    private String name;

    private String personGender;

    private String contactNumber;

    private Date vaildDatetime;

    private String password;

    private Date updatePasswordTime;

    private Date lastLoginTime;

    private Integer loginFailedTimes;

    private String lastLoginAddress;

    private String active;

    private Date nextLoginTime;

    private String isFirst;

    private String isLogin;


    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender == null ? null : personGender.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public Date getVaildDatetime() {
        return vaildDatetime;
    }

    public void setVaildDatetime(Date vaildDatetime) {
        this.vaildDatetime = vaildDatetime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getUpdatePasswordTime() {
        return updatePasswordTime;
    }

    public void setUpdatePasswordTime(Date updatePasswordTime) {
        this.updatePasswordTime = updatePasswordTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getLoginFailedTimes() {
        return loginFailedTimes;
    }

    public void setLoginFailedTimes(Integer loginFailedTimes) {
        this.loginFailedTimes = loginFailedTimes;
    }

    public String getLastLoginAddress() {
        return lastLoginAddress;
    }

    public void setLastLoginAddress(String lastLoginAddress) {
        this.lastLoginAddress = lastLoginAddress == null ? null : lastLoginAddress.trim();
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active == null ? null : active.trim();
    }

    public Date getNextLoginTime() {
        return nextLoginTime;
    }

    public void setNextLoginTime(Date nextLoginTime) {
        this.nextLoginTime = nextLoginTime;
    }

    public String getIsFirst() {
        return isFirst;
    }

    public void setIsFirst(String isFirst) {
        this.isFirst = isFirst == null ? null : isFirst.trim();
    }

    public String getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(String isLogin) {
        this.isLogin = isLogin == null ? null : isLogin.trim();
    }
}