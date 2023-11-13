package com.cours.sockets;

import java.io.*;
import java.net.*;

public class MainSocket {

	public static void main(String[] args) {
		
		final int port = 6666;
		
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("waiting for a connexion...");
			Socket socket = serverSocket.accept();
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			String recivedString = dataInputStream.readUTF();
		    
			System.out.println("Recieved Message: "+recivedString);
			serverSocket.close();
			dataInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
