package com.local.money_register.views.factory.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.local.money_register.constants.Constants;
import com.local.money_register.frame.FrameController;
import com.local.money_register.views.factory.Custom_Button;
import com.local.money_register.views.factory.Panel;

public class ButtonChangePanel extends Custom_Button {
	
	
	public ButtonChangePanel(String buttonText, Constants.Views panelName, Integer x, Integer y) {
		super(buttonText, x, y);
		setNewPanelInListener(panelName);
	}

	private void setNewPanelInListener(Constants.Views panelName) {

		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ev) {
				try {
					FrameController.getInstance().requestPanel(panelName);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,
							"<html><h1> Ocurrió un error la intentar cargar un nuevo frame </h1>"
									+ "<br></br><p> E: " + e + "</p><html> ");
				}

			}
		});
	}
}
