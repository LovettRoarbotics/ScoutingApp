package com.roarbotics.net;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.roarbotics.Options;

public class SendFile {

	/**
	 * Initializes a server with the port of
	 * {@link com.rorbotics.Options#LISTENING_PORT LISTENING_PORT}.
	 * 
	 * @author Byron Lathi
	 * @throws IOException
	 */
	static ServerSocket receiver = null;
	static OutputStream out = null;
	static Socket socket = null;
	static File myFile = new File("scout.json");
	/* static int count; */
	static byte[] buffer = new byte[(int) myFile.length()];

	public static void send() throws IOException {
		socket = new Socket("10.10.46.26", Options.LISTENING_PORT);
		System.out.println("Accepted connection from : " + socket);
		FileInputStream fis = new FileInputStream(myFile);
		BufferedInputStream in = new BufferedInputStream(fis);
		in.read(buffer, 0, buffer.length);
		out = socket.getOutputStream();
		System.out.println("Sending file");
		out.write(65);
		out.write(buffer, 0, buffer.length);
		out.flush();
		/*
		 * while ((count = in.read(buffer)) > 0){ out.write(buffer,0,count);
		 * out.flush(); }
		 */
		out.close();
		in.close();
		socket.close();
		System.out.println("Finished sending");

	}
}
