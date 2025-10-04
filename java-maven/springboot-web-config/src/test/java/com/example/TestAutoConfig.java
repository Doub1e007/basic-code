package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootTest
public class TestAutoConfig {
    @Autowired
    private ApplicationContext context;

    @Test
    public void testGetTokenParser() {
        TokenParser tokenParser = context.getBean(TokenParser.class);
        System.out.println("tokenParser = " + tokenParser);
    }
    @Test
    public void testGetHeaderParser() {
        HeaderParser headerParser = context.getBean(HeaderParser.class);
        System.out.println("headerParser = " + headerParser);
    }
    @Test
    public void testGetHeaderGenerator() {
        HeaderGenerator headerGenerator = context.getBean(HeaderGenerator.class);
        System.out.println("headerGenerator = " + headerGenerator);
    }
}
