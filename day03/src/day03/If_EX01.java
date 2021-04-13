package day03;

import java.util.Scanner;

public class If_EX01 {

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		/*
		int num;
		System.out.println("1.쉬운 게임");
		System.out.println("2.어려운 게임");
		System.out.println("3. 나가기");
		System.out.println(">>> ");
		num = input.nextInt();
		if(num == 1)
			System.out.println("쉬운 게임 시작");
		if(num == 2)
			System.out.println("어려운 게임 시작");
		if(num == 3)
			System.out.println("종료 합니다");
		*/
		/*
		int num;
		System.out.println("수 입력 : ");
		num = input.nextInt();
		if(num > 10)
		{
			System.out.println("종속문장 실행");
			System.out.println("종속문장 실행");
			System.out.println("종속문장 실행");
			System.out.println("종속문장 실행");
			System.out.println("종속문장 실행");
			System.out.println("종속문장 실행");
			System.out.println("종속문장 실행");
		}
		System.out.println("다음 문장입니다");
		*/
		/*
		int num;
		System.out.println("수 입력 : ");
		num = input.nextInt();
		if(num % 2 == 0) {
			System.out.println("입력하신 수는 짝수 입니다.");
		}
		if(num % 2 != 0) {
			System.out.println("입력하신 수는 홀수 입니다");
		}
		*/
		
		Scanner input = new Scanner(System.in);
		//입력한 데이터가 3의 배수인 경우 출력하시오.
		int num0;
		System.out.println("3의 배수인지 검사합니다. 수 입력: ");
		num0 = input.nextInt();
		String result = (num0%3 == 0)?"3의 배수입니다":"3의 배수가 아닙니다";
		System.out.println(num0+"="+result);
		//입력한 수의 절대값을 구하는 프로그램을 작성하시오.
		System.out.println("절댓값을 계산합니다. 수 입력: ");
		int num1 = input.nextInt();
		System.out.println(num1+"의 절댓값: "+Math.abs(num1));
		//두수를 입력 받아 큰 수를 출력하시오.
		System.out.println("더 큰 수를 찾습니다. 두 수 입력: ");
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		System.out.println((num2>num3)?num2:num3 + "(이)가 더 큽니다.");
		System.out.println("가장 큰 수를 찾습니다. 세 수 입력: ");
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		int num6 = input.nextInt();
		int result_ = (num4>num5)?num4:num5;
		System.out.println((result_>num6)?result_:num6+"(이)가 가장 큽니다.");
		System.out.println("더 큰 수를 찾아 짝수인지 검사합니다. 두 수 입력: ");
		int num7 = input.nextInt();
		int num8 = input.nextInt();
		int bigger = (num7>num8)?num7:num8;
		System.out.println(((num7>num8?num7:num8)%2==0)?bigger+"(은)는 짝수입니다.":bigger+"(은)는 짝수가 아닙니다.");
		System.out.println("두 수의 합이 짝수이며 3의 배수인지 검사합니다. 두 수 입력: ");
		int num9 = input.nextInt();
		int num10 = input.nextInt();
		int sum = num9 + num10;
		System.out.println((sum%2==0&&sum%3==0)?sum+"은(는)짝수이고 3의 배수입니다.":sum+"은(는)짝수이고 3의 배수가 아닙니다.");
	}
}

