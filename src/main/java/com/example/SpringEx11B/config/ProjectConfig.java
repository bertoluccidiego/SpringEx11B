package com.example.SpringEx11B.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.SpringEx11B.proxies")
public class ProjectConfig {
}
