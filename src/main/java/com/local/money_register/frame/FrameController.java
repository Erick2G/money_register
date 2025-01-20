package com.local.money_register.frame;

import com.local.money_register.constants.Constants;
import com.local.money_register.views.factory.Panel;
import com.local.money_register.views.panel.IncomePanel;
import com.local.money_register.views.panel.MainPanel;

public class FrameController {

	private static Frame frame;

	static private FrameController instance;

	private FrameController() {
		frame = new Frame(Constants.APPLICATION_NAME);
	}

	public static FrameController getInstance() {
		if (instance == null) {
			instance = new FrameController();
		}
		return instance;
	}

	// PAGINA PRINCIPAL

	public void requestPanel(Constants.Views panelName) {
		loadFrame(getPanel(panelName));
	}
	
	public void loadFrame(Panel panel) {
		frame.substitutePanel(panel.getPanel());
	}
	
	public Panel getPanel(Constants.Views panelName) {
		switch(panelName) {
		default:
		case MAIN:
			return MainPanel.getInstance();
		case INCOME:
			return IncomePanel.getInstance();
		}
		
	}

	// PAGINA DE GASTOS

	// PAGINA DE INGRESOS
}
