package com.kedong.elecmarket.business.demo.mapper;

import com.kedong.elecmarket.core.bean.entity.fee.GridFee;
import com.kedong.elecmarket.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author 张庆贺
 * @since 2019/7/3 21:35
 */
public interface GridFeeMapper extends BaseMapper<GridFee> {

    int batchUpdate(List<GridFee> list);
}
