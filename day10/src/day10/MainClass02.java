package day10;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		Ex02 ex = new Ex02();
		System.out.println("main start!");
		ex.test();
		System.out.println("main end!");
		
		Scanner input = new Scanner(System.in);
		int num, su, sum;
		System.out.println("�� �Է�");
		num = input.nextInt();
		System.out.println("�� �Է�");
		su = input.nextInt();
		sum = ex.sumFunc(num, su);
		System.out.println("�� �� �� : "+sum);

	}
	
}
