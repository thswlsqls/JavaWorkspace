package day03;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		int su;
		su=8;
		String s = (su % 2==0)?"¦��":"Ȧ��";
		System.out.println(su+" = "+s);
		
		su = 9;
		s = (su % 2 == 0)?"¦��":"Ȧ��";
		System.out.println(su+" = "+s);
		 */
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Է� : ");
		
		num = input.nextInt();
		String s0 = (num % 2==0)?"¦��":"Ȧ��";
		System.out.println(num + " = " + s0);
		String result = (num % 3==0)?"3�� ����̴�":"3�� ����� �ƴϴ�";
		System.out.println(num + " = " + result);
		
		int num1, num2;
		System.out.println("�� �� �Է� : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		result = (num1>num2)?"num1�� num���� ũ��":"num2�� num1���� ũ��";
		System.out.println("num1="+num1+" "+"num2="+num2);
		System.out.println(result);
		
	}
}
