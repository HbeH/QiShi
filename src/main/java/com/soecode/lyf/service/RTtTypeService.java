package com.soecode.lyf.service;

import com.soecode.lyf.entity.TtType;

import java.util.List;

public interface RTtTypeService {
    public List<TtType> getAllType();
    public TtType getTtTypeById(String id);
}
