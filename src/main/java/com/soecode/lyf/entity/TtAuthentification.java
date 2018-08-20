package com.soecode.lyf.entity;

/**
 * 信息认证表
 */
public class TtAuthentification {
    private Integer id;                 //
    private String userId;              //用户id
    private String name;                //真实姓名
    private String sex;                 //性别
    private String school;              //学校
    private String number;              //学号
    private String type;                //证件类型
    private String frontImg;            //身份证正面
    private String contraryImg;         //身份证反面
    private String createDate;
    private String updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFrontImg() {
        return frontImg;
    }

    public void setFrontImg(String frontImg) {
        this.frontImg = frontImg;
    }

    public String getContraryImg() {
        return contraryImg;
    }

    public void setContraryImg(String contraryImg) {
        this.contraryImg = contraryImg;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
}
