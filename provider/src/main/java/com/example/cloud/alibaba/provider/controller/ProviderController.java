package com.example.cloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/providers/")
@RefreshScope // springCloud 原生自带的刷新配置
public class ProviderController {

    @Value("${config.port}")
    private String port;

    @GetMapping
    public String get() {
        return port;
    }
}
