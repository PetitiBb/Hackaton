package com.cloudsole.angular.controller;

import com.cloudsole.angular.model.ResponseModel;
import com.cloudsole.angular.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;


@Controller
@RequestMapping("/rest")
public class RestController {

    @Autowired
    ResponseService responseService;

    @RequestMapping(value = "/add", method = RequestMethod.POST,  headers = "Accept=application/json")
    public @ResponseBody void addMockResponse(@RequestBody ResponseModel responseModel){
        System.out.println(responseModel.getBody());
        System.out.println(responseModel.getCode());
        responseService.addMockResponse(responseModel);
    }


    @RequestMapping("/layout")
    public String getTodoPartialPage() {
        return "rest/layout";
    }
}


