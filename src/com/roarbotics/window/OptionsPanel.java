package com.roarbotics.window;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

import com.roarbotics.Options;

public class OptionsPanel {
	public static JPanel optionsPanel(){
		JPanel optionsPanel = new JPanel();
		JCheckBox exist = new JCheckBox(Options.robotAttributes[0] + "?");
		optionsPanel.add(exist);
		JCheckBox or = new JCheckBox("or does it?");
		optionsPanel.add(or);
		return optionsPanel;
		
	}
}
