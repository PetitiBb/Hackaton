package com.hackaton.mock.service;

import com.hackaton.mock.model.ResponseModel;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ResponseServiceImpl implements ResponseService {
    public static Map<String,ResponseModel> responseModelSet = new HashMap<String,ResponseModel>();

    @Override
    public void addMockResponse(ResponseModel responseModel) {
        this.responseModelSet.put(responseModel.getName(),responseModel);
    }


}
