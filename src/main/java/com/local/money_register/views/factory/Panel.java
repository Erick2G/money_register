package com.local.money_register.views.factory;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {

	protected JPanel panel = new JPanel();

	// INICIALIZAR PANEL

	public Panel(int x, int y, int width, int height) {
		panel.setLayout(null);
		panel.setBounds(x, y, width, height);
		
	}


	// AGREGAR ELEMENTOS AL PANEL

	public <T> void addComponentsToPanel(List<T> list) {

		if (list.size() > 0) {
			for (T component : list) {
				panel.add((JComponent)component);
			}
		}

	}
	
	// ELIMINAR ELEMENTOS DEL PANEL
	
	public <T> void removeComponentsToPanel(List<T> list) {

		if (list.size() > 0) {
			for (T component : list) {
				panel.remove((JComponent)component);
			}
		}

	}

	
	public JPanel getPanel() {
		return panel;
	}


}
