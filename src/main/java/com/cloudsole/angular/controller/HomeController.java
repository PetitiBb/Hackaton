package com.cloudsole.angular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/layout")
    public String getTodoPartialPage() {
        return "home/layout";
    }
}
