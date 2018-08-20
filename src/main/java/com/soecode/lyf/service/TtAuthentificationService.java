package com.soecode.lyf.service;

import com.soecode.lyf.dao.TtAuthentificationMapper;
import com.soecode.lyf.entity.TtAuthentification;

public interface TtAuthentificationService {
    public int addTtAuthentification(TtAuthentification ttAuthentification);
    public TtAuthentification getTtAuthentificationByUserId(String userId);
    public int updateTtAuthentification(TtAuthentification ttAuthentification);
}
