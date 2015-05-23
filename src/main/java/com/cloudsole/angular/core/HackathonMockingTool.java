package com.cloudsole.angular.core;

import com.cloudsole.angular.controller.RestController;
import com.cloudsole.angular.resource.RestResource;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


public class HackathonMockingTool extends Application{

	public HackathonMockingTool() {
		super();
		RestResource restResource = new RestResource();
		RestController configureMockController = new RestController();
		singletons.add(restResource);
		singletons.add(configureMockController);
	}
	private Set clazzes = new HashSet();
	private Set<Object> singletons = new HashSet<Object>();

	@Override public Set<Class<?>> getClasses() {return clazzes;}

	@Override public Set<Object>  getSingletons(){return singletons;}


}
