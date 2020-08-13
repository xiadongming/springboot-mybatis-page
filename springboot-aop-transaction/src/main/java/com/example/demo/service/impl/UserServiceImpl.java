package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: xiadongming
 * @Date: 2020/8/11 21:11
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void updateUser(Integer id) {
        int i = userDao.updateUser(id);

    }
}
