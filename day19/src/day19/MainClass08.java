package day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class MainClass08 {
	public static void main(String[] args) throws Exception {
		int i = 0;
		File path = new File("C:\\SPRINGworkspace\\day19\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
	
		while(i < 3) {
		Scanner input = new Scanner(System.in);
		TestMember t = new TestMember();
		
		System.out.print("이름 저장: ");
		t.setName(input.next());
		System.out.print("나이 저장: ");
		t.setAge(input.nextInt());
		
		
		oos.writeObject(t);
		oos.writeChar('\r');
		Thread.sleep(2000);
		oos.flush();
		i++;
		
		}
		
		oos.close(); bos.close(); fos.close();

		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		TestMember m = (TestMember)ois.readObject();
		System.out.println(m);
		
		ois.close(); bis.close(); fis.close();
		
	}
}
