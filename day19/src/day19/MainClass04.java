package day19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class MainClass04 {
	public static void main(String[] args) throws Exception {
		File path = new File("C:\\SPRINGworkspace\\day19\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		try {
			for(int i = '1'; i <= '9'; i++) {
				Thread.sleep(200);
				bos.write(i);
			}
			bos.flush();
	//		bos.close();
	//		bos.write('a');
	//		fos.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
