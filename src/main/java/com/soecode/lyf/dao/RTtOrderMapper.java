package com.soecode.lyf.dao;

import com.soecode.lyf.entity.TtOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RTtOrderMapper {
    public int addTtOrder(TtOrder ttOrder);
    public int qishiGetOrder(TtOrder ttOrder);
    public TtOrder getTtOrderByOrderId(@Param("ttOrderId") String ttOrderId);
}
