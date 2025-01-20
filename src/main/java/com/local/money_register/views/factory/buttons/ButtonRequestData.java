package com.local.money_register.views.factory.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.local.money_register.views.factory.Custom_Button;

public class ButtonRequestData extends Custom_Button {
	
	public ButtonRequestData(String buttonText, Integer x, Integer y) {
		super(buttonText, x, y);
		setNewPanelInListener();
	}
	
	private void setNewPanelInListener() {

		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ev) {
				try {
					

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,
							"<html><h1> Ocurrió un error la intentar obtener datos de los campos </h1>"
									+ "<br></br><p> E: " + e + "</p><html> ");
				}

			}
		});
	}
}
