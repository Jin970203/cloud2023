package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Mr.Jin
 * @Date 2023/5/16/0016 10:05
 * @Version 1.0
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @GetMapping("/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId
            ,@RequestParam("count") Integer count);
}
