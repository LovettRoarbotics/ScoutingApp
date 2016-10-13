package com.roarbotics.window;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel {
	public static JPanel buttonPanel(){
		JPanel buttonPanel = new JPanel();
		JButton send = new JButton("Send Form");
		buttonPanel.add(send);
		return buttonPanel;
	}
}
