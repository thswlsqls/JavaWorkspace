package day19;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class MainClass05 {
	public static void main(String[] args) throws Exception {
		File path = new File("C:\\SPRINGworkspace\\day19\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeUTF("김개똥");
		dos.writeInt(1000);
		dos.writeDouble(1.1234);
		
		dos.flush();
		dos.close(); bos.close(); fos.close();
		
	}
}
