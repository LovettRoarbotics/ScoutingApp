package com.roarbotics.window;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

import com.roarbotics.Options;

public class OptionsPanel {

	public static List<JCheckBox> robotAttributesCheckBoxes;
	public static List<JCheckBox> performanceCharacteristicsCheckBoxes;
	public static List<JCheckBox> otherCheckBoxes;
	
	// TODO: These are all checkboxes, allow user to have other options

	public static JPanel robotAttributes() {
		JPanel robotAttributesPanel = new JPanel();
		JCheckBox[] robotAttributes = new JCheckBox[Options.robotAttributes.length];
		robotAttributesCheckBoxes = new ArrayList<JCheckBox>();
		for (int i = 0; i < robotAttributes.length; i++) {
			robotAttributes[i] = new JCheckBox(Options.robotAttributes[i]);
			robotAttributesCheckBoxes.add(robotAttributes[i]);
			robotAttributesPanel.add(robotAttributes[i]);
		}
		return robotAttributesPanel;
	}

	public static JPanel performanceCharacteristics() {
		JPanel performanceChraracteristicsPanel = new JPanel();
		JCheckBox[] performanceCharacteristics = new JCheckBox[Options.performanceCharacteristics.length];
		performanceCharacteristicsCheckBoxes = new ArrayList<JCheckBox>();
		for (int i = 0; i < performanceCharacteristics.length; i++) {
			performanceCharacteristics[i] = new JCheckBox(Options.performanceCharacteristics[i]);
			performanceCharacteristicsCheckBoxes.add(performanceCharacteristics[i]);
			performanceChraracteristicsPanel.add(performanceCharacteristics[i]);
		}
		return performanceChraracteristicsPanel;
	}
	
	public static JPanel other() {
		JPanel otherPanel = new JPanel();
		JCheckBox[] other = new JCheckBox[Options.other.length];
		otherCheckBoxes = new ArrayList<JCheckBox>();
		for (int i = 0; i < other.length; i++) {
			other[i] = new JCheckBox(Options.other[i]);
			otherCheckBoxes.add(other[i]);
			otherPanel.add(other[i]);
		}
		return otherPanel;
	}
}
