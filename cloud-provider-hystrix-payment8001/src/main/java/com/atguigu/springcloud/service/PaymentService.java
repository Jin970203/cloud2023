package com.atguigu.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author Mr.Jin
 * @Date 2023/4/27/0027 13:03
 * @Version 1.0
 */
public interface PaymentService {
    public String paymentInfo_OK(Integer id);
    public String paymentInfo_TimeOut(Integer id);
    public String paymentCircuitBreaker(@PathVariable("id") Integer id);
}
