package de.hdm.it04.client.gui;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import de.hdm.it04.client.service.ClientImpl;

public class MainGUI extends Composite {
	
	private VerticalPanel vPanel = new VerticalPanel();
	private TextBox tBox;
	
	private Label lbl;
	private ClientImpl serviceImpl;
	
	
	public MainGUI(ClientImpl serviceImpl){
		initWidget (this.vPanel);
		this.serviceImpl = serviceImpl;
		
		this.tBox = new TextBox();
		this.vPanel.add(tBox);
			
		Button btn = new Button("Say Hello");
	
		btn.addClickHandler(new btnClickHandler());
		this.vPanel.add(btn);
		
		this.lbl = new Label("Result will be here");
		this.vPanel.add(lbl);
	
		
		
	}
	
	public void updateLabel (String label){
		this.lbl.setText(label);
	}
	
	private class btnClickHandler implements ClickHandler{

		

		@Override
		public void onClick(ClickEvent event) {
			
			String name = tBox.getText();
			serviceImpl.sayHello(name);
		}
		
	}

}
