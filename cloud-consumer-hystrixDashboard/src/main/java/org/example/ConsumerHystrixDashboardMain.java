package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Creat by liuchunbo 2023/3/28
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerHystrixDashboardMain {
    public static void main(String[] args) {

        SpringApplication.run(ConsumerHystrixDashboardMain.class, args);
    }

}
