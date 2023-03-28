package org.example.controller;

import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.example.entities.CommonResult;
import org.example.entities.Payment;
import org.example.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Creat by liuchunbo 2023/3/21
 */
@Slf4j
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("测试");
        if(result > 0){
            return new CommonResult<>(200,  "成功,serverPort:"+ serverPort, result);
        }else {
            return new CommonResult<>(400, "失败,serverPort:"+ serverPort, null);
        }

    }

    @GetMapping(value = "/payment/get/{id}")
    public  CommonResult<Payment> getPaymentById(@PathVariable("id")Long id){

        Payment payment = paymentService.getPaymentById(id);
        log.info("测试");
        //logger.info("*******查询***** ： " + payment);
        if(payment != null){
            return new CommonResult<Payment>(200, "成功,serverPort:"+ serverPort, payment);
        }else {
            return new CommonResult(400, "成功,serverPort:"+ serverPort, null);
        }

    }

    @GetMapping(value = "/payment/ribbon")
    public String getRibbon() {

        return serverPort;
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){

//        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return serverPort;
    }



}
