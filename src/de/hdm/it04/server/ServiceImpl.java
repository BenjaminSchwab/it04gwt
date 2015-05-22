package de.hdm.it04.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import de.hdm.it04.client.service.Service;

public class ServiceImpl extends RemoteServiceServlet implements Service {

	@Override
	public String sayHello(String name) {
		String ergebnis = "Hallo, das ist ein Test: " + name;
		return ergebnis;
	}

}
