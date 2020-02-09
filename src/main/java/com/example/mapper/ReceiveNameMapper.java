package com.example.mapper;

import org.apache.ibatis.annotations.Param;

public interface ReceiveNameMapper {
    String findRName(@Param("ReceiveName")String ReceiveName);
}
