package server;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import mythread.MyThread;

public class Server03 {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(33333);

		while(true) {
			Socket clt_s = server.accept();
		    MyThread my = new MyThread(clt_s);
		}	
	}
}
