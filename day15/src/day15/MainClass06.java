package day15;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		System.out.println("���� �Է�");
		try {
			age = input.nextInt();
			if(age < 0) {
				throw new Exception("���� �߸� �Է� : "+age);
			}
			System.out.println("����� ���� : "+age);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���� ������ ����~");
	}
}
