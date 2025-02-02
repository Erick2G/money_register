package com.local.money_register.views.factory;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Custom_Label extends JLabel {
	private int width = 0, height = 0;
	private int currentMeassure = 0;
	private int generalCharSize = 0;

	// CONSTRUCTORES -----------------------------------------

	public Custom_Label(String labelText, int charSize, Integer x, Integer y, int maxLength) {
		super();
		generalCharSize = charSize;
		currentMeassure = calculateMeassure(generalCharSize);
		setWidthAndHeight(labelText, maxLength);
		setAllBounds(x, y);
		this.setText(formatText(labelText, generalCharSize));
//		this.setBackground(Color.gray);
//		this.setOpaque(true);
	}

	public Custom_Label(String labelText, int charSize, Integer x, Integer y, int width, int height) {
		super();
		generalCharSize = charSize;
		currentMeassure = calculateMeassure(generalCharSize);
		this.width = width;
		this.height = height;
		setAllBounds(x, y);
		this.setText(formatText(labelText, generalCharSize));
	}

	// CALCULAR DIMENSIONES -----------------------------------

	private void setWidthAndHeight(String text, int maxLength) {
		int textLength = text.length() * currentMeassure;
		int heightBase = Double.valueOf(currentMeassure * 2.8).intValue();
		this.width = maxLength;

		if (textLength >= maxLength) {
			this.height = (textLength / maxLength) * heightBase 
					+ (textLength % maxLength < 0 ? heightBase : 0);
		} else {
			this.height = heightBase;
		}
	}

	private void setAllBounds(Integer x, Integer y) {
		if (x == null || y == null) {
			this.setSize(width, height);
		} else {
			this.setBounds(x, y, width, height);
		}
	}

	private int calculateMeassure(int meassure) {
		switch (meassure) {
		default:
		case 0:
			return 8;
		case 1:
			return 12;
		case 2:
			return 10;
		}
	}

	// MODIFICAR TEXTO
	
	private String formatText(String message, int charSize) {
		String newText = "<html>";
		
		switch(charSize) {
		default:
		case 0:
			newText+= "<p>" + message + "<p>";
			break;
		case 1:
			newText+= "<h1>" + message + "<h1>";
			break;
		case 2:
			newText+= "<h2>" + message + "<h2>";
			break;
		}

		return newText + "<html>";
	}

	public void setNewText(String text) {
		setText(formatText(text, generalCharSize));
	}
}
