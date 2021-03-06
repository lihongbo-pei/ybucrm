package com.lhb.ybucrm.service;

import com.lhb.ybucrm.model.CourseOrder;
import com.lhb.ybucrm.model.MonthIncome;
import com.lhb.ybucrm.model.PageResult;

import java.util.List;

/**
 * @author littlelee
 * @date 2020/11/17 23:02
 */
public interface ICourseOrderService {

    PageResult<CourseOrder> findPageResult(CourseOrder condition,int page,int pageSize);

    void save(CourseOrder order);

    CourseOrder findByOrderId(String order_id);

    void deleteByOrderId(String order_id);

    void update(CourseOrder order);

    List<MonthIncome> getMonthIncomes();
}
