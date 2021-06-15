package client;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client01 {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("192.168.200.182", 55555);
		
		OutputStream os = s.getOutputStream();
		
		Scanner input = new Scanner(System.in);
		System.out.println("데이터 입력 : ");
		int outData = input.nextInt();
		os.write(outData);
		
		os.close();
		s.close();
	}
}
