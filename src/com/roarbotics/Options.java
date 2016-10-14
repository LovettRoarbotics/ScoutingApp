package com.roarbotics;

public class Options {
	//TODO: Make it easier to change these, perhaps with another JSON?
	/** Attribues of the robot, such as the drivetrain configuration, Autonomous mode, strategy, etc.
	 * <p>*Note that a String Array is probably not the best choice for this*
	 * @author Byron Lathi
	 */
	//TODO Change these to more accurately represent their meanings.
	public static String[] robotAttributes = {"exists", "is red", "turns on"};
	public static String[] performanceCharacteristics = {};
	public static String[] other = {};
	
	public static int[] windowDim = {1280, 800};
}
