package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.RTtUserQiShiMapper;
import com.soecode.lyf.entity.TtUserQiShi;
import com.soecode.lyf.service.RTtUserQiShiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RTtUserQiShiServiceImpl implements RTtUserQiShiService{
    @Autowired
    RTtUserQiShiMapper rTtUserQiShiMapper;
    public TtUserQiShi getTtUserQiShiByTt(String tt) {
        return rTtUserQiShiMapper.getTtUserQiShiByTt(tt);
    }

    public int addTtUserQiShi(TtUserQiShi ttUserQiShi) {
        return rTtUserQiShiMapper.addTtUserQiShi(ttUserQiShi);
    }

    public int updateUserQiShiByTt(TtUserQiShi ttUserQiShi) {
        return rTtUserQiShiMapper.updateUserQiShiByTt(ttUserQiShi);
    }
}
