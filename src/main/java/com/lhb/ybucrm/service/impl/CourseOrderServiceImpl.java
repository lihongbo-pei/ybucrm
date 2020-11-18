package com.lhb.ybucrm.service.impl;

import com.lhb.ybucrm.mapper.CourseOrderMapper;
import com.lhb.ybucrm.model.CourseOrder;
import com.lhb.ybucrm.model.PageResult;
import com.lhb.ybucrm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author littlelee
 * @date 2020/11/17 23:04
 */
@Service
public class CourseOrderServiceImpl implements ICourseOrderService {

    @Autowired
    CourseOrderMapper orderMapper;

    @Override
    public PageResult<CourseOrder> findPageResult(CourseOrder condition, int page, int pageSize) {
        PageResult<CourseOrder> result = new PageResult<>();
        result.setCode(0);
        Map params = new HashMap();

        int totalCount = orderMapper.findCountByMap(params);
        result.setCount(totalCount);

        List<CourseOrder> list = orderMapper.findListByMap(params);
        result.setData(list);

        return result;
    }
}
