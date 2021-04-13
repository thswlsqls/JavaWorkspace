package day02;

import java.io.IOException;

public class MainClass02 {
	public static void main(String[] args) throws IOException {
		/*
		int val;
		System.out.println("문자 하나 입력 : ");
		val = System.in.read();
		System.out.println("입력 값 : "+(char)val);
	
		System.in.read();
		System.in.read();
		int val01;
		System.out.println("문자 하나 입력 : ");
		val01 = System.in.read();
		System.out.println("입력 값 : "+val01);
	
		int val02;
		System.out.println("문자 하나 입력 : ");
		System.in.read();
		System.in.read();
		val02 = System.in.read();
		System.out.println("입력 값 : "+(char)val02);
		*/
		/*
		int val, val01;
		System.out.println("문자 입력: ");
		val = System.in.read();
		val01 = val + 32;
		System.out.println("입력하신 문자 :"+ (char)val);
		System.out.println("소문자로 변환 :"+ (char)val01);
		*/
		
		int val02;
		System.out.println("값 입력: ");
		val02 = System.in.read();
		System.out.println("==== 출 력 ====");
		System.out.println("입력하신 값 :" + (char)val02);
		System.out.println("연산하신 값 :" + (val02-48));
	}
}
