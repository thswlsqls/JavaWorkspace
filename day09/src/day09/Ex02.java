package day09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		
//		for(int i=0; i<5; i++) {
//			System.out.println(Math.random()*3);
//		}
//		
//		for(int i=0; i<5; i++) {
//			System.out.println((int)(Math.random()*3));
//		}
		
		for(int i=0; i<5; i++) {
			System.out.println((int)(Math.random()*5));
		}
		
		
		LinkedHashMap<String, String> Items = new LinkedHashMap<String, String>();
		ArrayList<String> ItemKey = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		
		Items.put("������ ��", "������ ���� ȹ���Ͽ����ϴ�.");
		Items.put("����� �̽�", "��ſ��� ����� �������ϴ�.");
		Items.put("��", "���̾� ��~");
		Items.put("��ø�� �Ź�", "��ø�� �Ź��� ȹ���Ͽ����ϴ�.");
		Items.put("��ȭ�ָӴ�", "200��ȭ�� ȹ�� �Ͽ����ϴ�.");
		
		for(String item : Items.keySet()) {
			ItemKey.add(item);
		}
		
		int index = 0;
		while(true) {
			System.out.println("1.������ ȹ��");
			System.out.println("2.����");
			System.out.print(">>>> : "); int select = input.nextInt();
			switch (select) {
				case 1: {
					index = (int)(Math.random()*(ItemKey.size()));
					System.out.println(ItemKey.get(index)+" : "+Items.get(ItemKey.get(index)));
				}break;
				case 2: {
					System.out.println("�����մϴ�.");
				}System.exit(0);
			}
		}
		
		/*
		LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
		int number = (int)(Math.random()*45)+1;
		System.out.println(Lotto.getnumbers(numbers, number));
		 */
	}		
}		

