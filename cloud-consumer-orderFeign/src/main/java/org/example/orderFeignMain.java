package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Creat by liuchunbo 2023/3/23
 */
@SpringBootApplication
@EnableFeignClients
public class orderFeignMain {
    public static void main(String[] args) {

        SpringApplication.run(orderFeignMain.class, args);
    }

}
