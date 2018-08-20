package com.soecode.lyf.service;

import com.soecode.lyf.entity.TtUser;

import java.util.List;

public interface TtUserService {
    public int addTtUser(TtUser user);
    public List<String> getAllUserTt();
    public TtUser getTtUserByPhone(String phone);
    public int updateTtUser(TtUser user);
}
