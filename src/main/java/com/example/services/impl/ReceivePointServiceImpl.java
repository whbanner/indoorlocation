package com.example.services.impl;

import com.example.mapper.GetMapMapper;
import com.example.mapper.ReceiveNameMapper;
import com.example.services.ReceivePointService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("rp")
public class ReceivePointServiceImpl implements ReceivePointService {

    @Autowired
    GetMapMapper getMapMapper;


    @Override
    public void insertPoint(String column, Integer aid, String value, Integer x, Integer y, Integer z) {
        getMapMapper.insertPoint(column,aid,value,x,y,z);
    }
}
