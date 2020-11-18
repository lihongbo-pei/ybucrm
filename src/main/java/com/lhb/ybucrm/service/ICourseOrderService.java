package com.lhb.ybucrm.service;

import com.lhb.ybucrm.model.CourseOrder;
import com.lhb.ybucrm.model.PageResult;

/**
 * @author littlelee
 * @date 2020/11/17 23:02
 */
public interface ICourseOrderService {

    PageResult<CourseOrder> findPageResult(CourseOrder condition,int page,int pageSize);

}
