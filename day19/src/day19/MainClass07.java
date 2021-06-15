package day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		TestMember t = new TestMember();
		
		System.out.print("이름 저장: ");
		t.setName(input.next());
		System.out.print("나이 저장: ");
		t.setAge(input.nextInt());
		
		File path = new File("C:\\SPRINGworkspace\\day19\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(t);
		
		oos.close(); bos.close(); fos.close();
		
	}
}
