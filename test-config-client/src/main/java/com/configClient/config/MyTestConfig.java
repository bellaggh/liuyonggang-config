package com.configClient.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "com.ggh")
@Data
@RefreshScope
public class MyTestConfig {
    private String test;
    private String username;
    private String password;
}
