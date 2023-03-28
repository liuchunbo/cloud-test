package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Creat by liuchunbo 2023/3/22
 */
@EnableEurekaClient
@SpringBootApplication
// 启动该服务时去加载自定义的ribbon配置,,指定(CLOUD-PAYMENT-SERVICE)那个服务用自定义rule
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MyRibbonRule.class)
public class OrderMain {
    public static void main(String[] args) {

        SpringApplication.run(OrderMain.class, args);
    }

}
