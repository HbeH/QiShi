package com.soecode.lyf.service;

import com.soecode.lyf.entity.TtUserQiShi;

public interface RTtUserQiShiService {
    public TtUserQiShi getTtUserQiShiByTt(String tt);
    public int addTtUserQiShi(TtUserQiShi ttUserQiShi);
    public int updateUserQiShiByTt(TtUserQiShi ttUserQiShi);
}
