package day13;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("명령어 입력 : ");
		String s = input.next();
		ProcessBuilder pb = new ProcessBuilder(s); //윈도우에서 실행가능한 명령어를 넣어준다.
		pb.start();
		
		/*
		for(int i=0; i<10; i++) {
			Thread.sleep(1000);
			System.out.println(i+". 실행");
		}
		*/
	}

}
