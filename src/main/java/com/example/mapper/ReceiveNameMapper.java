package com.example.mapper;

import com.example.domain.ReceiveBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository("receiveNameMapper")
public interface ReceiveNameMapper {
    ReceiveBean findRName(String ReceiveName);
}
