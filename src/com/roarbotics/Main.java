package com.roarbotics;

import java.io.IOException;

import com.roarbotics.window.InitAlert;
import com.roarbotics.window.WindowRunner;

public class Main {

	protected static boolean init = false;

	private static ScoutingForm scout;

	static int teamNum;

	public static void main(String[] args) throws IOException {
		if (!init) {
			setScout(new ScoutingForm(InitAlert.run()));
			init();
			init = true;
		}

	}

	protected static void init() {
		WindowRunner.run();
	}


	public static void setTeam(String team) {
		setTeam(Integer.parseInt(team));
	}

	public static void setTeam(int team) {
		teamNum = team;
	}

	public static ScoutingForm getScout() {
		return scout;
	}

	public static void setScout(ScoutingForm scout) {
		Main.scout = scout;
	}

}
