package com.doub1e.collection_test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok 使用注解简化Get Set 有参 无参构造器的写法
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String number;
    private String color;
}
