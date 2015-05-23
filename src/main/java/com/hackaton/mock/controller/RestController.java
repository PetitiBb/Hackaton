package com.hackaton.mock.controller;

import com.hackaton.mock.model.ResponseModel;
import com.hackaton.mock.service.ResponseService;
import com.hackaton.mock.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Controller
@RequestMapping("/rest")
public class RestController {

    @Autowired
    ResponseService responseService;

    @RequestMapping(value = "/add", method = RequestMethod.POST,  headers = "Accept=application/json")
    public @ResponseBody void addMockResponse(@ModelAttribute ResponseModel responseModel){
        System.out.println(responseModel.getBody());
        System.out.println(responseModel.getCode());
        responseService.addMockResponse(responseModel);
    }

    @POST
    @Path("/add")
    @Produces({MediaType.TEXT_PLAIN})
    @Consumes({MediaType. APPLICATION_JSON})
    public Response getConfigurationFromUI( ResponseModel model , @Context HttpServletRequest request){
        ResponseModel mock = new ResponseModel(model.getCode(), model.getVerb(), model.getContentType(),model.getBody());
        responseService.addMockResponse(mock);
        return Response.ok(model.getVerb() + Constants.MOCKED_LINK+model.getName()).build();
    }

    @RequestMapping("/layout")
    public String getTodoPartialPage() {
        return "rest/layout";
    }
}


