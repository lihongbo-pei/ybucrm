package com.lhb.ybucrm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author littlelee
 * @date 2020/11/14 23:46
 */
@Controller
@RequestMapping("stuinfo")
public class StuInfoController {

    @RequestMapping("/list")
    public String list(){
        return "stuinfo/list";
    }

}
