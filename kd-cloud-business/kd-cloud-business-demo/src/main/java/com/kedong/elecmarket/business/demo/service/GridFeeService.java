package com.kedong.elecmarket.business.demo.service;

import com.kedong.elecmarket.business.demo.mapper.GridFeeMapper;
import com.kedong.elecmarket.core.bean.entity.fee.GridFee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 张庆贺
 * @since 2019/7/3 22:44
 */
@Service
@Transactional
public class GridFeeService {
    @Autowired
    private GridFeeMapper gridFeeMapper;

    @Transactional
    public Long deleteByPrimaryKey(GridFee gridFee) throws Exception {
        gridFeeMapper.deleteByPrimaryKey(gridFee);
        throw new Exception("111");
    }
}
