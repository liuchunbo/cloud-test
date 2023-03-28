package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Creat by liuchunbo 2023/3/22
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderConsulMain {

    public static void main(String[] args) {

        SpringApplication.run(OrderConsulMain.class, args);
    }

}
