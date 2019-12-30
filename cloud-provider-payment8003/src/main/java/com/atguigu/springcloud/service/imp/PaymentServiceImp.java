package com.atguigu.springcloud.service.imp;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PaymentServiceImp implements PaymentService{

    @Autowired
    private PaymentDao paymentDao;
    @Override
    public void create(Payment payment) {
        paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Payment payment) {

    }

    @Override
    public List<Payment> list() {
        return null;
    }
}
