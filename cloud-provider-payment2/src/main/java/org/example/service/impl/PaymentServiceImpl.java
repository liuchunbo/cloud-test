package org.example.service.impl;

import javax.annotation.Resource;
import org.example.dao.PaymentDao;
import org.example.entities.Payment;
import org.example.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * Creat by liuchunbo 2023/3/21
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
