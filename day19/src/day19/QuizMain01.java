package day19;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class QuizMain01 {
	public static void main(String[] args) throws Exception {
		
		File path = new File("C:\\SPRINGworkspace\\day19\\abcd1234");
		path.mkdir();
		System.out.println(path);
		String sPath = path.getPath()+"\\test.txt";
		FileOutputStream fos = new FileOutputStream(sPath);
		Scanner input = new Scanner(System.in);
		System.out.println("이름");
		String name = input.next();
		System.out.println("나이");
		String age = input.next();
		System.out.println("주소");
		String addr = input.next();
		
		name += "\n" + age + "\n" + addr;
		
		fos.write(name.getBytes());
		
	}
}
