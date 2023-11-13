package com.cours.sockets;

import java.net.*;

public class MainUrl {

	public static void main(String[] args) {
		
		final String path = "https://www.google.com";
		
		try {
			URL url = new URL(path);
			System.out.println("Protocol: "+url.getProtocol());
			System.out.println("Host name: "+url.getHost());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
