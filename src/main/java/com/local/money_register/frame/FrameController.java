package com.local.money_register.frame;

import java.util.Map;

import com.local.money_register.constants.Constants;
import com.local.money_register.data.IncomeData;
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
	
	//  CARGAR UN PANEL
	
	public void loadFrame(Panel panel) {
		frame.substitutePanel(panel.getPanel());
	}

	// PREPARAR PANELES Y SU CONTENIDO

	public void requestPanel(Constants.Views panelName) {
		loadFrame(getPanel(panelName));
	}
	
	public void sendContentToPanel(Constants.Views panelName, Map<String, String> viewContent) {
		//loadFrame(sendContentToPanelAndReturnPanel(panelName, viewContent));
		refreshPanel(panelName, viewContent);
	}
	
	// 
	
	public Panel getPanel(Constants.Views panelName) {
		switch(panelName) {
		default:
		case MAIN:
			return MainPanel.getInstance().prepareMainPanel();
		case INCOME:
			return IncomePanel.getInstance().prepareMainPanel(IncomeData.getData());
		}
		
	}
	
	public Panel refreshPanel(Constants.Views panelName, Map<String, String> viewContent) {
		switch(panelName) {
		default:
		case MAIN:
			return MainPanel.getInstance();
		case INCOME:
			IncomePanel.getInstance().refreshPanel(viewContent);
			return IncomePanel.getInstance();
		}
		
	}

	// PAGINA DE GASTOS

	// PAGINA DE INGRESOS
}
