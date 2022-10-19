package com.ffp.springcloud.service;

import com.ffp.springcloud.entity.Payment;

public interface PaymentService {

    public int create(Payment payment); //写

    public Payment getPaymentById(Long id);  //读取

}
