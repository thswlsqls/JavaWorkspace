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
			System.out.print("아이디 입력 : "); id = input.next();
			System.out.print("비밀번호 입력 : "); pw = input.next();
			System.out.println();
			if((id.equals(quiz01.getId()))&&(pw.equals(quiz01.getPw()))) {
				System.out.println("인증 통과");
			}else {
				System.out.println("인증 실패");
			}
		}else {
			System.out.println("가입을 먼저 진행해주세요.");
		}
	}
	
	public void Resister(String id, String pw, Scanner input, Quiz01 quiz01) {
		System.out.print("가입 id : "); id = input.next(); quiz01.setId(id);
		System.out.print("가입 pw : "); pw = input.next(); quiz01.setPw(pw);
		System.out.println("저장 완료");
	}
}
