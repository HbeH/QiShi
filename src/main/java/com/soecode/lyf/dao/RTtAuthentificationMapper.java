package com.soecode.lyf.dao;

import com.soecode.lyf.entity.TtAuthentification;
import org.apache.ibatis.annotations.Param;

public interface RTtAuthentificationMapper {
    public int addTtAuthentification(TtAuthentification ttAuthentification);
    public TtAuthentification getTtAuthentificationByUserId(@Param("userId") String userId);
    public int updateTtAuthentification(TtAuthentification ttAuthentification);
}
