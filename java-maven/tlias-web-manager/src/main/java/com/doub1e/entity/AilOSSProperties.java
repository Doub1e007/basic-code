package com.doub1e.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 配置类
 */
@Data
@Component
@ConfigurationProperties(prefix = "aliyun.oss")
public class AilOSSProperties {
    private String endpoint;
    private String bucket;
}
