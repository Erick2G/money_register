package com.local.money_register.views.factory;

import javax.swing.JTextField;

public class Custom_TextF extends JTextField{
	private int width = 0, height = 25;
	
	// CONSTRUCTORES
	
	public Custom_TextF(Integer x, Integer y, int width) {
		this.width = width;
		setAllBounds(x,y);
	}
	
	// MÉTODOS
	
	private void setAllBounds(Integer x, Integer y) {
		if(x == null || y == null) {
			this.setSize(width, height);
		} else {
			this.setBounds(x, y, width, height);
		}
	}
}
