package com.soecode.lyf.dao;

import com.soecode.lyf.entity.TtType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RTtTypeMapper {
    public List<TtType> getAllType();
    public TtType getTtTypeById(@Param("id") String id);
}
