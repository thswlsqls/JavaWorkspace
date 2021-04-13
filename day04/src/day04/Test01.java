package day04;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		/*
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num % 3 == 0) {
			System.out.println("입력하신 수는 3의 배수 입니다.");
		}
		else {
			System.out.println("입력하신 수는 3의 배수가 아닙니다.");
		}
		System.out.println("다음 문장을 실행합니다.");
		}
	}
	*/
	/*
	Scanner input = new Scanner(System.in);
	int su1, su2, max, min;
	System.out.print("점수 두 개 입력 : ");
	su1 = input.nextInt();
	su2 = input.nextInt();
	*/
	
	/*
	Scanner input = new Scanner(System.in);
	System.out.println("5의 배수인지 검사합니다. 수 입력: ");
	int num0 = input.nextInt();
	System.out.println(num0%5==0?"5의 배수입니다.":"5의 배수가 아닙니다.");
	
	System.out.println("0보다 크고 100보다 작은지 검사합니다. 수 입력: ");
	int num1 = input.nextInt();
	System.out.println((num1>0)&&(num1<100)?"정상":"비정상");
	
	System.out.println("짝수이면서 3의 배수인지 검사합니다. 수 입력: ");
	int num2 = input.nextInt();
	System.out.println((num2%2==0)&&(num2%3==0)?"짝수이면서 3의 배수입니다.":"짝수이면서 3의 배수가 아닙니다.");
	*/
	/*	
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		if(num>100) {
			System.out.println(num+" : 100보다 크다");
		}else if(num>50) {
			System.out.println(num+" : 50보다 크다.");
		}else {
			System.out.println(num+" : 50보다 작은 값들");
		}
	*/	
	
	Scanner input = new Scanner(System.in);
	System.out.println("커피의 개수를 입력하세요.: ");
	int count = input.nextInt();
	System.out.println(count>10?"총 금액: "+ (10*2000+(count-10)*1500):"총 금액 :"+ (count*2000));
		
	System.out.println("usb의 개수를 입력하세요.: ");
	int count0 = input.nextInt();
	System.out.println(count0>100?"총 금액: "+ (count0*5000*0.88):"총 금액 :"+ ((count0>10)?count0*5000*0.9:count0*5000));
	
	/*
	나이를 입력받아서 성인과 미성년자로 구분한다.
	성인인 경우에 20~39세라면 청년, 이 이상이면 중장년으로 구분한다.
	미성년인 경우에는 14~19세는 청소년, 14세 미만은 어린이로 분리한다.
	*/
	System.out.println("나이를 입력하세요.: ");
	int age1 = input.nextInt();
	System.out.println(age1>39?"중장년":(age1>19?"청년":(age1>13?"청소년":"어린이")));
	
	//2
	System.out.println("점수를 입력하세요.: ");
	int score = input.nextInt();
	System.out.println(score>=90?"A":(score>=80?"B":score>=70?"C":score>=60?"D":"F"));
	
	//3
	System.out.println("연도를 입력하세요. : ");
	int year = input.nextInt();
	System.out.println((year%4==0&&year%100!=0)||year%400==0?"1(윤년입니다.)":"0(윤년이 아닙니다.)");
	
	//4
	System.out.println("세 정수를 입력하세요. : ");
	int n0= input.nextInt();
	int n1= input.nextInt();
	int n2= input.nextInt();
		
	System.out.println("최소값: " + (n0<=n1&&n1<=n2?n0:(n0<=n2?n0:n2)) + " 최대값: " + 
	(n0>=n1&&n1>=n2?n0:(n0>=n2?n0:n2)) + " 합계: " + (n0+n1+n2) + " 평균: " + ((n0+n1+n2)/3)); 
	
	}
}

