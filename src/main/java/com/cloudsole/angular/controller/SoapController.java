package com.cloudsole.angular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by tmichels on 8/3/14.
 */

@Controller
@RequestMapping("/soap")
public class SoapController {

    @RequestMapping("/layout")
    public String layout(){
        return "soap/layout";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void save(){

    }
}
