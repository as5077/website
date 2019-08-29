package com.yanlan.website.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/index","/"})
    public String index(){
        System.out.println("111");
        return "index";
    }
}
