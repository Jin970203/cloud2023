package com.atguigu.springcloud.dao;


import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Mr.Jin
 * @Date 2023/4/20/0020 16:42
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {

    //增
    int create(Payment payment);

    //改     加上@Param注解，mapper中就可以采用#{}的方式把@Param注解括号内的参数进行引用
    Payment getPaymentById(@Param("id") Long id);

    //这里用增和改进行演示，有兴趣的可以自己加其他的方法
}

