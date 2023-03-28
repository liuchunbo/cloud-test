package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Creat by liuchunbo 2023/3/26
 */
//@EnableEurekaClient  不在SpringBoot启动类上标注@EnableEurekaClient注解也可以向注册中心注册
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@Slf4j
public class ConsumerOrderFeignHystrixMain {
    public static void main(String[] args) {

        SpringApplication.run(ConsumerOrderFeignHystrixMain.class, args);
    }

}
