package com.local.money_register.constants;

public class Constants {
	
	// FRAME & PANEL
	
	public static String APPLICATION_NAME = "MONEY REGISTER";
	public static int FRAME_WIDTH = 600, FRAME_HEIGHT = 600;
	public static int PANEL_MAX_WIDTH, PANEL_MAX_HEIGHT;
	
	static {
		PANEL_MAX_WIDTH = FRAME_WIDTH - 35;
		PANEL_MAX_HEIGHT = FRAME_HEIGHT - 60;
	}
	
	// VISTAS
	
	public static enum Views {
		MAIN, INCOME, EXPENSES, DEBT
	}
	
	// BOTONES
	
	public static int MAX_X_BUTTON_CHARACTERS = 20;
	

}
