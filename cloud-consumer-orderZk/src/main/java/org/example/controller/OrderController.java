package org.example.controller;

import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Creat by liuchunbo 2023/3/22
 */
@RestController
@Slf4j
public class OrderController {

//    public static final String PAYMENT_URL = "http://localhost:8888";
    public static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/zk")
    public String  create(){
        return restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);  //写操作
    }


}
