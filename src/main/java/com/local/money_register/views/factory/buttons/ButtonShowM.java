package com.local.money_register.views.factory.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.local.money_register.views.factory.Custom_Button;

public class ButtonShowM extends Custom_Button{
	
	String title = "";
	String message = "";
	
	public ButtonShowM(String buttonText, String title, String message, Integer x, Integer y) {
		super(buttonText, x, y);
		this.title = title;
		this.message = getSplitedMessage(message);
		
		addListener();
	}
	
	private void addListener() {
		
		this.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent ev) {
	        	try {
	        		JOptionPane.showMessageDialog(null, "<html><h1>" + title + "</h1><br></br><p>" + message +  "</p><html>" );
	        	}catch(Exception e) {
	        		JOptionPane.showMessageDialog(null,
	        				"<html><h1> Ocurrió un error al intentar mostrar una ventana de mensaje </h1>"
	        				+ "<br></br><p> E: "+ e + "</p><html> ");
	        	}
	           
	        }
	    });
	}
	
	private String getSplitedMessage(String message) {
			return message;
	}
	

}
