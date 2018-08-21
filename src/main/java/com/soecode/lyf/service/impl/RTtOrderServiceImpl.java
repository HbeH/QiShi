package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.RTtOrderMapper;
import com.soecode.lyf.entity.TtOrder;
import com.soecode.lyf.service.RTtOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RTtOrderServiceImpl implements RTtOrderService{
    @Autowired
    RTtOrderMapper rTtOrderMapper;
    public int addTtOrder(TtOrder ttOrder) {
        return rTtOrderMapper.addTtOrder(ttOrder);
    }

    public int qishiGetOrder(TtOrder ttOrder) {
        return rTtOrderMapper.qishiGetOrder(ttOrder);
    }

    public TtOrder getTtOrderByOrderId(String ttOrderId) {
        return rTtOrderMapper.getTtOrderByOrderId(ttOrderId);
    }
}
