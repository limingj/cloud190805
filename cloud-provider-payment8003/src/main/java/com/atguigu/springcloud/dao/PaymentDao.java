package com.atguigu.springcloud.dao;


import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @auther zzyy
 * @create 2019-12-28 11:44
 */
@Mapper
public interface PaymentDao
{
    public void create(Payment payment);

    public Payment getPaymentById(Long id);
}
