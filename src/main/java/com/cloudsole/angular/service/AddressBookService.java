package com.cloudsole.angular.service;


import com.cloudsole.angular.model.ResponseModel;

import java.util.List;

public interface AddressBookService {
     List<ResponseModel> viewAllAddressBook();
     void createAddressBook(ResponseModel addressBook);
     void updateAddressBook(int pos, ResponseModel updateAddressBook);
    void deleteAddressBook(int id);
    void deleteAllAddressBook();
     ResponseModel findAddressBook(int id);
}
