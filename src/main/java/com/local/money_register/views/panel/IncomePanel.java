package com.local.money_register.views.panel;

import java.awt.Color;

import com.local.money_register.constants.Constants;
import com.local.money_register.views.factory.Panel;
import com.local.money_register.views.panel_contents.IncomeContents;

public class IncomePanel extends Panel{

	// SINGLETON -------------------
	
		private static IncomePanel instance;
		
		private IncomePanel() {
			super(10, 10, Constants.PANEL_MAX_WIDTH, Constants.PANEL_MAX_HEIGHT);
			prepareMainPanel();
			//getPanel().setBackground(Color.magenta);
		}
		
		public static IncomePanel getInstance() {
			if(instance == null) {
				instance = new IncomePanel();
			}
			return instance;
		}
		
		
		// LOGICA DEL PANEL
		
		public void prepareMainPanel() {
			addComponentsToPanel(IncomeContents.getInstance().getComponents());
		}
}
