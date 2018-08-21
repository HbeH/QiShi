package com.soecode.lyf.service;

import com.soecode.lyf.entity.TtSureOrder;

import java.util.List;

public interface RTtSureOrderService {
    public int addTtSureOrder(TtSureOrder ttSureOrder);
    public List<TtSureOrder> getTtSureOrdersByUserIdAndStatus(String userId, String status);
    public int updateStatus(TtSureOrder ttSureOrder);
    public TtSureOrder getTtSureOrderByOrderId(String ttOrderId);
}
