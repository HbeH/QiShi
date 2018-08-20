package com.soecode.lyf.dao;

import com.soecode.lyf.entity.TtUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TtUserMapper {
    public int addTtUser(TtUser user);
    public List<String> getAllUserTt();
    public TtUser getTtUserByPhone(@Param("phone") String phone);
    public int updateTtUser(TtUser user);
}
