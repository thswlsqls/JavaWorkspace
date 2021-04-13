package day03;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		int su;
		su=8;
		String s = (su % 2==0)?"짝수":"홀수";
		System.out.println(su+" = "+s);
		
		su = 9;
		s = (su % 2 == 0)?"짝수":"홀수";
		System.out.println(su+" = "+s);
		 */
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력 : ");
		
		num = input.nextInt();
		String s0 = (num % 2==0)?"짝수":"홀수";
		System.out.println(num + " = " + s0);
		String result = (num % 3==0)?"3의 배수이다":"3의 배수가 아니다";
		System.out.println(num + " = " + result);
		
		int num1, num2;
		System.out.println("두 수 입력 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		result = (num1>num2)?"num1이 num보다 크다":"num2가 num1보다 크다";
		System.out.println("num1="+num1+" "+"num2="+num2);
		System.out.println(result);
		
	}
}
