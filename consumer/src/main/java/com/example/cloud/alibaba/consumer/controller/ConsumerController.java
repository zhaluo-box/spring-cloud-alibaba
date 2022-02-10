package com.example.cloud.alibaba.consumer.controller;

import com.example.cloud.alibaba.consumer.feign.service.ProviderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/consumers/")
public class ConsumerController {

    @Autowired
    private ProviderService providerService;


    /**
     * 演示 ”Feign“ 简单使用案例
     *
     * @see org.springframework.cloud.openfeign.FeignClient
     */
    @GetMapping
    public String get() {
        String result = providerService.get();
        log.info("feign client test : {}", result);
        return "consumer service test!";
    }

}
