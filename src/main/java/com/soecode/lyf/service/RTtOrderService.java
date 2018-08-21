package com.soecode.lyf.service;

import com.soecode.lyf.entity.TtOrder;

public interface RTtOrderService {
    public int addTtOrder(TtOrder ttOrder);
    public int qishiGetOrder(TtOrder ttOrder);
    public TtOrder getTtOrderByOrderId(String ttOrderId);
}
