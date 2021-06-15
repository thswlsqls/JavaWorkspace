package quiz;

import java.io.*;
import java.net.*;
import java.util.*;

public class QuizClient extends Thread{
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner input = new Scanner(System.in);
		Socket sock = new Socket("192.168.200.182",33333);//접속할 서버의 ip/port
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		
		String readData;
		
		ClientReceiver rcv = new ClientReceiver(sock);
		rcv.start();

		while(true) {
			//System.out.print("송신 문자열 입력 : ");
			String data = input.next();
			dos.writeUTF(data);
		}
		//dos.close();
		//out.close();
		//sock.close();
	}

}
