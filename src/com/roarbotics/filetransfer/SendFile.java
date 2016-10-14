package com.roarbotics.filetransfer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.roarbotics.Options;

public class SendFile {
	protected static ServerSocket scoutingApp;
	protected static Socket serviceSocket;
	protected static PrintStream output;
	
	
/**
 * Initializes a server with the port of {@link com.rorbotics.Options#LISTENING_PORT LISTENING_PORT}.
 * @author Byron Lathi
 * @throws IOException
 */
	public static void initServer() throws IOException {
		scoutingApp = new ServerSocket(Options.LISTENING_PORT);
		serviceSocket = scoutingApp.accept();
		output = new PrintStream(serviceSocket.getOutputStream());
	}
	
	/**
	 * 
	 * @author Byron Lathi
	 * @param file
	 * @throws FileNotFoundException
	 */
	public static void sendFile(File file) throws FileNotFoundException {
		output = new PrintStream(file);
	}

	public static void closeServer() {
		try {
			serviceSocket.close();
			output.close();
			scoutingApp.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}