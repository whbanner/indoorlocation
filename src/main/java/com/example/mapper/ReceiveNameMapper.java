package com.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("receiveNameMapper")
public interface ReceiveNameMapper {
    String findRName(@Param("ReceiveName")String ReceiveName);
}
