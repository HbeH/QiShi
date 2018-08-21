package com.soecode.lyf.service;

import com.soecode.lyf.entity.TtReceive;

public interface RTtReceiveService {
    public int addtReceive(TtReceive ttReceive);
    public TtReceive gettReceiveByUserId(String userId);
    public int updatetReceive(TtReceive ttReceive);
}
