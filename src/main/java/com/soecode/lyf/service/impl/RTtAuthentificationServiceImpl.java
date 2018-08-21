package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.RTtAuthentificationMapper;
import com.soecode.lyf.entity.TtAuthentification;
import com.soecode.lyf.service.RTtAuthentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RTtAuthentificationServiceImpl implements RTtAuthentificationService {
    @Autowired
    RTtAuthentificationMapper ttAuthentificationMapper;
    public int addTtAuthentification(TtAuthentification ttAuthentification) {
        return ttAuthentificationMapper.addTtAuthentification(ttAuthentification);
    }

    public TtAuthentification getTtAuthentificationByUserId(String userId) {
        return ttAuthentificationMapper.getTtAuthentificationByUserId(userId);
    }

    public int updateTtAuthentification(TtAuthentification ttAuthentification) {
        return ttAuthentificationMapper.updateTtAuthentification(ttAuthentification);
    }
}
