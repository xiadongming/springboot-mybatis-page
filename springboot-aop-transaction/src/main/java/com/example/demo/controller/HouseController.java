package com.example.demo.controller;

import com.example.demo.entity.House;
import com.example.demo.interceptor.Page;
import com.example.demo.service.IHouseService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: xiadongming
 * @Date: 2020/8/12 21:41
 */
@RestController
public class HouseController {

    @Autowired
    private IHouseService houseService;

    @RequestMapping(value = "/allHouse", method = RequestMethod.GET)
    public void getAllHouse() {
        List<House> all = houseService.findAll();
        //System.out.println("响应：jsonAll= " + JSONObject.fromObject(all).toString());
        System.out.println("响应：jsonAll= " + JSONArray.fromObject(all).toString());

    }

    /*  //查询全部数据，不可取
      @RequestMapping(value = "/allHousePage", method = RequestMethod.GET)
      public PageInfo<House> getAllHousePage(Integer page, Integer rows) {
          //1.设置分页条件
          PageHelper.startPage(page, rows);
          //2.紧跟着的第一个查询,才会被分页
          //3.执行查询 得到得到结果 结果就是被分页过的
          List<House> list = houseService.findAll();//查询全部数据，不可取
          System.out.println("数量" + list.size());
          //页面需要用到总记录数,列数
          //设置分页对象
          PageInfo<House> info = new PageInfo<House>(list);
          System.out.println("总记录数:" + info.getTotal());
          return info;
      }*/
    //public Page getAllHousePage(Page page) {
    @RequestMapping(value = "/allHousePage", method = RequestMethod.GET)
    public Page getAllHousePage(int pageNo,int rows) {
        Page page = new Page();
        page.setPage(pageNo);
        page.setRows(rows);
        List<House> allByPage = houseService.findAllByPage(page);
        page.setData(allByPage);
        return page;
    }

}
