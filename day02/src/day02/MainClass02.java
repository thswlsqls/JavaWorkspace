package day02;

import java.io.IOException;

public class MainClass02 {
	public static void main(String[] args) throws IOException {
		/*
		int val;
		System.out.println("���� �ϳ� �Է� : ");
		val = System.in.read();
		System.out.println("�Է� �� : "+(char)val);
	
		System.in.read();
		System.in.read();
		int val01;
		System.out.println("���� �ϳ� �Է� : ");
		val01 = System.in.read();
		System.out.println("�Է� �� : "+val01);
	
		int val02;
		System.out.println("���� �ϳ� �Է� : ");
		System.in.read();
		System.in.read();
		val02 = System.in.read();
		System.out.println("�Է� �� : "+(char)val02);
		*/
		/*
		int val, val01;
		System.out.println("���� �Է�: ");
		val = System.in.read();
		val01 = val + 32;
		System.out.println("�Է��Ͻ� ���� :"+ (char)val);
		System.out.println("�ҹ��ڷ� ��ȯ :"+ (char)val01);
		*/
		
		int val02;
		System.out.println("�� �Է�: ");
		val02 = System.in.read();
		System.out.println("==== �� �� ====");
		System.out.println("�Է��Ͻ� �� :" + (char)val02);
		System.out.println("�����Ͻ� �� :" + (val02-48));
	}
}
