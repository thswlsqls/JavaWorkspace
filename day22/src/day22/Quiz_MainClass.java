package day22;

import java.util.Scanner;

public class Quiz_MainClass {
	public static void main(String[] args) {
		saveUser save = new saveUser();
		showUser show = new showUser();
		showThisEvents te = new showThisEvents();
		showAllEvents ae = new showAllEvents();
		
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("1.ȸ�� ���� ���\r2.ȸ���� ���� ���\r3.�̴��� �̺�Ʈ ����\r4.��ü �̺�Ʈ ����\r5.����");
			System.out.print(">>> ");
			int n = input.nextInt();
			switch(n) {
				case 1: save.saveUser(); break;
				case 2:	show.showUser(); break;
				case 3:	te.showThisEvents(); break;
				case 4:	ae.showAllEvents(); break;
				case 5: System.out.println("�����մϴ�."); System.exit(0);
			}
		}
	}
}
