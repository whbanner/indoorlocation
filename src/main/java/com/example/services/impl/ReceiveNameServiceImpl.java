package com.example.services.impl;

import com.example.domain.ReceiveBean;
import com.example.mapper.ReceiveNameMapper;
import com.example.services.ReceiveNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("rn")
public class ReceiveNameServiceImpl implements ReceiveNameService {

    @Autowired
    private ReceiveNameMapper receiveNameMapper;

    @Override
    public ReceiveBean findRName(String rName) {

        return receiveNameMapper.findRName(rName);
    }

    @Override
    public String findAname(Integer aid) {
        return receiveNameMapper.findAname(aid);
    }
}
