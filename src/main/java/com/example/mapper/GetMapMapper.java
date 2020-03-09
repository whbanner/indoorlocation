package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("getMapMapper")
public interface GetMapMapper {

    void insertPoint(@Param("column") String column, Integer aid, @Param("value") String value, Integer x, Integer y, Integer z);

}
