package org.example.storage.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created  on 2022/4/18 21:21:22
 *
 * @author zl
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("org.example.storage.service.mapper")
public class StorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageApplication.class, args);
    }
}
