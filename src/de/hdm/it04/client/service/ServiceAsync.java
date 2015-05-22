package de.hdm.it04.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ServiceAsync {

	void sayHello(String name, AsyncCallback callback);

}
