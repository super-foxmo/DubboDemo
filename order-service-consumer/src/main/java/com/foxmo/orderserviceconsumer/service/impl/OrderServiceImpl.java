package com.foxmo.orderserviceconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.foxmo.demo.pojo.UserAddress;
import com.foxmo.demo.service.OrderService;
import com.foxmo.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 1.将服务提供者注册到注册中心
 *      ① 导入dubbo
 * 2.让服务消费者去注册中心订阅服务提供者的服务地址
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Reference(retries = 3,timeout = 3000,stub = "com.foxmo.demo.service.stub.UserServiceStub") //远程引用服务（从注册中心寻找相应的服务）
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        //1.查询用户的收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);

        return userAddressList;
    }
}
