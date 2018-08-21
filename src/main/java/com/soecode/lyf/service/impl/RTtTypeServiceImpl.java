package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.RTtTypeMapper;
import com.soecode.lyf.entity.TtType;
import com.soecode.lyf.service.RTtTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RTtTypeServiceImpl implements RTtTypeService {
    @Autowired
    RTtTypeMapper rTtTypeMapper;
    public List<TtType> getAllType() {
        return rTtTypeMapper.getAllType();
    }

    public TtType getTtTypeById(String id) {
        return rTtTypeMapper.getTtTypeById(id);
    }
}
