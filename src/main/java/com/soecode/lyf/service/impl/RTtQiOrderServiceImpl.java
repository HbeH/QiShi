package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.RTtQiOrderMapper;
import com.soecode.lyf.entity.TtQiOrder;
import com.soecode.lyf.service.RTtQiOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RTtQiOrderServiceImpl implements RTtQiOrderService{
    @Autowired
    RTtQiOrderMapper rTtQiOrderMapper;
    public TtQiOrder getTtQiOrderByTtOrderId(String ttOrderId) {
        return rTtQiOrderMapper.getTtQiOrderByTtOrderId(ttOrderId);
    }

    public int addTtQiOrder(TtQiOrder ttQiOrder) {
        return rTtQiOrderMapper.addTtQiOrder(ttQiOrder);
    }

    public int updateQiOrderByTtOrderId(TtQiOrder ttQiOrder) {
        return rTtQiOrderMapper.updateQiOrderByTtOrderId(ttQiOrder);
    }
}
