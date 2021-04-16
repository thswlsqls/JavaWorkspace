package day05;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		/*
		int i, j;
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
			System.out.print(i*j+"\t");
			}
			System.out.print("\r");
		}
		
		
		int i0, j0;
		for(i0=0; i0<=4; i0++) {
			for(j0=1; j0<=5; j0++) {
			System.out.print(i0*5 + j0 +"\t");
			}
			System.out.print("\r");
		}

		/*
		 
		1. 단일 for문 문제
		5부터 1까지 1씩 감소하는 카운트다운 문장을 출력하기 
		카운트다운을 시작합니다.
		5
		4
	    3
	    2
	    1
		
		2. 이중 for문 문제
		오른쪽으로 기운 5층의 별탑을 출력하기
		 	*
		   **
		  ***
		 ****
		*****
		
		*/
		/*
		1. 단일 for 문제
		-> for문을 이용하여 알파벳 A ~ Z 까지 출력하세요
		*/
		for(int i = 65; i<=90; i++) {
			System.out.print((char)i+" ");
		}
		
		/*
		2. 이중 for 문제
		-> 이중 for문을 이용해서 다음처럼 별 출력하세요 
		 **
		  **
		   **
		    **
		     **
		*/
		for(int j = 0; j<5; j++) {
			for(int k = 0; k<j; k++){
				System.out.print(" ");
			}
			System.out.println("**");
		}
		
		/*
		for문 문제 두개입니다.
		#1 단일 for문 문제
		1부터 100까지 숫자 중 짝수만 출력하는 코드 작성하기 
		*/
		
		for(int i0 = 1; i0<=100; i0++) {
			if(i0%2==0) System.out.print(i0+" ");
		}
		
		/*		 
		#2 이중 for문 문제
		첫 번째 줄에는 * 하나를, 
		두 번째 줄에는 * 두 개를 출력하고 
		세 번째 줄에는 * 세 개를 출력하는 것을 반복하여 
		총 다섯 층의 별 탑을 출력하기
		*/
		for(int j0 = 0; j0<=5; j0++) {
			for(int k0 = 0; k0<j0; k0++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		1. 단일 for문 문제
		1~100까지 3의 배수를 출력하고,
		출력된 3의 배수의 합을 출력하는 코드 작성
		*/
		int sum = 0;
		for(int i1=0; i1<=100; i1++) {
			if(i1%3==0) System.out.print(i1+" ");
			sum += i1;
		}
		System.out.println(sum);
		
		/*
		2. 이중 for문 문제
		입력 받은 숫자로 숫자 계단을 출력하는 코드를 작성하세요.
		ex)몇 단계 계단으로 구성할까요 ? 5
		   1
		   2 3 
		   4 5 6
		   7 8 9 10
		   11 12 13 14 15
		*/
		System.out.println("수를 입력하세요.: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); int pn = 0; int j1 = 0;
		for(j1=0; ; j1++) {
			for(int k1=0; k1<j1; k1++) {
				System.out.print(++pn +" ");
			}
			if(pn==n) break; System.out.println();
		}
		System.out.println("\n총 "+ j1 +"단계입니다.");
		
		
		/*
		1. 단일 for문 문제
		사용자로부터 숫자 한 개를 입력받아 1부터 그 숫자까지의 합을 구하시오.
		ex) 입력 값 : 5 출력 : 15 */
		Scanner input0 = new Scanner(System.in);
		System.out.println("입력 값 : ");
		int n0 = input.nextInt();
		int sum1 = 0;
		for(int i2=1; i2<=n0; i2++) {
			sum1 += i2;
		}
		System.out.println(sum1);
		/*  2. 이중 for문 문제
		사용자로부터 숫자를 입력받아 그 숫자까지의 구구단을 작성하시오.
		ex) 입력 값 : 3
		    출력 : 1 * 1 : 1
	             1 * 2 : 2
	             1 * 3 : 3
	             2 * 1 : 2
	             2 * 2 : 4
	             2 * 3 : 6
	             3 * 1 : 3
	             3 * 2 : 6
	             3 * 3 : 9  */
		System.out.println("입력 값 : ");
		int n1 = input.nextInt();
		for(int j2=1; j2<=n1; j2++) {
			for(int k2=1; k2<=n1; k2++) {
				System.out.println(j2+" * "+k2+" : "+j2*k2);
			}
		}
		input.close();
	}
	
	

}
