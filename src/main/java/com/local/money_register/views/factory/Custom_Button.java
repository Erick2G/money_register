package com.local.money_register.views.factory;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.local.money_register.constants.Constants;

public class Custom_Button extends JButton {
	
	private int width = 0, height = 25;
	private int currentMeassure = 8;
	
	// CONSTRUCTORES
	
	public Custom_Button(String buttonText, Integer x, Integer y) {
		super();
		setAllBounds(buttonText, x, y);
		this.setText(formatText(buttonText));
	}
	
	// METODOS
	
	private void setDimensions(String text) {
		int textLength = text.length();
		
		if(textLength >= Constants.MAX_X_BUTTON_CHARACTERS) {
			// WIDTH
			this.width = (Constants.MAX_X_BUTTON_CHARACTERS * currentMeassure) + 10;
			
			// HEIGHT
			int buttonExtraLevel = textLength % Constants.MAX_X_BUTTON_CHARACTERS;
			this.height = (textLength / Constants.MAX_X_BUTTON_CHARACTERS) * 22
					+ (buttonExtraLevel > 0 ? 22 : 0);
			
		} else {
			this.width = (textLength * currentMeassure) + 10;
		}
	}
	
	private void setAllBounds(String buttonName, Integer x, Integer y) {
		setDimensions(buttonName);
		if(x == null || y == null) {
			this.setSize(width, height);
		} else {
			this.setBounds(x, y, width, height);
		}
		
	}
	
	private String formatText(String message) {
			return  "<html>" + message + "<html>";
	}

}
