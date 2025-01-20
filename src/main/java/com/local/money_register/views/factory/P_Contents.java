package com.local.money_register.views.factory;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class P_Contents {
	
	// COMPONENTES DEL PANEL
	
	private List<JLabel> labels = new ArrayList<JLabel>();
	private List<JButton> buttons = new ArrayList<JButton>();
	private List<JTextField> textFields = new ArrayList<JTextField>();
	
	// AGRETGAR ELEMENTOS A LAS LISTAS
	
	public void addLabel(JLabel label) {
		labels.add(label);
	}
	
	public void addButton(JButton newButton) {
		buttons.add(newButton);
	}
	
	public void addTextField(JTextField newTextField) {
		textFields.add(newTextField);
	}
	
	// OBTENER LISTAS
	
	public List<JLabel> getLabels(){
		return labels;
	}
	
	public List<JButton> getButtons(){
		return buttons;
	}
	
	public List<JTextField> getTextFields(){
		return textFields;
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

