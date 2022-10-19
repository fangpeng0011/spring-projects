package com.ffp.springcloud.dao;


import com.ffp.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author ffp
 * @date 2022/10/18 14:35
 */
@Mapper
@Component
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
