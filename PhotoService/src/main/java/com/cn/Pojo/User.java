package com.cn.Pojo;

import java.util.Date;

/**
 * 用户实体类
 * Created by alfa7055 on 2016/10/13.
 */
public class User {
    private Integer userId;  //用户Id
    private String userName; //用户名
    private String userPwd; //密码
    private String userSex; //性别
    private Date userBirthday; //生日
    private String userTelephone; //电话
    private String userEmail; //邮箱
    private String userAddress; //地址
    private String userRemark; //简介
    private Date createT; //创建时间
    private Date updateT; //修改时间

    public Date getCreateT() {
        return createT;
    }

    public void setCreateT(Date createT) {
        this.createT = createT;
    }

    public Date getUpdateT() {
        return updateT;
    }

    public void setUpdateT(Date updateT) {
        this.updateT = updateT;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }
}
