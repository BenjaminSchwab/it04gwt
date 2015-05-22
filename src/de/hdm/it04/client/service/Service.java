package de.hdm.it04.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("exampleService")
public interface Service extends RemoteService  {
	
	String sayHello(String name);

}
