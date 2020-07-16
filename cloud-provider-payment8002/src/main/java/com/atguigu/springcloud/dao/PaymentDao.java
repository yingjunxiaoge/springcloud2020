package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @auther yingjunxiaoge
 * @date 2020-07-15
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public  Payment getPaymentById(@Param("id")Long id);
}
