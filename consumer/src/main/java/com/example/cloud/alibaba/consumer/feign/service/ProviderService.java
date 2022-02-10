package com.example.cloud.alibaba.consumer.feign.service;


import com.example.cloud.alibaba.api.provider.ProviderServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "provider")
public interface ProviderService extends ProviderServiceApi {

}
