package day04;

import java.io.IOException;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) throws IOException {
		/*
		Scanner input = new Scanner(System.in);
		String name;
		while(true)
		{
			System.out.println("�̸� �Է�");
			System.out.println(">>> ");
			name = input.next();
			System.out.println("����� �̸��� " + name + " �̱���");
		}
		*/
		String h_addr = null, c_addr =  null; //�ʱ�ȭ���� ������ ������ �߻��Ѵ�.
		while(true) {
			System.out.println("1.�츮�� ���\r2.ȸ�� ���\r3.��� ����");
			Scanner input = new Scanner(System.in);

			int n = input.nextInt(); 

			switch(n) {
				case 1: System.out.println("�츮�� ������ �Է�: "); h_addr = input.next(); System.out.println(" ��ϼ���"); break;
				case 2: System.out.println("ȸ�� ������ �Է�: "); c_addr = input.next(); System.out.println(" ��ϼ���"); break;
				case 3: System.out.println("�츮��: "+ h_addr + "\r"+"ȸ��: " +c_addr+ "\r"); break;
				default: System.out.println("1, 2, 3���� �ϳ��� ���� �Է��� �ּ���.");
			}
		}
		/*
		int num=3, sum=0;
		int a = 0;
		char ch = 0;
		double d = 0;
		String s = null;
		if(num==1) {
			sum=10;
		}else if(num==2) {
			sum=20;
		}
		System.out.println("sum : "+sum);
		*/
		/*
		 ��¥�� �Է¹޾� 1���̸� '��' 2���̸� 'ȭ' ... 7�ϸ� '��' 
		 8���̸� '��'�̶�� 
		 ������ ����Ͻÿ�.
		*/
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("������ ���Ϸ� ��ȯ�մϴ�. ������ �Է��ϼ���.");
		int day = input.nextInt();
		System.out.println(day%7==0?"��":day%7==1?"��":day%7==2?"ȭ":day%7==3?"��":day%7==4?"��":day%7==5?"��":"��");
		*/
		/*
		Scanner input = new Scanner(System.in);
		String s;
		s = input.next();
		switch(s) {
			case "�ȳ��ϼ���": System.out.println(s+" : ����"); break;
			case "�ݰ����ϴ�": System.out.println(s+" : ����"); break;
		}
		*/
		/*
		int num;
		char ch;
		System.out.print("���� �Է� : ");
		num = System.in.read(); //���� �ϳ��� ���´�.
		switch(num) {
		case 'a': System.out.println("a�Է�"); break;
		case 'A': System.out.println("A�Է�"); break;
		default : System.out.println("a�� �ƴ� �ٸ� ���Է�"); break;
		}
		*/
		/*
		Scanner input = new Scanner(System.in);
		int select;
		System.out.println("�� �Է�: ");
		select = input.nextInt();
		switch(select) { //����, ����, ���ڿ��� case���� ���� �� �ִ�.
		case 1: System.out.println("1. �Է��� �� : "+select); break;
		case 2: System.out.println("2. �Է��� �� : "+select); break;
		case 3: System.out.println("3. �Է��� �� : "+select); break;
		default: System.out.println("4. �Է��� �� : 1,2,3�� �ƴ� �ٸ� ��");
		}
		*/	
	}
}
