package day13;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("��ɾ� �Է� : ");
		String s = input.next();
		ProcessBuilder pb = new ProcessBuilder(s); //�����쿡�� ���డ���� ��ɾ �־��ش�.
		pb.start();
		
		/*
		for(int i=0; i<10; i++) {
			Thread.sleep(1000);
			System.out.println(i+". ����");
		}
		*/
	}

}
