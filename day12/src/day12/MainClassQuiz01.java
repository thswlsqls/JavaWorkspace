package day12;

import java.util.Scanner;

public class MainClassQuiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz01 quiz01 = new Quiz01();
		String id=null;
		String pw=null;
		
		while(true) {
			System.out.println("1.로그인 2.가입 3.로그아웃");
			System.out.print(">>>");
			int select = input.nextInt();
			switch(select) {
				case 1:{
					quiz01.Login(id, pw, input, quiz01);
				}break;
				case 2:{
					quiz01.Resister(id, pw, input, quiz01);
				}break;
				case 3: System.out.println("로그아웃 되었습니다.");
			}
		}
	}
}
