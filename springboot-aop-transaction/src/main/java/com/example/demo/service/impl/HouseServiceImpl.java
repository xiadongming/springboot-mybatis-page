package com.example.demo.service.impl;

import com.example.demo.dao.HouseDao;
import com.example.demo.entity.House;
import com.example.demo.interceptor.Page;
import com.example.demo.service.IHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xiadongming
 * @Date: 2020/8/11 21:16
 */
@Service
public class HouseServiceImpl implements IHouseService {
    @Autowired
    private HouseDao houseDao;

    @Override
    public void updateHouse(Integer id) throws Exception {
        try {
            int i = houseDao.updateHouse(id);
            int a = 100 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }

    }

    @Override
    public List<House> findAll() {
        return houseDao.findAll();
    }

    @Override
    public List<House> findAllByPage(Page page) {
        List<House> allByPage = houseDao.findAllByPage(page);
        page.setData(allByPage);
        return allByPage;
    }
}
