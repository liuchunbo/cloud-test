package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Creat by liuchunbo 2023/3/21
 */
@EnableDiscoveryClient
@SpringBootApplication  //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class PaymentMainZk {

    public static void main(String[] args) {

        SpringApplication.run(PaymentMainZk.class, args);
    }

}
