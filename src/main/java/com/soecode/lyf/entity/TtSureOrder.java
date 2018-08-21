package com.soecode.lyf.entity;

/**
 * 订单表确认地址信息后
 */
public class TtSureOrder {
    private Integer id;
    private String userId;                  //用户id
    private String ttOrderId;               //订单编号
    private String ttCouponId;              //优惠卷id
    private String ttTypeOrder;             //帮我取0 帮我送 1 帮我买 2
    private String time;                    //取货时间
    private String level;                   //取货等级 立即 0 加急 1 预约 2
    private String remark;                  //备注信息
    private String price;                   //商品价格 到货后支付给骑士
    private String totalPrice;              //总费用
    private String status;                  //订单状态 0待接单  1进行中   2已完成    3待评价    4已取消
    private String createDate;
    private String updateDate;

    public String getTtTypeOrder() {
        return ttTypeOrder;
    }

    public void setTtTypeOrder(String ttTypeOrder) {
        this.ttTypeOrder = ttTypeOrder;
    }

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

    public String getTtCouponId() {
        return ttCouponId;
    }

    public void setTtCouponId(String ttCouponId) {
        this.ttCouponId = ttCouponId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
