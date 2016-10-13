package com.roarbotics.window;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class InitAlert extends JFrame {
	private static final long serialVersionUID = 1L;

	public static int run(){
		return Integer.parseInt((String)JOptionPane.showInputDialog("Please enter the number of the team you are scouting."));
    }
}
