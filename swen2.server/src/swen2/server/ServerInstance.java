package swen2.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerInstance {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(5431);
			Socket socket = serverSocket.accept();
			Scanner scan = new Scanner(socket.getInputStream());
			String line = scan.nextLine();
			System.out.println(line);
			serverSocket.close();
			scan.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
