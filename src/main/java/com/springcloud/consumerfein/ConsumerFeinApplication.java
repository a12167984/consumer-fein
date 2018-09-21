package com.springcloud.consumerfein;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients            //使用fein 实现消费者，自动包括负载均衡
@EnableDiscoveryClient          //自动向服务中心注册
@SpringBootApplication          //springboot 核心注解
public class ConsumerFeinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeinApplication.class, args);
    }
}
