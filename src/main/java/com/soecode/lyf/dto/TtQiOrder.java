package com.soecode.lyf.dto;

/**
 * 订单安排给骑士
 */
public class TtQiOrder {
    private Integer id;
    private String ttUserId;            //tt用户id
    private String qiShiUserId;         //骑士用户id
    private String ttOrderId;           //订单编号
    private String speed;               //速度  1  2  3星
    private String serve;               //服务  1  2  3星
    private String additional;          //追评  1  2  3星
    private String message;             //留言
    private String createDate;
    private String updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTtUserId() {
        return ttUserId;
    }

    public void setTtUserId(String ttUserId) {
        this.ttUserId = ttUserId;
    }

    public String getQiShiUserId() {
        return qiShiUserId;
    }

    public void setQiShiUserId(String qiShiUserId) {
        this.qiShiUserId = qiShiUserId;
    }

    public String getTtOrderId() {
        return ttOrderId;
    }

    public void setTtOrderId(String ttOrderId) {
        this.ttOrderId = ttOrderId;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getServe() {
        return serve;
    }

    public void setServe(String serve) {
        this.serve = serve;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
