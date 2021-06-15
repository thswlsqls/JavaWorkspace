package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {
	public static void main(String[] args) throws Exception  {
		ServerSocket server = new ServerSocket(44444);
		Socket clt_s = server.accept();
		System.out.println("연결 대기 합니다.");
		
		InputStream in = clt_s.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		System.out.println("데이터 수신 대기 합니다.");
	
		String readData = dis.readUTF();
		System.out.println("수신 데이터 : " + readData);
		
//		
		String test = "서버에서 보내는 데이터입니다.";
		OutputStream os = clt_s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF(test);
//		
		
		dos.close(); os.close();
		dis.close(); in.close(); clt_s.close(); server.close();
	
	}
}
