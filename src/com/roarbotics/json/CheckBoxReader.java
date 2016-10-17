package com.roarbotics.json;

import com.roarbotics.ScoutingApp;
import com.roarbotics.Options;
import com.roarbotics.window.OptionsPanel;

public class CheckBoxReader {
	public static void readCheckBoxes(){
		System.out.println("Reading Checkboxes...");
		for (int i = 0; i < Options.robotAttributes.length; i++){
			if (OptionsPanel.robotAttributesCheckBoxes.get(i).isSelected()){
				ScoutingApp.getScout().setRobotAttribute(i, 1);
			} else {
				ScoutingApp.getScout().setRobotAttribute(i, 0);
			}
		}
		for (int i = 0; i < Options.performanceCharacteristics.length; i++){
			if (OptionsPanel.performanceCharacteristicsCheckBoxes.get(i).isSelected()){
				ScoutingApp.getScout().setPerformaceCharacteristics(i, 1);
			} else {
				ScoutingApp.getScout().setPerformaceCharacteristics(i, 0);
			}
		}
		for (int i = 0; i < Options.other.length; i++){
			if (OptionsPanel.otherCheckBoxes.get(i).isSelected()){
				ScoutingApp.getScout().setOther(i, 1);
			} else {
				ScoutingApp.getScout().setOther(i, 0);
			}
		}
		System.out.println(ScoutingApp.getScout().getRobotAttributes()[0]);
		System.out.println(ScoutingApp.getScout().getPerformanceCharacteristics()[0]);
		System.out.println(ScoutingApp.getScout().getOther()[0]);
	}
}
