package com.roarbotics;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import com.cedarsoftware.util.io.JsonWriter;
import com.roarbotics.window.InitAlert;
import com.roarbotics.window.WindowRunner;

public class Main {

	protected static boolean init = false;

	static ScoutingForm scout;

	static int teamNum;

	public static void main(String[] args) throws IOException {
		if (!init) {
			scout = new ScoutingForm(InitAlert.run());
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

}
