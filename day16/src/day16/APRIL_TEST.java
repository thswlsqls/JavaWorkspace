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
			System.out.println("다음 코드를 진행");
		}
	}
	
public void exception() throws ArithmeticException{
	try {
	int num = 123;
	int result = num/0;
	}catch(ArithmeticException e) { e.printStackTrace();}
	System.out.println("다음 코드를 진행");
}
	
	public static void main(String[] args) {
		
		/*
		String userId = "	홍길동 ";
		System.out.println(userId);
		String name = userId.trim();
		System.out.println(name);
		if(name.equals("홍길동")) {
			System.out.println("인증통과!!!");
		}else {
			System.out.println("인증실패!!!");
		}
		*/
		/*
		Scanner input = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		System.out.println("사용자의 아이디 입력 : ");
		String userId = input.next();
			if(arr.contains(userId)) {
				System.out.println("이미 저장된 아이디입니다.");
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
		case 1: System.out.println("1실행"); break;
		case 2: System.out.println("2실행"); break;
		}
		*/
		/*
		int num=0, sum=0;
		if(num==1){
			sum = num*10;
		}else if(num==2) {
			sum = num*20;
		}
		System.out.println("연산 결과: "+sum);
		*/
	}
}	

