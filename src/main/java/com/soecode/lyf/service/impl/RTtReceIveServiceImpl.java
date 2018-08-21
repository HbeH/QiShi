package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.RTtReceiveMapper;
import com.soecode.lyf.entity.TtReceive;
import com.soecode.lyf.service.RTtReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RTtReceIveServiceImpl implements RTtReceiveService{
    @Autowired
    RTtReceiveMapper rTtReceiveMapper;
    public int addtReceive(TtReceive ttReceive) {
        return rTtReceiveMapper.addtReceive(ttReceive);
    }

    public TtReceive gettReceiveByUserId(String userId) {
        return rTtReceiveMapper.gettReceiveByUserId(userId);
    }

    public int updatetReceive(TtReceive ttReceive) {
        return rTtReceiveMapper.updatetReceive(ttReceive);
    }
}
