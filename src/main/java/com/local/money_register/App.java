package com.local.money_register;

import com.local.money_register.frame.FrameController;
import com.local.money_register.constants.Constants;

public class App {
	public static void main(String[] args) {
		
		FrameController.getInstance().requestPanel(Constants.Views.MAIN);
	}
}
