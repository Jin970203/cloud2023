package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Mr.Jin
 * @Date 2023/5/16/0016 9:51
 * @Version 1.0
 */
@Mapper
public interface OrderDao {
    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从0改为1
    void update(@Param("userId") Long userId,@Param("status") Integer status);


}
