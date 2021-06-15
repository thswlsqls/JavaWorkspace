package day19;

import java.io.File;
import java.io.FileInputStream;

public class MainClass03 {
	public static void main(String[] args) throws Exception{
		
		File path = new File("C:\\SPRINGworkspace\\day19\\aaa.txt");
		FileInputStream fis = new FileInputStream(path);
		
		byte[] readData = new byte[1024];
		
		fis.read(readData);
		System.out.println(readData.toString());
		for(int i=0; i<readData.length; i++) {
			System.out.println(readData[i]);
		}
		
		while(true) {
			int res = fis.read();
			if(res == -1) break;
			System.out.println(res);
		}
	}
}
