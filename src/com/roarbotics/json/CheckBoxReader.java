package com.roarbotics.json;

import com.roarbotics.Main;
import com.roarbotics.Options;
import com.roarbotics.window.OptionsPanel;

public class CheckBoxReader {
	public static void readCheckBoxes(){
		for (int i = 0; i < Options.robotAttributes.length; i++){
			if (OptionsPanel.robotAttributesCheckBoxes.get(i).isSelected()){
				Main.getScout().setRobotAttribute(i, 1);
			} else {
				Main.getScout().setRobotAttribute(i, 0);
			}
		}
		for (int i = 0; i < Options.performanceCharacteristics.length; i++){
			if (OptionsPanel.performanceCharacteristicsCheckBoxes.get(i).isSelected()){
				Main.getScout().setPerformaceCharacteristics(i, 1);
			} else {
				Main.getScout().setPerformaceCharacteristics(i, 0);
			}
		}
		for (int i = 0; i < Options.other.length; i++){
			if (OptionsPanel.otherCheckBoxes.get(i).isSelected()){
				Main.getScout().setOther(i, 1);
			} else {
				Main.getScout().setOther(i, 0);
			}
		}
	}
}
