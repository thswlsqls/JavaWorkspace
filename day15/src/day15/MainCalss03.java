package day15;

import java.util.Scanner;

public class MainCalss03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, result = 0;
		System.out.println("�� �Է�");
		x = input.nextInt();
		y = input.nextInt();
		
		try {
		result = x/y;
		System.out.println("��� : "+result);
		}catch(Exception e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			e.printStackTrace();
		}finally {
			System.out.println("������ ����Ǵ� �ڵ�");
		}
		System.out.println("���� ������ ����");
		System.out.println("���� ������ ����");
		System.out.println("���� ������ ����");
		System.out.println("���� ������ ����");
		System.out.println("���� ������ ����");
		
	}
}
