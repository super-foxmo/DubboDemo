package com.foxmo.userserviceprovider.service.impl;


import com.alibaba.dubbo.validation.MethodValidated;
import com.foxmo.demo.pojo.UserAddress;
import com.foxmo.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@com.alibaba.dubbo.config.annotation.Service  //暴露接口/服务
public class UserServiceImpl implements UserService {
    /**
     * 获取指定ID的用户收货地址
     * @param userId    用户ID
     * @return  指定用户的所有收货地址集合
     */
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress1 = new UserAddress(1, "北京市昌平区洪福科技园综合楼3层", "1", "foxmo", "12356232542", "N");
        UserAddress userAddress2 = new UserAddress(2, "广东省广州市海珠区滨江大道泰陵小区2号楼6层602", "1", "foxmo", "12376566377", "Y");

        return Arrays.asList(userAddress1,userAddress2);
    }
}
