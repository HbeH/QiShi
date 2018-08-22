package com.soecode.lyf.dao;

import com.soecode.lyf.entity.TtUserQiShi;
import org.apache.ibatis.annotations.Param;

public interface RTtUserQiShiMapper {
    public TtUserQiShi getTtUserQiShiByTt(@Param("tt") String tt);
    public int addTtUserQiShi(TtUserQiShi ttUserQiShi);
    public int updateUserQiShiByTt(TtUserQiShi ttUserQiShi);
}
