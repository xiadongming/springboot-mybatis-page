package com.example.demo.service;

import com.example.demo.entity.House;
import com.example.demo.interceptor.Page;

import java.util.List;

/**
 * @Author: xiadongming
 * @Date: 2020/8/11 21:16
 */
public interface IHouseService {

    public void updateHouse(Integer id) throws Exception;

    public List<House> findAll();

    public List<House> findAllByPage(Page page);


}
