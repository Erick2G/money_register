package com.local.money_register.views.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class PanelContent {

	// COMPONENTES DEL PANEL

	private List<JComponent> components = new ArrayList<JComponent>();
	private Map<String, JComponent> dataComponents = new HashMap<String, JComponent>();
	private Map<String, JComponent> dynamicLabels = new HashMap<String, JComponent>();

	// AGREGAR ELEMENTOS A LAS LISTAS ------------------

	public void addComponent(JComponent component) {
		components.add(component);
	}

	public void addDataComponent(String name, JComponent component) {
		dataComponents.put(name, component);
	}

	public void addDynamicLabel(String name, JComponent component) {
		dynamicLabels.put(name, component);
	}

	// MODIFICAR ELEMENTOS DE LISTAS ---------------------

	public void changeDynamicLabelText(String labelName, String text) {
		if(dynamicLabels.containsKey(labelName) && dynamicLabels.get(labelName) instanceof Custom_Label) {
			((Custom_Label) dynamicLabels.get(labelName)).setNewText(text);
		}
	}

	protected void clearDataComponents() {
		dataComponents.forEach((k, v) -> {
			if (v instanceof JTextField) { // PARA J TEXT FIELD
				((JTextField) v).setText("");
				
			}
		});
	}

	// OBTENER LISTAS -----------------------------------

	public List<JComponent> getComponents() {
		return getAllElementsFormLists();
	}

	// Build unique lists

	private List<JComponent> getAllElementsFormLists() {
		List<JComponent> tempList = new ArrayList<JComponent>();

		tempList.addAll(components);

		dataComponents.forEach((k, v) -> {
			tempList.add(v);
		});
		dynamicLabels.forEach((k, v) -> {
			tempList.add(v);
		});

		return tempList;
	}
	
	// return data elements
	
	public Map<String, JComponent> getDataElements(){
		return dataComponents;
	}

	// OTROS METODOS ----------------------------------

	public void createElements() {
		createLabels();
		createButtons();
		createtextFields();
	}

	// MÉTODOS PARA ACTUALIZAR EL CONTENIDO DEL PANEL ---

	abstract public void refreshContents(Map<String, String> viewContent);

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
