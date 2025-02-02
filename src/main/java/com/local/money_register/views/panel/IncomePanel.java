package com.local.money_register.views.panel;

import java.awt.Color;
import java.util.Map;

import javax.swing.JOptionPane;

import com.local.money_register.constants.Constants;
import com.local.money_register.views.factory.Panel;
import com.local.money_register.views.panel_contents.IncomeContents;

public class IncomePanel extends Panel {

	// SINGLETON -------------------

	private static IncomePanel instance;

	private IncomePanel() {
		super(10, 10, Constants.PANEL_MAX_WIDTH, Constants.PANEL_MAX_HEIGHT);
		//prepareMainPanel();
		// getPanel().setBackground(Color.magenta);
	}

	public static IncomePanel getInstance() {
		if (instance == null) {
			instance = new IncomePanel();
		}
		return instance;
	}

	// LOGICA DEL PANEL

	public Panel prepareMainPanel(Map<String, String> viewContent) {
		removeAllComponents();
		if(viewContent == null) {
			JOptionPane.showMessageDialog(null,
					"<html><h1> Error al intentar cargar la vista de Income </h1>"
							+ "<br></br><p> No se pudieron obtener los datos para mostrar</p><html> ");
		} else {
			IncomeContents.getInstance().setViewContent(viewContent);
			IncomeContents.getInstance().createElements();
			addComponentsToPanel(IncomeContents.getInstance().getComponents());
		}
		
		return this;
	}

	@Override
	public void refreshPanel(Map<String, String> viewContent) {

		removeAllComponents();
		IncomeContents.getInstance().refreshContents(viewContent);
		addComponentsToPanel(IncomeContents.getInstance().getComponents());
		panel.repaint();
		
	}

}
