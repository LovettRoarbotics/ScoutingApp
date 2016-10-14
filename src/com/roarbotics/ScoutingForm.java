package com.roarbotics;

public class ScoutingForm {
	private int team;
	// The supressors are so that I don't have to see warnings for
	// something that I know is alright.
	@SuppressWarnings("unused")
	private String[] TEMPLATErobotAttributes = Options.robotAttributes;
	@SuppressWarnings("unused")
	private String[] TEMPLATEperformanceCharacteristics = Options.performanceCharacteristics;
	@SuppressWarnings("unused")
	private String[] TEMPLATEother = Options.other;
	private int[] robotAttributes = new int[Options.robotAttributes.length];
	private int[] performanceCharacteristics = new int[Options.performanceCharacteristics.length]; 
	private int[] other = new int[Options.other.length];
	public int getTeam() {
		return team;
	}

	public int[] getRobotAttributes() {
		return robotAttributes;
	}

	public int[] getPerformanceCharacteristics() {
		return performanceCharacteristics;
	}

	public int[] getOther() {
		return other;
	}
	
	public ScoutingForm(int team){
		this.team = team;
	}
	
	public void setRobotAttribute(int place, int key){
		robotAttributes[place] = key;
	}
	
	public void setPerformaceCharacteristics(int place, int key){
		performanceCharacteristics[place] = key;
	}
	
	public void setOther(int place, int key){
		other[place] = key;
	}
	
}
