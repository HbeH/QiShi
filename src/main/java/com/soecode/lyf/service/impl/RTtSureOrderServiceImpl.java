package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.RTtSureOrderMapper;
import com.soecode.lyf.entity.TtSureOrder;
import com.soecode.lyf.service.RTtSureOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RTtSureOrderServiceImpl implements RTtSureOrderService{
    @Autowired
    RTtSureOrderMapper rTtSureOrderMapper;
    public int addTtSureOrder(TtSureOrder ttSureOrder) {
        return rTtSureOrderMapper.addTtSureOrder(ttSureOrder);
    }

    public List<TtSureOrder> getTtSureOrdersByUserIdAndStatus(String userId, String status) {
        return rTtSureOrderMapper.getTtSureOrdersByUserIdAndStatus(userId,status);
    }

    public int updateStatus(TtSureOrder ttSureOrder) {
        return rTtSureOrderMapper.updateStatus(ttSureOrder);
    }

    public TtSureOrder getTtSureOrderByOrderId(String ttOrderId) {
        return rTtSureOrderMapper.getTtSureOrderByOrderId(ttOrderId);
    }
}
