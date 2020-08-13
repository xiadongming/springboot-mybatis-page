package com.example.demo.service.impl;

import com.example.demo.service.IHouseService;
import com.example.demo.service.ITrantService;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: xiadongming
 * @Date: 2020/8/11 21:24
 */
@Service
public class ITrantServiceImpl implements ITrantService {

    @Autowired
    private IHouseService houseService;
    @Autowired
    private IUserService userService;

    @Override
    public void updateTrant() throws Exception {

        houseService.updateHouse(15);
        userService.updateUser(1);

    }
}
