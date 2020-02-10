package com.example.services.impl;

import com.example.mapper.ReceiveNameMapper;
import com.example.services.ReceiveNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("rn")
public class ReceiveNameServiceImpl implements ReceiveNameService {

    @Autowired
    private ReceiveNameMapper receiveNameMapper;

    @Override
    public String findRName(String rName) {

        return receiveNameMapper.findRName(rName);
    }
}
