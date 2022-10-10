package com.foxmo.demo.service.stub;

import com.foxmo.demo.pojo.UserAddress;
import com.foxmo.demo.service.UserService;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UserServiceStub implements UserService {

    private final UserService userService;

    /**
     * Dubbo会自动传入UserService的远程代理对象
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("+++++++++++++++本地存根+++++++++++++++");
        List<UserAddress> userAddressList = new ArrayList<>();
        if (!StringUtils.isEmpty(userId)){
            userAddressList = userService.getUserAddressList(userId);
        }
        return userAddressList;
    }
}
