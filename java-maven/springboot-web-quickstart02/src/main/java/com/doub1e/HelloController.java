package com.doub1e;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello() {
        System.out.println("Hello World.........");
        return "Hello World! 22222";
    }
}
