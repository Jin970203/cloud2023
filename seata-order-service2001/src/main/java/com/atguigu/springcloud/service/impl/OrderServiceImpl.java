package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.OrderDao;
import com.atguigu.springcloud.entity.Order;
import com.atguigu.springcloud.service.AccountService;
import com.atguigu.springcloud.service.OrderService;
import com.atguigu.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Mr.Jin
 * @Date 2023/5/16/0016 10:08
 * @Version 1.0
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order) {
        //新建订单，设置订单状态
        log.info("-------->开始新建订单");
        orderDao.create(order);

        //库存修改
        log.info("------->订单微服务开始调用库存，做扣减count");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("------->订单微服务开始调用库存，做扣减end");

        //账户金额修改
        log.info("------->订单微服务开始调用账户，做扣减money");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("------->订单微服务开始调用账户，做扣减end");

        //订单状态修改，从0到1
        log.info("------->订单完成，修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("修改订单状态end");

        log.info("------->订单结束");
    }

}
