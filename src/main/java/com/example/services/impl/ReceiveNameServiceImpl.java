package com.example.services.impl;

import com.example.mapper.ReceiveNameMapper;
import com.example.services.ReceiveNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiveNameServiceImpl implements ReceiveNameService {
    @Autowired
    ReceiveNameMapper rn;

    @Override
    public String findRName(String rName) {

        return rn.findRName(rName);
    }
}
