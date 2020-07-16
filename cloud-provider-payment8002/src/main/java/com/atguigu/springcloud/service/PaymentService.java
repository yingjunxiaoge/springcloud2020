package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther yingjunxiaoge
 * @date 2020-07-15
 */
public interface PaymentService {

    public int create(Payment payment);

    public  Payment getPaymentById(@Param("id")Long id);
}
