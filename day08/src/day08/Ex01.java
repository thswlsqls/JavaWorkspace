package day08;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList name = new ArrayList();
		ArrayList phNum = new ArrayList();
		String userName, userPhNum;
		int num;
		while(true) {
			System.out.println("1.����ó ���");
			System.out.println("2.����ó ����");
			System.out.println("3.����ó ����");
			System.out.println("4.��� ����ó");
			System.out.println("5.����");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("������ �̸� : ");
				userName= input.next();
				System.out.print("������ ��ȭ��ȣ : ");
				userPhNum= input.next();
				if(name.contains(userName)||phNum.contains(userPhNum)) {
					System.out.println("�̹� ����Ǿ� �ֽ��ϴ�.");
				}else {
					name.add(userName);
					phNum.add(userPhNum);
					System.out.println("����Ǿ����ϴ�.");
				}break;
			case 2:
				if(name.size()==0) {
					System.out.println("����� ����� �����ϴ�.");
				}else {
					System.out.print("ã�� �̸� : ");
					userName = input.next();
					int re = name.indexOf(userName);
					if(re == -1) {
						System.out.println("�ش� ����ڴ� �������� �ʽ��ϴ�.");	
					}else {
						System.out.println("�̸� :\t"+name.get(re));
						System.out.println("��ȭ��ȣ :\t"+phNum.get(re));
					}
				}break;
			case 3:
				if(name.size()==0) {
					System.out.println("����� ����� �����ϴ�.");
				}else {
					System.out.println("������ �̸� : ");
					userName = input.next();
					int re = name.indexOf(userName);
					if(re==-1) {
						System.out.println("�������� �ʽ��ϴ�.");
					}else {
						name.remove(re);
						phNum.remove(re);
						System.out.println("�����Ǿ����ϴ�.");
					}
				}break;
			case 4:
				if(name.size()==0) {
					System.out.println("����� ����� �����ϴ�.");
				}else {
					for(int i=0; i<name.size(); i++) {
						System.out.println("�̸� :\t"+name.get(i));
						System.out.println("��ȭ��ȣ :\t"+phNum.get(i));
						System.out.println("===================");
					}
				}break;
			case 5:
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
		}	
	}
}
