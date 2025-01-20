package com.local.money_register.views.panel_contents;

import com.local.money_register.constants.Constants;
import com.local.money_register.views.factory.Custom_Label;
import com.local.money_register.views.factory.Custom_TextF;
import com.local.money_register.views.factory.P_Contents;
import com.local.money_register.views.factory.PanelContent;
import com.local.money_register.views.factory.buttons.ButtonChangePanel;
import com.local.money_register.views.panel.MainPanel;

public class IncomeContents extends PanelContent{
	
	// SINGLETON -------------------

	private static IncomeContents instance;

	private IncomeContents() {
		createElements();
	}

	public static IncomeContents getInstance() {
		if (instance == null) {
			instance = new IncomeContents();
		}
		return instance;
	}
	
	// CARGAR DATOS DE LA VISTA

	@Override
	protected void createLabels() {
		addComponent(new Custom_Label("Registrando ingreso",1,10,10,
				Constants.PANEL_MAX_WIDTH-20));
		
		addComponent(new Custom_Label("Cantidad",2,50,130,
				Constants.PANEL_MAX_WIDTH-20));
		
	}

	@Override
	protected void createButtons() {
		addComponent(new ButtonChangePanel("Página principal", Constants.Views.MAIN,
				(Constants.PANEL_MAX_WIDTH - 200), (Constants.PANEL_MAX_HEIGHT -100)));
		
	}

	@Override
	protected void createtextFields() {
		addComponent(new Custom_TextF(50,170, 80));
		
	}

}
