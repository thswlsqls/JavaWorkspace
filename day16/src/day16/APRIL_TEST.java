package day16;

import java.util.ArrayList;
import java.util.Scanner;


public class APRIL_TEST {
	
	class methods{
public int oddEven(int num) {
	if(num%2 == 0) {
		return num + 10;
	}else if(num %2 != 0) {
		return num - 10;
	}
	return 0;
}		
		
		public void exception() {
			int num = 123;
			int result = num/0;
			System.out.println("���� �ڵ带 ����");
		}
	}
	
public void exception() throws ArithmeticException{
	try {
	int num = 123;
	int result = num/0;
	}catch(ArithmeticException e) { e.printStackTrace();}
	System.out.println("���� �ڵ带 ����");
}
	
	public static void main(String[] args) {
		
		/*
		String userId = "	ȫ�浿 ";
		System.out.println(userId);
		String name = userId.trim();
		System.out.println(name);
		if(name.equals("ȫ�浿")) {
			System.out.println("�������!!!");
		}else {
			System.out.println("��������!!!");
		}
		*/
		/*
		Scanner input = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		System.out.println("������� ���̵� �Է� : ");
		String userId = input.next();
			if(arr.contains(userId)) {
				System.out.println("�̹� ����� ���̵��Դϴ�.");
		}else { arr.add(userId); }
		*/
		/*
		APRIL_TEST asd = new APRIL_TEST();
		asd.exception();
		*/		
		/*
		double dou = 1.123;
		float flt = 0;
		flt = (float) dou;
		System.out.println(flt);
		*/
		/*
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch(num) {
		case 1: System.out.println("1����"); break;
		case 2: System.out.println("2����"); break;
		}
		*/
		/*
		int num=0, sum=0;
		if(num==1){
			sum = num*10;
		}else if(num==2) {
			sum = num*20;
		}
		System.out.println("���� ���: "+sum);
		*/
	}
}	

