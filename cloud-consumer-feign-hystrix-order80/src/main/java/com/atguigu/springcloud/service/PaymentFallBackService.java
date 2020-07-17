package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @auther yingjunxiaoge
 * @date 2020-07-17
 */
@Component
public class PaymentFallBackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "---------PaymentFallBackService fall back-paymentInfo_ok,(T_T)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "---------PaymentFallBackService fall back-paymentInfo_timeout,(T_T)";
    }
}
