package day15;

import java.util.Scanner;

public class MainCalss03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, result = 0;
		System.out.println("수 입력");
		x = input.nextInt();
		y = input.nextInt();
		
		try {
		result = x/y;
		System.out.println("결과 : "+result);
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		}finally {
			System.out.println("무조건 실행되는 코드");
		}
		System.out.println("다음 문장을 실행");
		System.out.println("다음 문장을 실행");
		System.out.println("다음 문장을 실행");
		System.out.println("다음 문장을 실행");
		System.out.println("다음 문장을 실행");
		
	}
}
