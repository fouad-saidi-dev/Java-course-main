package com.cours.sockets;

import java.net.*;
import java.io.*;

public class ClientSocket {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("localhost",6666);
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			String message = "Socket Programming in java";
			dataOutputStream.writeUTF(message);
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
