package com.example.cloud.alibaba.api.provider;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/providers/")
public interface ProviderServiceApi {

    @GetMapping
    String get();

}
