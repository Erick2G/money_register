package com.local.money_register.views.factory;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Panel {

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
	
	// ELIMINAR ELEMENTOS ESPECIFICOS DEL PANEL
	
	public <T> void removeComponentsToPanel(List<T> list) {

		if (list.size() > 0) {
			for (T component : list) {
				panel.remove((JComponent)component);
			}
		}

	}
	
	// ELIMINAR TODOS LOS ELEMENTOS DEL PANEL
	
	public void removeAllComponents() {
		panel.removeAll();
	}
	
	// DEVOLVER EL PANEL

	
	public JPanel getPanel() {
		return panel;
	}

	// PARA ACTUALIZAR EL CONTENIDO DEL PANEL
	
	public Panel getRefreshedPanel() {
		//refreshPanel();
		return this;
	}
	
	abstract protected void refreshPanel(Map<String, String> viewContent);
}
