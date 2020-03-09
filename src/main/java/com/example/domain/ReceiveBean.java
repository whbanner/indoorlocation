package com.example.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ReceiveBean {
    private String username;
    private String password;
    private String receivename;
    private Integer x;
    private Integer y;
    private Integer z;
    //商店
    private String sname;
    //扶梯
    private String fname;
    //电梯
    private String dname;


}
