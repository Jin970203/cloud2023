package com.atguigu.springcloud.service;


import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author Mr.Jin
 * @Date 2023/5/16/0016 13:16
 * @Version 1.0
 */
public interface AccountService {
    void decrease(Long userId,BigDecimal money);
}
