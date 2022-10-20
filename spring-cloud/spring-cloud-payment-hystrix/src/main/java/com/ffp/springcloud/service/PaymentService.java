package com.ffp.springcloud.service;

/**
 * Description:
 *
 * @author ffp
 * @date 2022/10/19 20:26
 */
public interface PaymentService {

    public String paymentInfo_OK(Integer id);

    public String payment_Timeout(Integer id);
}
