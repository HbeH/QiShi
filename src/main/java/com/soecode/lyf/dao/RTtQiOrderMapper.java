package com.soecode.lyf.dao;

import com.soecode.lyf.entity.TtQiOrder;
import org.apache.ibatis.annotations.Param;

public interface RTtQiOrderMapper {
    public TtQiOrder getTtQiOrderByTtOrderId(@Param("ttOrderId") String ttOrderId);
    public int addTtQiOrder(TtQiOrder ttQiOrder);
    public int updateQiOrderByTtOrderId(TtQiOrder ttQiOrder);
}
