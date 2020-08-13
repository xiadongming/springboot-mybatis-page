package com.example.demo.controller;

import com.example.demo.service.ITrantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: xiadongming
 * @Date: 2020/8/11:19
 */
@RestController
public class TrantController {

    @Autowired
    private ITrantService trantService;


    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public void updateUser() throws Exception {
        trantService.updateTrant();
    }


}
