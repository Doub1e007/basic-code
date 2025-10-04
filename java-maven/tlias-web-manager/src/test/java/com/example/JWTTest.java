package com.example;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JWTTest {
    /**
     * 测试生成JWT令牌
     */
    @Test
    public void testGenerateJwt(){
        //自定义信息
        Map<String,Object> claims = new HashMap<>();
        claims.put("id",1);
        claims.put("username","Tom");

        //生成jwt令牌
        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256,"doub1e")
                .setClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis() + 12*3600*1000))    //设置过期时间(12小时后失效
                .compact();

        // eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwiZXhwIjoxNzU4MTcwMDE4LCJ1c2VybmFtZSI6IlRvbSJ9.Ll8yXd0AuPzNPLOY1Bxjvm7hNIT8MFpuJru9q_kLH7g
        System.out.println(jwt);
    }

    /**
     * jwt令牌校验
     * 校验失败的两种情况
     * 1.令牌被篡改
     * 2.令牌过期
     */
    @Test
    public void testParseJwt(){
        Claims claims = Jwts.parser().setSigningKey("doub1e")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwiZXhwIjoxNzU4MTcwMDE4LCJ1c2VybmFtZSI6IlRvbSJ9.Ll8yXd0AuPzNPLOY1Bxjvm7hNIT8MFpuJru9q_kLH7g")
                .getBody();
        System.out.println(claims);
    }
}
