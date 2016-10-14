package com.roarbotics.window;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

import com.roarbotics.Options;

public class OptionsPanel {
	
	public static List<JCheckBox> robotAttributesCheckBoxes;
	
	public static JPanel optionsPanel(){
		JPanel optionsPanel = new JPanel();
		robotAttributesCheckBoxes = new ArrayList<JCheckBox>();
		JCheckBox[] robotAttributes = new JCheckBox[Options.robotAttributes.length];
		//TODO: These are all checkboxes, allow user to have other options
		for (int i = 0; i < robotAttributes.length; i++){
			robotAttributes[i] = new JCheckBox(Options.robotAttributes[i]);
			robotAttributesCheckBoxes.add(robotAttributes[i]);
			optionsPanel.add(robotAttributes[i]);
		}
				
		
		
		return optionsPanel;
		
		
		
	}
}
