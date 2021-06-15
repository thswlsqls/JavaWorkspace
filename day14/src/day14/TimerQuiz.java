package day14;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimerQuiz {
	private Date date;
	private SimpleDateFormat simple;
	
	public TimerQuiz(SimpleDateFormat simple, Date date) {this.simple = simple; this.date = date; }			
	
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	public void setSimpleDateFormat(SimpleDateFormat simple) {
		this.simple = simple;
	}
	public SimpleDateFormat getSimple() {
		return simple;
	}
	
	
	public void tentimer() throws Exception {
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		
		for(int i=0; i<10; i++) {
			Thread.sleep(1000);
			
			Date date = new Date();
			
			this.setDate(date);
			this.setSimpleDateFormat(simple);
			String result = this.getSimple().format(this.getDate());
			System.out.println(this.getSimple().format(this.getDate()));
		}
		//System.exit(0);
	}
	
	public void computer() throws IOException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("===== 환 영 합 니 다 =====");
		while(true) {
			System.out.println("1.기 능");
			System.out.println("2.off");
			System.out.print("입력 >>>>");
			int select = input.nextInt();
			switch(select) {
				case 1:{
					System.out.println("사용 가능 기능");
					System.out.println("1 : 메모장");
					System.out.println("2 : 계산기");
					System.out.print("사용할 기능 입력 : ");
					String function = input.next();
					switch(function) {
						case "메모장":{
							ProcessBuilder pb = new ProcessBuilder("notepad"); //윈도우에서 실행가능한 명령어를 넣어준다.
							pb.start();
						}break;
						case "계산기":{
							ProcessBuilder pb = new ProcessBuilder("calc"); //윈도우에서 실행가능한 명령어를 넣어준다.
							pb.start();	
						}break;
						default : {
							System.out.println("없는 기능 입니다.");
						}break;
					}
				}break;
				case 2: {
					System.out.println("종료합니다.");
					System.exit(0);
				}
			}
		}
	}
	
	
}
