package com.atguigu.springcloud.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;


/**
 * @Author Mr.Jin
 * @Date 2023/5/12/0012 17:30
 * @Version 1.0
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException blockException){
        return new CommonResult(444,"按客户自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException blockException){
        return new CommonResult(444,"按客户自定义,global handlerException----2");
    }
}
