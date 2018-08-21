package com.soecode.lyf.service;

import com.soecode.lyf.entity.TtAuthentification;

public interface RTtAuthentificationService {
    public int addTtAuthentification(TtAuthentification ttAuthentification);
    public TtAuthentification getTtAuthentificationByUserId(String userId);
    public int updateTtAuthentification(TtAuthentification ttAuthentification);
}
