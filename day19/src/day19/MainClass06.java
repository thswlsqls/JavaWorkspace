package day19;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;


public class MainClass06 {
	public static void main(String[] args) throws Exception {
		File path = new File("C:\\SPRINGworkspace\\day19\\aaa.txt");
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String s = dis.readUTF();
		int i = dis.readInt();
		double d = dis.readDouble();
		
		System.out.println("문자열: " + s  + "\t정수: " + i + "\t실수: " + d);
		System.out.println("aaa");
	
		dis.close(); bis.close(); fis.close();
		
	}
}
