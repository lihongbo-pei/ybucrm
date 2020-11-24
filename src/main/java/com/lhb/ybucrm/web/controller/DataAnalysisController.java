package com.lhb.ybucrm.web.controller;

import com.lhb.ybucrm.model.MonthIncome;
import com.lhb.ybucrm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author littlelee
 * @date 2020/11/22 23:55
 */
@Controller
@RequestMapping("dataanalysis")
public class DataAnalysisController {

    @Autowired
    ICourseOrderService orderService;

    @RequestMapping("/income")
    public String income(){
        return "dataanalysis/income";
    }

    @RequestMapping("monthIncomes")
    @ResponseBody
    public List<MonthIncome> monthIncomes(){
        List<MonthIncome> list = orderService.getMonthIncomes();

        return list;
    }

}
