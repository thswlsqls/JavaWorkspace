package day02;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		Scanner input = new Scanner(System.in);
		int age;
		String name;
		System.out.println("����� ���̴�? : ");
		age = input.nextInt();
		//System.out.println("�Է��� ���� : "+age);
		System.out.print("����� �̸� : ");
		name = input.next();
		System.out.println(name+"���� ���̴�"+age+"���̱���");
		*/
		
		Scanner input = new Scanner(System.in);
		String name;
		int korean;
		int english;
		int math;
		System.out.println("����� �̸��� �����Դϱ�? : ");
		name = input.nextLine();
		System.out.println("ȫ�浿 ���� ���� ����:");
		korean = input.nextInt();
		System.out.println("ȫ�浿 ���� ���� ����:");
		english = input.nextInt();
		System.out.println("ȫ�浿 ���� ���� ����:");
		math = input.nextInt();
		
		System.out.println("================");
		System.out.println("�� �� : "+name);
		System.out.println("================");
		System.out.println("�� �� : "+korean);
		System.out.println("�� �� : "+english);
		System.out.println("�� �� : "+math);
		System.out.println("================");
		int sum = korean + english + math;
		System.out.println("�� �� : "+sum);
		int avg = sum/3;
		System.out.println("�� �� : "+avg);
	}
}
