package de.hdm.it04.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

import de.hdm.it04.client.service.ClientImpl;

/**
 * Entryyyyyy point classes define <code>onModuleLoad()</code>.
 */
public class It04gwt implements EntryPoint {
	

	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		ClientImpl impl = new ClientImpl(GWT.getModuleBaseURL() + "exampleService");
		RootPanel.get().add(impl.getMainGUI());
	}
}
