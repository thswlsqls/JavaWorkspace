package day12;

import java.util.Scanner;

public class Quiz01 {

	private String id;
	private String pw;
	
	public void setId(String id) { this.id = id; }
	public String getId() { return id; }
	
	public void setPw(String pw) { this.pw = pw; }
	public String getPw() { return pw; }

	public void Login(String id, String pw, Scanner input, Quiz01 quiz01) {	
		if(quiz01.id!=null) {
			System.out.print("���̵� �Է� : "); id = input.next();
			System.out.print("��й�ȣ �Է� : "); pw = input.next();
			System.out.println();
			if((id.equals(quiz01.getId()))&&(pw.equals(quiz01.getPw()))) {
				System.out.println("���� ���");
			}else {
				System.out.println("���� ����");
			}
		}else {
			System.out.println("������ ���� �������ּ���.");
		}
	}
	
	public void Resister(String id, String pw, Scanner input, Quiz01 quiz01) {
		System.out.print("���� id : "); id = input.next(); quiz01.setId(id);
		System.out.print("���� pw : "); pw = input.next(); quiz01.setPw(pw);
		System.out.println("���� �Ϸ�");
	}
}
