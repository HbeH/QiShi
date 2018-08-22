package com.soecode.lyf.service;

import com.soecode.lyf.entity.TtQiOrder;

public interface RTtQiOrderService {
    public TtQiOrder getTtQiOrderByTtOrderId(String ttOrderId);
    public int addTtQiOrder(TtQiOrder ttQiOrder);
    public int updateQiOrderByTtOrderId(TtQiOrder ttQiOrder);
}
