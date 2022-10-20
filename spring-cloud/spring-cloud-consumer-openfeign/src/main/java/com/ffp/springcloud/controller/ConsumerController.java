package com.ffp.springcloud.controller;

import com.ffp.springcloud.entity.CommonResult;
import com.ffp.springcloud.entity.Payment;
import com.ffp.springcloud.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Description:
 *
 * @author ffp
 * @date 2022/10/19 20:02
 */
@RestController
public class ConsumerController {


    @Autowired
    private ConsumerService consumerService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return consumerService.getPaymentById(id);
    }

}
