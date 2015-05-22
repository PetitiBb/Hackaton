package com.cloudsole.angular.controller;

import com.cloudsole.angular.model.ResponseModel;
import com.cloudsole.angular.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/rest")
public class RestController {

    @Autowired
    AddressBookService addressBookService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody void addAddressBookEntry(@RequestBody ResponseModel responseModel){
        addressBookService.createAddressBook(responseModel);
    }

    @RequestMapping("/layout")
    public String getTodoPartialPage() {
        return "rest/layout";
    }
}


