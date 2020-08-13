package com.example.demo.dao;

import com.example.demo.entity.House;
import com.example.demo.interceptor.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: xiadongming
 * @Date: 2020/8/11 21:29
 */
@Repository
public interface HouseDao {

   int updateHouse(Integer id);

    List<House> findAll();

    List<House> findAllByPage(@Param("page") Page page);
}
