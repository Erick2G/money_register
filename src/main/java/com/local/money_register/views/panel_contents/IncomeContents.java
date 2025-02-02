package com.local.money_register.views.panel_contents;

import java.util.HashMap;
import java.util.Map;

import com.local.money_register.constants.Constants;
import com.local.money_register.views.factory.Custom_Label;
import com.local.money_register.views.factory.Custom_TextF;
import com.local.money_register.views.factory.PanelContent;
import com.local.money_register.views.factory.buttons.ButtonChangePanel;
import com.local.money_register.views.factory.buttons.ButtonRequestData;

public class IncomeContents extends PanelContent {

	// VARIABLES

	public enum DynamicLabels {
		TOTAL_MONEY
	}

	public enum dataComponents {
		CANTIDAD
	}

	private Map<String, String> viewContent = new HashMap<String, String>();

	// SINGLETON -------------------

	private static IncomeContents instance;

	private IncomeContents() {
		// createElements();
	}

	public static IncomeContents getInstance() {
		if (instance == null) {
			instance = new IncomeContents();
		}
		return instance;
	}

	// SETTEAR CONTENIDO

	public void setViewContent(Map<String, String> viewContent) {
		this.viewContent = viewContent;
	}

	// CARGAR DATOS DE LA VISTA

	@Override
	protected void createLabels() {
		addComponent(new Custom_Label("Registrando ingreso", 1, 10, 10, Constants.PANEL_MAX_WIDTH - 20));

		addComponent(new Custom_Label("Cantidad", 2, 50, 130, Constants.PANEL_MAX_WIDTH - 20));

		addComponent(new Custom_Label("Ahorros actuales", 2, 250, 130, Constants.PANEL_MAX_WIDTH - 20));

		// LABELS DINAMICOS

		addDynamicLabel(DynamicLabels.TOTAL_MONEY.name(),
				new Custom_Label((viewContent.containsKey(DynamicLabels.TOTAL_MONEY.name())
						? viewContent.get(DynamicLabels.TOTAL_MONEY.name())
						: "")
				, 2, 270, 170, Constants.PANEL_MAX_WIDTH - 20));
	}

	@Override
	protected void createButtons() {
		addComponent(new ButtonChangePanel("Página principal", Constants.Views.MAIN, (Constants.PANEL_MAX_WIDTH - 200),
				(Constants.PANEL_MAX_HEIGHT - 100)));
		
		addComponent(new ButtonRequestData("Agregar ingreso", Constants.Views.INCOME, (Constants.PANEL_MAX_WIDTH - 200),
				(Constants.PANEL_MAX_HEIGHT - 250), getDataElements()));

	}

	protected void createtextFields() {
		addDataComponent(dataComponents.CANTIDAD.name(), new Custom_TextF(50, 170, 80));

	}

	// ACTUALIZAR CONTENIDO

	@Override
	public void refreshContents(Map<String, String> viewContent) {
		clearDataComponents();
		
		if(viewContent.containsKey(DynamicLabels.TOTAL_MONEY.name())) {
			changeDynamicLabelText(DynamicLabels.TOTAL_MONEY.name()
					, viewContent.get(DynamicLabels.TOTAL_MONEY.name()));
		}

//			changeDynamicLabelText(DynamicLabels.TOTAL_MONEY.name()
//					, viewContent.get(dataComponents.CANTIDAD.name()));

	}

}
