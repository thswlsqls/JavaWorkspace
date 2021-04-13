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
			System.out.println("이름 입력");
			System.out.println(">>> ");
			name = input.next();
			System.out.println("당신의 이름은 " + name + " 이군요");
		}
		*/
		String h_addr = null, c_addr =  null; //초기화되지 않으면 에러가 발생한다.
		while(true) {
			System.out.println("1.우리집 등록\r2.회사 등록\r3.등록 보기");
			Scanner input = new Scanner(System.in);

			int n = input.nextInt(); 

			switch(n) {
				case 1: System.out.println("우리집 목적지 입력: "); h_addr = input.next(); System.out.println(" 등록성공"); break;
				case 2: System.out.println("회사 목적지 입력: "); c_addr = input.next(); System.out.println(" 등록성공"); break;
				case 3: System.out.println("우리집: "+ h_addr + "\r"+"회사: " +c_addr+ "\r"); break;
				default: System.out.println("1, 2, 3중의 하나의 수를 입력해 주세요.");
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
		 날짜를 입력받아 1일이면 '월' 2일이면 '화' ... 7일면 '일' 
		 8일이면 '월'이라고 
		 요일을 출력하시오.
		*/
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 요일로 변환합니다. 정수를 입력하세요.");
		int day = input.nextInt();
		System.out.println(day%7==0?"일":day%7==1?"월":day%7==2?"화":day%7==3?"수":day%7==4?"목":day%7==5?"금":"토");
		*/
		/*
		Scanner input = new Scanner(System.in);
		String s;
		s = input.next();
		switch(s) {
			case "안녕하세요": System.out.println(s+" : 선택"); break;
			case "반갑습니다": System.out.println(s+" : 선택"); break;
		}
		*/
		/*
		int num;
		char ch;
		System.out.print("문자 입력 : ");
		num = System.in.read(); //문자 하나를 얻어온다.
		switch(num) {
		case 'a': System.out.println("a입력"); break;
		case 'A': System.out.println("A입력"); break;
		default : System.out.println("a가 아닌 다른 값입력"); break;
		}
		*/
		/*
		Scanner input = new Scanner(System.in);
		int select;
		System.out.println("수 입력: ");
		select = input.nextInt();
		switch(select) { //정수, 문자, 문자열이 case문에 들어올 수 있다.
		case 1: System.out.println("1. 입력한 수 : "+select); break;
		case 2: System.out.println("2. 입력한 수 : "+select); break;
		case 3: System.out.println("3. 입력한 수 : "+select); break;
		default: System.out.println("4. 입력한 수 : 1,2,3이 아닌 다른 수");
		}
		*/	
	}
}
