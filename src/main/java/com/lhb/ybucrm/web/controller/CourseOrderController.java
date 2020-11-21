package com.lhb.ybucrm.web.controller;

import com.lhb.ybucrm.model.CURDResult;
import com.lhb.ybucrm.model.CourseOrder;
import com.lhb.ybucrm.model.PageResult;
import com.lhb.ybucrm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping("/add")
    public String add(){
        return "courseorder/add";
    }

    @RequestMapping("/detail")
    public String detail(Model model,String order_id){
        CourseOrder order = orderService.findByOrderId(order_id);
        model.addAttribute("order",order);
        return "courseorder/detail";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public CURDResult delete(String order_id){
        CURDResult result = new CURDResult();
        orderService.deleteByOrderId(order_id);
        return result;
    }

    @RequestMapping("save")
    @ResponseBody
    public CURDResult save(CourseOrder order){
        CURDResult result = new CURDResult();
//        System.out.println(order);
        orderService.save(order);
        return result;
    }


    @RequestMapping("listJson")
    @ResponseBody
    public PageResult<CourseOrder> listJson(int page,int limit){
        PageResult<CourseOrder> result = orderService.findPageResult(null,page,limit);

        return result;
    }

}
