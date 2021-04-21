package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClassQuiz01 {
	public static void main(String[] args) {
		Quiz01 quiz01 = new Quiz01();
		int n=0;
		System.out.println(quiz01.FindEven(n));
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			numbers.add((int)(Math.random()*100+1));
		}
		System.out.println(numbers);
		quiz01.FindMultipleOfThree(numbers);
		
		Scanner input = new Scanner(System.in);
		System.out.println("소수인지 검사합니다. 정수를 입력하세요.: ");
		int n1 = input.nextInt();
		System.out.println(quiz01.FindPrimeNumber(n1)?"소수입니다.":"소수가 아닙니다.");
		
		System.out.print("절댓값을 구합니다. 정수를 입력하세요. : ");
		int n2 = input.nextInt();
		System.out.println("절댓값은 "+quiz01.getAbs(n2)+" 입니다.");
	
		System.out.print("특정 자리수를 구합니다. 정수를 입력하세요. : ");
		int n3 = input.nextInt();
		
		System.out.println(quiz01.getNumberOfUnits(n3));
		
		while(true) {
			System.out.println("1. 일의 자리수 2. 십의 자리수 3. 백의 자리수 4. 천의 자리수 5.만의 자리수 6. 십만의 자리수 7. 백만의 자리수 8. 종료" );
			System.out.print(">>>");
			int select = input.nextInt();
			switch(select) {
				case 1: System.out.println(quiz01.getNumberOfUnits(n3)==0?"양의 정수를 입력하세요.":quiz01.getNumberOfUnits(n3)); break;
				case 2: System.out.println(quiz01.getNumberOfTens(n3)!=0?quiz01.getNumberOfTens(n3):"십보다 큰 정수를 입력하세요."); break;
				case 3: System.out.println(quiz01.getNumberOfHundreds(n3)!=0?quiz01.getNumberOfHundreds(n3):"백보다 큰 정수를 입력하세요."); break;
				case 4: System.out.println(quiz01.getNumberOfThousands(n3)!=0?quiz01.getNumberOfTens(n3):"천보다 큰 정수를 입력하세요."); break;
				case 5: System.out.println(quiz01.getNumberOfTenTousands(n3)!=0?quiz01.getNumberOfTens(n3):"만보다 큰 정수를 입력하세요."); break;
				case 6: System.out.println(quiz01.getNumberOfHundredThousand(n3)!=0?quiz01.getNumberOfTens(n3):"십만보다 큰 정수를 입력하세요."); break;
				case 7: System.out.println(quiz01.getNumberOfMillions(n3)!=0?quiz01.getNumberOfTens(n3):"백만보다 큰 정수를 입력하세요."); break;
				case 8: System.exit(0);
			}
		}
				
	}
}
