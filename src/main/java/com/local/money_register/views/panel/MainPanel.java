package com.local.money_register.views.panel;


import java.awt.Color;
import java.util.Map;

import javax.swing.JPanel;

import com.local.money_register.constants.Constants;
import com.local.money_register.views.factory.Panel;
import com.local.money_register.views.panel_contents.MainContents;

public class MainPanel extends Panel {
	
	// SINGLETON -------------------
	
	private static MainPanel instance;
	
	private MainPanel() {
		super(10, 10, Constants.PANEL_MAX_WIDTH, Constants.PANEL_MAX_HEIGHT);
		//prepareMainPanel();
		//getPanel().setBackground(Color.cyan);
	}
	
	public static MainPanel getInstance() {
		if(instance == null) {
			instance = new MainPanel();
		}
		return instance;
	}
	
	
	// LOGICA DEL PANEL
	
	public Panel prepareMainPanel() {
		MainContents.getInstance().createElements();
		addComponentsToPanel(MainContents.getInstance().getComponents());
		
		return this;
	}

	@Override
	public void refreshPanel(Map<String, String> viewContent) {
		
	}
	
	


}
