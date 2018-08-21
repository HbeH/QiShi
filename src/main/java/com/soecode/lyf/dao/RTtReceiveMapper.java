package com.soecode.lyf.dao;

import com.soecode.lyf.entity.TtReceive;
import org.apache.ibatis.annotations.Param;

public interface RTtReceiveMapper {
    public int addtReceive(TtReceive ttReceive);
    public TtReceive gettReceiveByUserId(@Param("userId") String userId);
    public int updatetReceive(TtReceive ttReceive);
}
