package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		while(true) {
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("���� ���α׷� �Դϴ�.");
				System.out.print("���� ���� 6�� �Է� : "); int birth = input.nextInt();
				if(birth>900000) {
					System.out.println("���� �Ұ�");
				}else if(birth<100000) {
					System.out.println("���̰� Ʋ�Ƚ��ϴ�.");
				}else {
					System.out.println("���� ����");
				}
			}catch(InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ���.");
			}
		}
		
	}
}

