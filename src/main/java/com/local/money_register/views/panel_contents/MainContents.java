package com.local.money_register.views.panel_contents;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.local.money_register.constants.Constants;
import com.local.money_register.views.factory.Panel;
import com.local.money_register.views.factory.PanelContent;
import com.local.money_register.views.factory.P_Contents;
import com.local.money_register.views.factory.buttons.ButtonChangePanel;
import com.local.money_register.views.factory.buttons.ButtonShowM;
import com.local.money_register.views.panel.IncomePanel;
import com.local.money_register.views.panel.MainPanel;
import com.local.money_register.views.factory.Custom_Label;

public class MainContents extends PanelContent {

	// SINGLETON -------------------

	private static MainContents instance;

	private MainContents() {
		createElements();
	}

	public static MainContents getInstance() {
		if (instance == null) {
			instance = new MainContents();
		}
		return instance;
	}

	// CARGAR DATOS DE LA VISTA
	
	@Override
	protected void createLabels() {
		addComponent(new Custom_Label("Registro de movimientos monetarios",
				1,10,10,Constants.PANEL_MAX_WIDTH-60));
	}
	
	@Override
	protected void createButtons() {

		addComponent(new ButtonChangePanel("Registrar ingreso",
				Constants.Views.INCOME, 180, 150));
		
		addComponent(new ButtonChangePanel("Registrar gasto",
				null, 180,190));
		
		addComponent(new ButtonChangePanel("Registrar deuda",
				null, 180, 230));
		
		addComponent(new ButtonChangePanel("Estadísticas",
				null, 180, 270));	
	
	}

	@Override
	protected void createtextFields() {
		// TODO Auto-generated method stub
		
	}



}
