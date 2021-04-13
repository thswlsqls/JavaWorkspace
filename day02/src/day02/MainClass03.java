package day02;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		Scanner input = new Scanner(System.in);
		int age;
		String name;
		System.out.println("당신의 나이는? : ");
		age = input.nextInt();
		//System.out.println("입력한 나이 : "+age);
		System.out.print("당신의 이름 : ");
		name = input.next();
		System.out.println(name+"님의 나이는"+age+"살이군요");
		*/
		
		Scanner input = new Scanner(System.in);
		String name;
		int korean;
		int english;
		int math;
		System.out.println("당신의 이름은 무엇입니까? : ");
		name = input.nextLine();
		System.out.println("홍길동 님의 국어 점수:");
		korean = input.nextInt();
		System.out.println("홍길동 님의 영어 점수:");
		english = input.nextInt();
		System.out.println("홍길동 님의 수학 점수:");
		math = input.nextInt();
		
		System.out.println("================");
		System.out.println("이 름 : "+name);
		System.out.println("================");
		System.out.println("국 어 : "+korean);
		System.out.println("영 어 : "+english);
		System.out.println("수 학 : "+math);
		System.out.println("================");
		int sum = korean + english + math;
		System.out.println("합 계 : "+sum);
		int avg = sum/3;
		System.out.println("평 균 : "+avg);
	}
}
