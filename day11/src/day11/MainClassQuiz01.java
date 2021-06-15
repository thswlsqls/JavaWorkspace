package day11;

import java.util.Scanner;

public class MainClassQuiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz01 quiz01 = new Quiz01();
		int count = 0;
		while(true) {
			System.out.println("=== UP & Down Game ===");
			System.out.println("1. 게임시작");
			System.out.println("2. 게임전적");
			System.out.println("3. 게임종료");
			System.out.print(">>>>>");
			int select = input.nextInt();
			int cn=0; int un=0; 
			switch(select) {
				case 1:{
					cn = quiz01.GetNumber(cn);
					System.out.println("=== START ===");
					count = quiz01.PrintUpDown(cn, un, count);
					quiz01.CheckTheRecord(count);
				}break;
				case 2:{
					quiz01.PrintTheRecord();
				}break;
				case 3: {
					System.exit(0);
				}
			}
		}
	}
}
