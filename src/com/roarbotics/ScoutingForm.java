package com.roarbotics;


public class ScoutingForm {
	private int team;
	private static String[] robotAttributes = Options.robotAttributes;
	private static String[] performanceCharacteristics = Options.performanceCharacteristics; 
	private static String[] other = Options.other;
	
	public ScoutingForm(int team){
		this.team = team;
	}

	public int getTeam() {
		return team;
	}
}
