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
		System.out.println("�Ҽ����� �˻��մϴ�. ������ �Է��ϼ���.: ");
		int n1 = input.nextInt();
		System.out.println(quiz01.FindPrimeNumber(n1)?"�Ҽ��Դϴ�.":"�Ҽ��� �ƴմϴ�.");
		
		System.out.print("������ ���մϴ�. ������ �Է��ϼ���. : ");
		int n2 = input.nextInt();
		System.out.println("������ "+quiz01.getAbs(n2)+" �Դϴ�.");
	
		System.out.print("Ư�� �ڸ����� ���մϴ�. ������ �Է��ϼ���. : ");
		int n3 = input.nextInt();
		
		System.out.println(quiz01.getNumberOfUnits(n3));
		
		while(true) {
			System.out.println("1. ���� �ڸ��� 2. ���� �ڸ��� 3. ���� �ڸ��� 4. õ�� �ڸ��� 5.���� �ڸ��� 6. �ʸ��� �ڸ��� 7. �鸸�� �ڸ��� 8. ����" );
			System.out.print(">>>");
			int select = input.nextInt();
			switch(select) {
				case 1: System.out.println(quiz01.getNumberOfUnits(n3)==0?"���� ������ �Է��ϼ���.":quiz01.getNumberOfUnits(n3)); break;
				case 2: System.out.println(quiz01.getNumberOfTens(n3)!=0?quiz01.getNumberOfTens(n3):"�ʺ��� ū ������ �Է��ϼ���."); break;
				case 3: System.out.println(quiz01.getNumberOfHundreds(n3)!=0?quiz01.getNumberOfHundreds(n3):"�麸�� ū ������ �Է��ϼ���."); break;
				case 4: System.out.println(quiz01.getNumberOfThousands(n3)!=0?quiz01.getNumberOfTens(n3):"õ���� ū ������ �Է��ϼ���."); break;
				case 5: System.out.println(quiz01.getNumberOfTenTousands(n3)!=0?quiz01.getNumberOfTens(n3):"������ ū ������ �Է��ϼ���."); break;
				case 6: System.out.println(quiz01.getNumberOfHundredThousand(n3)!=0?quiz01.getNumberOfTens(n3):"�ʸ����� ū ������ �Է��ϼ���."); break;
				case 7: System.out.println(quiz01.getNumberOfMillions(n3)!=0?quiz01.getNumberOfTens(n3):"�鸸���� ū ������ �Է��ϼ���."); break;
				case 8: System.exit(0);
			}
		}
				
	}
}
