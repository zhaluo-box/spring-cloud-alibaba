package com.example.cloud.alibaba.api.consumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/consumers/")
public interface ConsumerServiceApi {

    @GetMapping
    String get();

}
