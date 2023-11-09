package com.iweb.chapter02;


//lombok:简化setter getter方法etc
//1.安装lombok插件
//2.导入lombok的jar包

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter
//@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private String uid;
	private String username;
    private String password;
    private String gender;
    private String hobby;
    private String description;


}
