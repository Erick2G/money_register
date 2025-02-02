package com.local.money_register.views.factory.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.local.money_register.constants.Constants;
import com.local.money_register.frame.FrameController;
import com.local.money_register.views.factory.Custom_Button;
import com.local.money_register.views.factory.Custom_TextF;

public class ButtonRequestData extends Custom_Button {

	public ButtonRequestData(String buttonText, Constants.Views panelName, 
			Integer x, Integer y, Map<String, JComponent> components) {
		
		super(buttonText, x, y);
		setNewPanelInListener(panelName, components);
	}

	private void setNewPanelInListener(Constants.Views panelName, Map<String, JComponent> components) {

		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ev) {
				try {
					Map<String, String> viewContent = getDataFromComponents(components);
					FrameController.getInstance().sendContentToPanel(panelName, viewContent);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,
							"<html><h1> Ocurrió un error la intentar obtener datos de los campos </h1>"
									+ "<br></br><p> E: " + e + "</p><html> ");
				}

			}
		});
	}

	public Map<String, String> getDataFromComponents(Map<String, JComponent> components) {

		Map<String, String> viewContent = new HashMap<String, String>();

		components.forEach((k, v) -> {
			if (v instanceof Custom_TextF) { // PARA J TEXT FIELD
				viewContent.put(k, ((JTextField) v).getText());
			}
		});
		
		return viewContent;
	}
}
