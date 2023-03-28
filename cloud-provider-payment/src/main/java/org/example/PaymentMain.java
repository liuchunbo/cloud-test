package org.example;

import javax.servlet.http.HttpServletRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Creat by liuchunbo 2023/3/21
 */
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain.class, args);
    }

//    public static String getRequestHost(HttpServletRequest request) {
//        String url = request.getRequestURL().toString();
//        String uri = request.getRequestURI();
//        return url.replace(uri, "");
//    }

}
