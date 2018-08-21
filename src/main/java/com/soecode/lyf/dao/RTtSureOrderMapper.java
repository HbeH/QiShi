package com.soecode.lyf.dao;

import com.soecode.lyf.entity.TtSureOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RTtSureOrderMapper {
    public int addTtSureOrder(TtSureOrder ttSureOrder);
    public List<TtSureOrder> getTtSureOrdersByUserIdAndStatus(@Param("userId") String userId,@Param("status") String status);
    public int updateStatus(TtSureOrder ttSureOrder);
    public TtSureOrder getTtSureOrderByOrderId(@Param("ttOrderId") String ttOrderId);
}
