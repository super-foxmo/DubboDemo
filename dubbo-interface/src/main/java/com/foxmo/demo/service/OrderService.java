package com.foxmo.demo.service;

import com.foxmo.demo.pojo.UserAddress;

import java.util.List;

public interface OrderService {
    //初始化订单
    List<UserAddress> initOrder(String userId);
}
