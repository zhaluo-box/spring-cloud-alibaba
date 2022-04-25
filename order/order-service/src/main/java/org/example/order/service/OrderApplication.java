package org.example.order.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created  on 2022/4/24 16:16:21
 *
 * @author zl
 */
@EnableFeignClients(basePackages = { "org.example" })
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("org.example.order.service.mapper")
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class);
    }
}
