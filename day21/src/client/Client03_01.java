package client;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client03_01 {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("192.168.200.182", 33333);
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		Scanner input = new Scanner(System.in);
		String sendData;
		System.out.println("송신 데이터 입력");
		sendData = input.next();
		
		dos.writeUTF("client01"+"\\t"+sendData);
	}

}
