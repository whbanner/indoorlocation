package com.example.services;

import org.apache.ibatis.annotations.Param;

public interface ReceivePointService {
    void insertPoint( String column,Integer aid,  String value,Integer x,Integer y,Integer z);

//    void insertPoint(@Param("column") String column,Integer aid, @Param("value") String value,Integer x,Integer y,Integer z);
}
