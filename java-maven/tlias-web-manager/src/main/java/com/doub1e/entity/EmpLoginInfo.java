package com.doub1e.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpLoginInfo {

    private Integer id;
    private String name;
    private String username;
    private String token;
}
