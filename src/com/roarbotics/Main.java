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
		export();

	}

	protected static void init() {
		WindowRunner.run();
	}

	public static void export() throws IOException {
		Path file = FileSystems.getDefault().getPath("scout.json");
		try {
		    // Create the empty file with default permissions, etc.
		    Files.createFile(file);
		} catch (FileAlreadyExistsException x) {
		    System.err.format("file named %s" +
		        " already exists%n", file);
		} catch (IOException x) {
		    // Some other sort of failure, such as permissions.
		    System.err.format("createFile error: %s%n", x);
		}
		String json = JsonWriter.objectToJson(scout);
		FileWriter out = new FileWriter("scout.json");
		out.write(json);
		out.close();

	}

	public static void setTeam(String team) {
		setTeam(Integer.parseInt(team));
	}

	public static void setTeam(int team) {
		teamNum = team;
	}

}
