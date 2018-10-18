package com.dy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoControll {
    @RequestMapping("demo")
    public String intercept(Model model){
        model.addAttribute("model","我去你的！！");
        return "forward:/index.jsp";
    }
}
