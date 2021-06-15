package server;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(55555);
		System.out.println("접속을 기다립니다.");
		
		Socket clt_s = server.accept();
		System.out.println(clt_s.getInetAddress());
		System.out.println("client01 접속 되었습니다.");
		
		Socket clt_s01 = server.accept();
		System.out.println(clt_s01.getInetAddress());
		System.out.println("client01_01 접속 되었습니다.");
		
		InputStream in = clt_s.getInputStream();
		InputStream in01 = clt_s01.getInputStream();
		int readData = in.read();
		int readData01 = in01.read();
		System.out.println("수신 데이터 : " +readData);
		System.out.println("수신 데이터01 : " +readData01);
		
		in.close();
		clt_s.close();
		server.close();
	}
}
