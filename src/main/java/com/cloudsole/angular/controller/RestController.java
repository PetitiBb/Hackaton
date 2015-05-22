package com.cloudsole.angular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tmichels on 8/3/14.
 */

@Controller
@RequestMapping("/rest")
public class RestController {

//    @Autowired
//    AddressBookService addressBookService;

//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public @ResponseBody void addAddressBookEntry(@RequestBody ResponseModel responseModel){
////        addressBookService.createAddressBook(responseModel);
//    }

    @RequestMapping("/layout")
    public String getTodoPartialPage() {
        return "rest/layout";
    }
}


