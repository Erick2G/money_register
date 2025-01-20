package com.local.money_register.views.factory;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class PanelContent {
	
	// COMPONENTES DEL PANEL
	
	private List<JComponent> components = new ArrayList<JComponent>();
	
	// AGRETGAR ELEMENTOS A LAS LISTAS
	
	public void addComponent(JComponent component) {
		components.add(component);
	}
	
	
	// OBTENER LISTAS
	
	public List<JComponent> getComponents(){
		return components;
	}
	
	// OTROS METDOSO
	
	public void createElements() {
		createLabels();
		createButtons();
		createtextFields();
	}

	// METODOS DONDE SE PONDRÁN LOS DATOS DE LOS ELEMENTOS DEL PANEL
	
	abstract protected void createLabels();
	
	abstract protected void createButtons();
	
	abstract protected void createtextFields();
	
}

//private T panelComponent = null;
//private boolean visible = false;
//
//public PanelComponent(T panelComponent, boolean visible) {
//	this.panelComponent = panelComponent;
//	this.visible = visible;
//}
//
//public T getComponent() {
//	return panelComponent;
//}
//
//public void setVisible(boolean visible) {
//	this.visible = visible;
//}

