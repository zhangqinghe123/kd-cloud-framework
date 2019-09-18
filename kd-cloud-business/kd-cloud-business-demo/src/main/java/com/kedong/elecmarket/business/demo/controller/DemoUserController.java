package com.kedong.elecmarket.business.demo.controller;

import com.kedong.elecmarket.business.demo.mapper.GridFeeMapper;
import com.kedong.elecmarket.business.demo.mapper.UserInfoMapper;
import com.kedong.elecmarket.business.demo.service.GridFeeService;
import com.kedong.elecmarket.core.bean.entity.fee.GridFee;
import com.kedong.elecmarket.core.bean.entity.user.DemoUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 张庆贺getUserInfoById
 * @since 2019/5/30 11:38
 */
@RestController
@RequestMapping("/demoUser")
@Transactional
public class DemoUserController {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private GridFeeMapper gridFeeMapper;

    @Autowired
    private GridFeeService gridFeeService;


    @GetMapping("/getUserInfoById/{userId}")
    public DemoUserInfo getUserInfoById(@PathVariable Integer userId) {
        return userInfoMapper.selectByPrimaryKey(userId);
    }

    @GetMapping("/insertData/{times}")
    public Integer insertData(@PathVariable Integer times) {
        Long startTime = System.currentTimeMillis();
        List<GridFee> list = new ArrayList<>();
        for (int i = 0; i < times; i++){
            Integer randomNum = ((int) (Math.random() * (9999 - 1000 + 1))) + 1000;
            GridFee gridFee = new GridFee();
            gridFee.setMonthQty(randomNum);
            gridFee.setPrice(new BigDecimal(randomNum).divide(new BigDecimal("100")));
            list.add(gridFee);
        }
        int i = gridFeeMapper.insertList(list);
        Long endTime = System.currentTimeMillis();
        System.out.println("Cost time:"+(endTime - startTime));
        return i;
    }

    @GetMapping("/update/{id}")
    public Integer update(@PathVariable Integer id) throws Exception {
        Long startTime = System.currentTimeMillis();
        List<GridFee> list = gridFeeMapper.selectAll();
        for (GridFee gridFee:list){
            gridFee.setMonthFee(new BigDecimal(gridFee.getMonthQty()).multiply(gridFee.getPrice()));

        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Cache cost time:"+(endTime - startTime));
        int i = gridFeeMapper.batchUpdate(list);
        endTime = System.currentTimeMillis();
        System.out.println("Cost time:"+(endTime - startTime));
        return i;
    }
}
