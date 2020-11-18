package com.lhb.ybucrm.web.controller;

import com.lhb.ybucrm.model.CourseOrder;
import com.lhb.ybucrm.model.PageResult;
import com.lhb.ybucrm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author littlelee
 * @date 2020/11/14 23:46
 */
@Controller
@RequestMapping("/courseorder")
public class CourseOrderController {

    @Autowired
    ICourseOrderService orderService;

    @RequestMapping("/list")
    public String list(){
        return "courseorder/list";
    }

    @RequestMapping("listJson")
    @ResponseBody
    public PageResult<CourseOrder> listJson(){
        PageResult<CourseOrder> result = orderService.findPageResult(null,1,8);

        return result;
    }

}
