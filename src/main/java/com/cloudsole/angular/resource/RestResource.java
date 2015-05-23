package com.cloudsole.angular.resource;

import com.cloudsole.angular.model.ResponseModel;
import com.cloudsole.angular.service.ResponseServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/mockedServices/REST/{serviceName}")
public class RestResource {

	@GET
	@Produces({ MediaType.TEXT_XML, MediaType.APPLICATION_XML,
			MediaType.APPLICATION_JSON })
	public Response performGetRequest(
			@PathParam("serviceName") String serviceName,
			@Context HttpServletRequest request)  {

		ResponseModel reponse = ResponseServiceImpl.responseModelSet.get(serviceName);//new ResponseModel(200, "{ \"name\": \"John Doe\", \"age\": 29 }", "application/json");

		return Response.status((Integer) reponse.getCode())
				.entity(reponse.getBody()).type((String) reponse.getContentType())
				.build();
	}

	@GET
	@Path("/{resourceId}")
	public Response performGetRequest(
			@PathParam("serviceName") String serviceName,
			@Context HttpServletRequest request,
			@PathParam("resourceId") String resourceId) {

		ResponseModel reponse = ResponseServiceImpl.responseModelSet.get(serviceName);

		return Response.status((Integer) reponse.getCode())
				.entity(reponse.getBody())
				.type((String) reponse.getContentType()).build();
	}


}
