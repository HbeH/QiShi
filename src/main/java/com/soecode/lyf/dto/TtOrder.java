package com.soecode.lyf.dto;

/**
 * 订单表 帮我送 帮我取  帮我买
 */
public class TtOrder {
    private Integer id;
    private String userId;              //用户id
    private String ttOrderId;           //订单编号
    private String ttTypeId;            //表里面的信息
    private String typeOrder;           //帮我取0 帮我送 1 帮我买 2
    private String getPhone;            //取货联系方式
    private String getAddress;          //取货地址
    private String getDetail;           //取货详细地址
    private String receivePhone;        //收货联系方式
    private String receiveAddress;      //收货地址
    private String receiveDetail;       //收货详细地址
    private String version;             //高并发
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

    public String getTtOrderId() {
        return ttOrderId;
    }

    public void setTtOrderId(String ttOrderId) {
        this.ttOrderId = ttOrderId;
    }

    public String getTtTypeId() {
        return ttTypeId;
    }

    public void setTtTypeId(String ttTypeId) {
        this.ttTypeId = ttTypeId;
    }

    public String getTypeOrder() {
        return typeOrder;
    }

    public void setTypeOrder(String typeOrder) {
        this.typeOrder = typeOrder;
    }

    public String getGetPhone() {
        return getPhone;
    }

    public void setGetPhone(String getPhone) {
        this.getPhone = getPhone;
    }

    public String getGetAddress() {
        return getAddress;
    }

    public void setGetAddress(String getAddress) {
        this.getAddress = getAddress;
    }

    public String getGetDetail() {
        return getDetail;
    }

    public void setGetDetail(String getDetail) {
        this.getDetail = getDetail;
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public String getReceiveDetail() {
        return receiveDetail;
    }

    public void setReceiveDetail(String receiveDetail) {
        this.receiveDetail = receiveDetail;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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
