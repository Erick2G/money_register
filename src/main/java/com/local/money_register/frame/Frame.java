package com.local.money_register.frame;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.local.money_register.constants.Constants;

public class Frame {
	
	private JFrame frame = null;
	private JPanel currentPanel = null;
	
	public Frame(String text) {
		frame = new JFrame();
		setFrameConfiguration(text, Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);
	}
	

	private void setFrameConfiguration(String title, int width, int height) {
        frame.setSize(width, height);
        frame.setTitle(title);
        frame.setLocationRelativeTo(null);
        //frame.setLayout(new GridBagLayout());
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
	}
	
	public void substitutePanel(JPanel panel) {
		try {
			if(currentPanel != null) {
				frame.remove(currentPanel);
			}
			currentPanel = panel;
			frame.add(panel);
            //frame.setContentPane(currentPanel);
            //frame.validate();
            //panel.repaint();
            frame.repaint();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Ocurrió con el panel recibido por el frame, e:" + e);
		}
		
	}
	
	private void clearFrame() {
		//frame.removeAll();
		//frame.validate();
        frame.repaint();
	}
	
}
