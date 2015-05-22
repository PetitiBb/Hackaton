package com.cloudsole.angular.controller;

import com.cloudsole.angular.model.AddressBook;
import com.cloudsole.angular.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by tmichels on 8/3/14.
 */

@Controller
@RequestMapping("/rest")
public class RestController {

    @Autowired
    AddressBookService addressBookService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody void addAddressBookEntry(@RequestBody AddressBook addressBook){
        addressBookService.createAddressBook(addressBook);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public @ResponseBody void deleteAddressBookEntry(@PathVariable("id") String id){
        addressBookService.deleteAddressBook(Integer.valueOf(id));
    }

    @RequestMapping(value = "/update/{pos}", method = RequestMethod.PUT)
    public @ResponseBody void updateAddressBook(@RequestBody AddressBook addressBook, @PathVariable("pos") String pos){
        addressBookService.updateAddressBook(Integer.valueOf(pos), addressBook);
    }

    @RequestMapping(value="/delete/all", method = RequestMethod.DELETE)
    public @ResponseBody void deleteAllAddressBook(){
        addressBookService.deleteAllAddressBook();
    }

    @RequestMapping("/layout")
    public String getTodoPartialPage() {
        return "addressbook/layout";
    }
}


