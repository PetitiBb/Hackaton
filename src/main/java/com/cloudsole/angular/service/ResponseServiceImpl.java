package com.cloudsole.angular.service;

import com.cloudsole.angular.model.ResponseModel;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ResponseServiceImpl implements ResponseService {

    ResponseModel responseModel;

//    @PostConstruct
//    public void setupAddressBook(){
//        ResponseModel responseModel = new ResponseModel();
//        addressBook1.setEmail("test@mail.com");
//        addressBook1.setFirstName("John");
//        addressBook1.setLastName("Doe");
//        addressBook1.setPhone("12345678");
//        ResponseModel addressBook2 = new ResponseModel();
//        addressBook2.setFirstName("George");
//        addressBook2.setLastName("Lucas");
//        addressBook2.setPhone("0099332244");
//        addressBook2.setEmail("george.lucas@mail.com");
//        addressBooks.add(addressBook1);
//        addressBooks.add(addressBook2);*/
//    }

    @Override
    public void addMockResponse(ResponseModel responseModel) {
        this.responseModel = responseModel;
    }


}
