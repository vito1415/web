package com.vito.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "/test";
    }

    @RequestMapping("/demo")
    @ResponseBody
    public String demo(){
        return "demo";
    }
}
