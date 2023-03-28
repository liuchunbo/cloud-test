package org.example.service;

import org.example.entities.Payment;

/**
 * Creat by liuchunbo 2023/3/21
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
