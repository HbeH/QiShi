package com.soecode.lyf.dto;

/**
 * 订单表 帮我送 帮我取  帮我买
 */
public class TtType {
    private Integer id;
    private String name;                //快递 美食  文件 其他 零食 饮品 蛋糕 餐点
    private String price;               //不同类型的价格

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
