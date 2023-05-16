package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;


/**
 * @Author Mr.Jin
 * @Date 2023/5/16/0016 10:04
 * @Version 1.0
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

    @GetMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId
            ,@RequestParam("money") BigDecimal money);
}
