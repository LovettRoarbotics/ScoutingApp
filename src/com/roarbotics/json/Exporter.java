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

	/**
	 * @deprecated Part of {@link #addToScoutingForm}
	 * @author Byron Lathi
	 *
	 */
	public static enum Option {
		robotAttributes, performanceCharacteristics, other
	}

	/**
	 * @deprecated Use the array lists in the OptionsPanel.
	 * @author Byron Lathi
	 * @param type
	 *            The enumerated value of the option
	 * @param spot
	 *            Which place in the array should be replaced
	 * @param key
	 *            The value that should be placed into the array
	 */
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
		System.out.println("Exporting...");
		System.out.println("\tConverting JSON...");
		String json = JsonWriter.objectToJson(Main.getScout());
		writeToFile(file, json);
	}

	private static void writeToFile(Path file, String json) throws IOException {
		try {
			Files.createFile(file);
		} catch (FileAlreadyExistsException x) {
			System.err.format("\nfile named %s" + " already exists%n", file);
		} catch (IOException x) {
			System.err.format("\ncreateFile error: %s%n", x);
		}
		System.out.println("Starting Export...");
		FileWriter out = new FileWriter(file.toFile());
		System.out.println("Exporting...");
		out.write(json);
		out.close();
		System.out.println("Done.");
	}

}
