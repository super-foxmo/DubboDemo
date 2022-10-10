package com.foxmo.demo.service;


import com.foxmo.demo.pojo.UserAddress;

import java.util.List;

public interface UserService {
    //查询指定用户的所有地址信息
    List<UserAddress> getUserAddressList(String userId);
}
