package day14;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Login extends TimerQuiz{

	Date date = new Date();
	SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
	
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
			System.out.print("아이디 입력 : "); id = input.next();
			System.out.print("비밀번호 입력 : "); pw = input.next();
			System.out.println();
			if((id.equals(getId()))&&(pw.equals(getPw()))) {
				System.out.println("인증 통과");
				SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
				Date date = new Date();
				isAuth = true;
			}else {
				System.out.println("인증 실패");
			}
		}else {
			System.out.println("가입을 먼저 진행해주세요.");
		}
	}
	
	public void Resister(String id, String pw, Scanner input) {
		System.out.print("가입 id : "); id = input.next(); setId(id);
		System.out.print("가입 pw : "); pw = input.next(); setPw(pw);
		System.out.println("저장 완료");
	}
	
	public void LoginProgram() {
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		
		Scanner input = new Scanner(System.in);
		
		String id=null;
		String pw=null;
		
		while(!isAuth) {
			System.out.println("1.로그인 2.가입 3.로그아웃");
			System.out.print(">>>");
			int select = input.nextInt();
			switch(select) {
				case 1:{
					Login(id, pw, input);
				}break;
				case 2:{
					Resister(id, pw, input);
				}break;
				case 3: System.out.println("로그아웃 되었습니다.");
			}
		}
	}
}

