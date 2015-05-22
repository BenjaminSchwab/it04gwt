package de.hdm.it04.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

import de.hdm.it04.client.gui.MainGUI;

public class ClientImpl implements Client {

	private ServiceAsync service;
	private MainGUI maingui;
	
	public ClientImpl (String url){
		this.service = GWT.create(Service.class);
		ServiceDefTarget endpoint = (ServiceDefTarget) this.service;
		endpoint.setServiceEntryPoint(url);
		
		this.maingui = new MainGUI(this);
	}
	
	@Override
	public void sayHello(String name) {
		this.service.sayHello(name, new DefaultCallback());
		

	}
	
	public MainGUI getMainGUI(){
		return this.maingui;
	}
	
	
	
	
	private class DefaultCallback implements AsyncCallback{

		@Override
		public void onFailure(Throwable caught) {
			System.out.println("Fehler!");
			
		}

		@Override
		public void onSuccess(Object result) {
			if (result instanceof String){
				
				String label = (String) result;
				
				maingui.updateLabel(label);
			}
			
		}
		
	}

}
