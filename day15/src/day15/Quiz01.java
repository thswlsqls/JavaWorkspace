package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		while(true) {
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("인증 프로그램 입니다.");
				System.out.print("생년 월일 6자 입력 : "); int birth = input.nextInt();
				if(birth>900000) {
					System.out.println("가입 불가");
				}else if(birth<100000) {
					System.out.println("길이가 틀렸습니다.");
				}else {
					System.out.println("가입 가능");
				}
			}catch(InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
			}
		}
		
	}
}

