package day14;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Login extends TimerQuiz{

	Date date = new Date();
	SimpleDateFormat simple = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
	
	public Login(SimpleDateFormat simple, Date date) { super(simple,date); }
	
	
	private String id;
	private String pw;
	
	private boolean isAuth = false; 
	
	public void setIsAuth(boolean isAuth) {
		this.isAuth = isAuth;
	}
	
	public void setId(String id) { this.id = id; }
	public String getId() { return id; }
	
	public void setPw(String pw) { this.pw = pw; }
	public String getPw() { return pw; }

	public void Login(String id, String pw, Scanner input) {	
		if(this.id!=null) {
			System.out.print("���̵� �Է� : "); id = input.next();
			System.out.print("��й�ȣ �Է� : "); pw = input.next();
			System.out.println();
			if((id.equals(getId()))&&(pw.equals(getPw()))) {
				System.out.println("���� ���");
				SimpleDateFormat simple = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
				Date date = new Date();
				isAuth = true;
			}else {
				System.out.println("���� ����");
			}
		}else {
			System.out.println("������ ���� �������ּ���.");
		}
	}
	
	public void Resister(String id, String pw, Scanner input) {
		System.out.print("���� id : "); id = input.next(); setId(id);
		System.out.print("���� pw : "); pw = input.next(); setPw(pw);
		System.out.println("���� �Ϸ�");
	}
	
	public void LoginProgram() {
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		
		Scanner input = new Scanner(System.in);
		
		String id=null;
		String pw=null;
		
		while(!isAuth) {
			System.out.println("1.�α��� 2.���� 3.�α׾ƿ�");
			System.out.print(">>>");
			int select = input.nextInt();
			switch(select) {
				case 1:{
					Login(id, pw, input);
				}break;
				case 2:{
					Resister(id, pw, input);
				}break;
				case 3: System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			}
		}
	}
}

