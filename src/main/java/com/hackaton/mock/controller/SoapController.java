package com.hackaton.mock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/soap")
public class SoapController {

    @RequestMapping("/layout")
    public String layout(){
        return "soap/layout";
    }

}
