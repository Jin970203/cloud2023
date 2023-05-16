package com.atguigu.springcloud.service;


import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Mr.Jin
 * @Date 2023/5/16/0016 11:32
 * @Version 1.0
 */
public interface StorageService {

    void decrease(Long productId,Integer count);
}
