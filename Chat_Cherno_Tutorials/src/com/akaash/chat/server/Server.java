package com.akaash.chat.server;

import java.net.DatagramSocket;
import java.net.SocketException;

public class Server implements Runnable
{
	private DatagramSocket socket;
	private int port;
	private boolean running = false;
	private Thread run;
	private Thread manage;
	private Thread send;
	private Thread recieve;
	// threads are used to handle multiple simultanious users
	
	
	public Server(int port)
	{
		this.port = port;
		try {
			socket = new DatagramSocket(port);
		} catch (SocketException e) {
			e.printStackTrace();
		}
		 run = new Thread(this, "");
	}
	public void run()
	{
		running = true;
		manageClients();
		recieve();
	}
	
	private void manageClients()
	{
		manage = new Thread("Manage")
		{
			public void run()
			{
				while (running)
				{
					//Managing
				}
			}
		};
		manage.start();
	}
	
	private void recieve()
	{
		recieve = new Thread("Recieve")
		{
			public void run()
			{
				
			}
		};
	}
}
