package com.hackaton.mock.core;

import com.hackaton.mock.controller.RestController;
import com.hackaton.mock.resource.RestResource;

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
