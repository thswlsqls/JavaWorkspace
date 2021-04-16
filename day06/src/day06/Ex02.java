package day06;

import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		/*
			�Աݾװ� ��ݾ��� �Է¹޾� ���� �ܾ�ȯ�� �� �����ϱ�
			ex)
			1.�Ա�   2.���   3.�����ܾ�Ȯ��   4.����
			1
			�Ա��� �ݾ� �Է� : 1000
			1.�Ա�   2.���   3.�����ܾ�Ȯ��   4.����
			2
			����� �ݾ� �Է� : 2000
			1.�Ա�   2.���   3.�����ܾ�Ȯ��   4.����
			3
			���� �ܾ� : -1000
			1.�Ա�   2.���   3.�����ܾ�Ȯ��   4.����
			4
			�����մϴ�.
		*/
		int totalmoney = 0;
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("1.�Ա�\t2.���\t3.�����ܾ�Ȯ��\t4.����");
			int s = input.nextInt();
		    int inmoney; int outmoney;
			switch(s) {
				case 1: System.out.print("�Ա��� �ݾ� �Է�: "); inmoney = input.nextInt(); totalmoney += inmoney; break;
				case 2: System.out.print("����� �ݾ� �Է�: "); outmoney = input.nextInt(); totalmoney -= outmoney; break;
				case 3: System.out.println("���� �ܾ� : "+totalmoney); break;
				case 4: System.out.println("�����մϴ�."); 
				System.exit(0);
			}
		}
		
		
		
		
		
		
		
		
		
	
   /*
	Scanner input = new Scanner(System.in);
	while(true) {
		System.out.println("1.�ȱ� 2.���߱��� 3.�ڵ��� 4.���� : ");
		int select = System.in.read() - 48;
		input.nextLine();
		switch(select) {
			case 1: System.out.println("�ȱ�"); break;
			case 2: System.out.println("���߱���"); break;
			case 3: System.out.println("�ڵ���"); break;
			case 4: System.out.println("���α׷� ����"); 
			System.exit(0);
		}
	*/
	/*
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.println("ù��° ���ڿ� �Է� : ");
		n1 = input.next();
		System.out.println("�ι�° ���ڿ� �Է� : ");
		n2 = input.next();
		System.out.println("n1 ����"+n1.length());
		System.out.println("n2 ����"+n2.length());
		
		System.out.println("n1==n2 : "+(n1 == n2));
		System.out.println("n1.equals(n2) : "+n1.equals(n2));
	*/
		/*
		String id_s = "user"; String pw_s = "password";		
		//Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("1.�α��� 2.ȸ������ 3.���� : ");
			int select = System.in.read() - 48;
			String id_i,pw_i;
			int check = 0;
			input.nextLine();
			switch(select) {
				case 1: 
				{
					System.out.print("id: "); id_i = input.nextLine(); System.out.print("pw: ");pw_i = input.nextLine();
					boolean flag = id_s.equals(id_i)&&pw_s.equals(pw_i)?true:false;
					if(flag) System.out.println("���� ���");
					if(!id_s.equals(id_i)) System.out.println("�������� �ʴ� ȸ���Դϴ�.");
					if(!pw_s.equals(pw_i)) System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				} break;
				case 2: 
				{
					System.out.print("id: "); id_s = input.nextLine(); System.out.print("pw: ");pw_s = input.nextLine();
					System.out.println("����Ǿ����ϴ�.");
				} break;
				case 3: System.out.println("�����մϴ�."); break;
			} 

			int money = 0;
			System.out.print("����� ���� �ϼ��� >>> "); money = input.nextInt();
			while(true) {
				System.out.println("=========Ŀ�� ���Ǳ�=========\n");
				System.out.println("1. Ŀ��(200)\t2. ���ھ�(250)\t3. ��ȯ\t4. ����");
				System.out.print("�޴��� �����ϼ��� >>> "); int menu = input.nextInt();
				switch(menu) {
					case 1: if(money>=200) {money-=200; System.out.println("���ְ� �弼��.");} else {System.out.println("�ݾ��� �����մϴ�.");} break;
					case 2: if(money>=250) {money-=250; System.out.println("���ְ� �弼��.");} else {System.out.println("�ݾ��� �����մϴ�.");} break;
					case 3: System.out.println("�Ž����� : "+money); break;
					case 4: System.out.println("���α׷� ����!!!");
					System.exit(0);	
				}
			}
			*/
		}
	}



