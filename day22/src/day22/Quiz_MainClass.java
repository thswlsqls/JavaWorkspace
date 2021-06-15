package day22;

import java.util.Scanner;

public class Quiz_MainClass {
	public static void main(String[] args) {
		saveUser save = new saveUser();
		showUser show = new showUser();
		showThisEvents te = new showThisEvents();
		showAllEvents ae = new showAllEvents();
		
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("1.회원 저장 기능\r2.회원수 보기 기능\r3.이달의 이벤트 보기\r4.전체 이벤트 보기\r5.종료");
			System.out.print(">>> ");
			int n = input.nextInt();
			switch(n) {
				case 1: save.saveUser(); break;
				case 2:	show.showUser(); break;
				case 3:	te.showThisEvents(); break;
				case 4:	ae.showAllEvents(); break;
				case 5: System.out.println("종료합니다."); System.exit(0);
			}
		}
	}
}
