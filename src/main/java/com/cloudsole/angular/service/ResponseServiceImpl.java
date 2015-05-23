package com.cloudsole.angular.service;

import com.cloudsole.angular.model.ResponseModel;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
public class ResponseServiceImpl implements ResponseService {
    public static Map<String,ResponseModel> responseModelSet = new HashMap<String,ResponseModel>();

    @Override
    public void addMockResponse(ResponseModel responseModel) {
        this.responseModelSet.put(responseModel.getName(),responseModel);
    }


}
