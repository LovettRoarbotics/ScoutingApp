package com.roarbotics;

public class Options {
	public static final String CONNECTION_ADDRESS = null;
	
	/**
	 * Port to start the server at. It is set to 5482 because yes.
	 */
	public static final int LISTENING_PORT = 5482;
	//TODO: Make it easier to change these, perhaps with another JSON?
	/** Attribues of the robot, such as the drivetrain configuration, Autonomous mode, strategy, etc.
	 * <p>*Note that a String Array is probably not the best choice for this*
	 * @author Byron Lathi
	 */
	//TODO Change these to more accurately represent their meanings.
	public static String[] robotAttributes = {"exists", "is red", "turns on"};
	public static String[] performanceCharacteristics = {"Go fast?", "Go really fast", "does the thing"};
	public static String[] other = {"Looks like it won't fall apart?", "did fall apart?"};
	
	public static int[] windowDim = {1280, 800};
	public static boolean pack = true;
}
