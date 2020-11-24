package com.lhb.ybucrm.mapper;

import com.lhb.ybucrm.model.CourseOrder;
import com.lhb.ybucrm.model.MonthIncome;

import java.util.List;
import java.util.Map;

/**
 * @author littlelee
 * @date 2020/11/16 23:19
 */
public interface CourseOrderMapper {

    int findCountByMap(Map map);

    List<CourseOrder> findListByMap(Map map);

    void insert(CourseOrder order);

    CourseOrder findByOrderId(String order_id);

    void deleteByOrderId(String order_id);

    void update(CourseOrder order);

    List<MonthIncome> getMonthIncomes();
}
