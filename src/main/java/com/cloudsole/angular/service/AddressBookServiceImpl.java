package com.cloudsole.angular.service;

import com.cloudsole.angular.model.ResponseModel;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookServiceImpl implements AddressBookService {

    List<ResponseModel> addressBooks = new ArrayList<ResponseModel>();
    private static Long id = 0L;

    @PostConstruct
    public void setupAddressBook(){
        ResponseModel addressBook1 = new ResponseModel();
        addressBook1.setEmail("test@mail.com");
        addressBook1.setFirstName("John");
        addressBook1.setLastName("Doe");
        addressBook1.setPhone("12345678");
        ResponseModel addressBook2 = new ResponseModel();
        addressBook2.setFirstName("George");
        addressBook2.setLastName("Lucas");
        addressBook2.setPhone("0099332244");
        addressBook2.setEmail("george.lucas@mail.com");
        addressBooks.add(addressBook1);
        addressBooks.add(addressBook2);
    }

    @Override
    public List<ResponseModel> viewAllAddressBook() {
        return addressBooks;
    }

    @Override
    public void createAddressBook(ResponseModel addressBook) {
        if (!addressBooks.contains(addressBook)){
            addressBook.setId(id);
            addressBooks.add(addressBook);
            ++id;
        }
    }

    @Override
    public void updateAddressBook(int pos, ResponseModel updateAddressBook) {
        addressBooks.set(pos, updateAddressBook);
    }

    @Override
    public void deleteAddressBook(int id) {
        addressBooks.remove(id);
    }

    @Override
    public void deleteAllAddressBook() {
        addressBooks.clear();
        id = 0L;
    }

    @Override
    public ResponseModel findAddressBook(int id) {
        return addressBooks.get(id);
    }
}
