package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author Mr.Jin
 * @Date 2023/4/27/0027 14:54
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Long id) {
        return "----PaymentFallbackService fall back";
    }

    @Override
    public String paymentInfo_TimeOut(Long id) {
        return "----PaymentFallbackService fall back-paymentInfo_Timeout";
    }
}
