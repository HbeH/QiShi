package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.TtUserMapper;
import com.soecode.lyf.entity.TtUser;
import com.soecode.lyf.service.TtUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TtUserServiceImpl implements TtUserService{

    @Autowired
    TtUserMapper ttUserMapper;

    public int addTtUser(TtUser user) {
        return ttUserMapper.addTtUser(user);
    }

    public List<String> getAllUserTt() {
        return ttUserMapper.getAllUserTt();
    }

    public TtUser getTtUserByPhone(String phone) {
        return ttUserMapper.getTtUserByPhone(phone);
    }

    public int updateTtUser(TtUser user) {
        return ttUserMapper.updateTtUser(user);
    }
}
