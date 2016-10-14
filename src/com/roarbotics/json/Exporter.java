package com.roarbotics.json;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import com.cedarsoftware.util.io.JsonWriter;
import com.roarbotics.Main;

public class Exporter {
	public static enum Option {
		robotAttributes, performanceCharacteristics, other
	}

	public static void addToScoutingForm(Option type, int spot, int key) {
		switch (type) {
		case robotAttributes:
			Main.getScout().setRobotAttribute(spot, key);
			break;
		case performanceCharacteristics:
			Main.getScout().setPerformaceCharacteristics(spot, key);
			break;
		case other:
			Main.getScout().setOther(spot, key);
			break;
		}
	}

	public static void exportJSON() throws IOException {

		Path file = FileSystems.getDefault().getPath("scout.json");
		try {
			// Create the empty file with default permissions, etc.
			Files.createFile(file);
		} catch (FileAlreadyExistsException x) {
			System.err.format("file named %s" + " already exists%n", file);
		} catch (IOException x) {
			// Some other sort of failure, such as permissions.
			System.err.format("createFile error: %s%n", x);
		}
		String json = JsonWriter.objectToJson(Main.getScout());
		FileWriter out = new FileWriter("scout.json");
		out.write(json);
		out.close();

	}
	
}