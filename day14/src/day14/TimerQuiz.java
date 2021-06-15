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
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		
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
		System.out.println("===== ȯ �� �� �� �� =====");
		while(true) {
			System.out.println("1.�� ��");
			System.out.println("2.off");
			System.out.print("�Է� >>>>");
			int select = input.nextInt();
			switch(select) {
				case 1:{
					System.out.println("��� ���� ���");
					System.out.println("1 : �޸���");
					System.out.println("2 : ����");
					System.out.print("����� ��� �Է� : ");
					String function = input.next();
					switch(function) {
						case "�޸���":{
							ProcessBuilder pb = new ProcessBuilder("notepad"); //�����쿡�� ���డ���� ��ɾ �־��ش�.
							pb.start();
						}break;
						case "����":{
							ProcessBuilder pb = new ProcessBuilder("calc"); //�����쿡�� ���డ���� ��ɾ �־��ش�.
							pb.start();	
						}break;
						default : {
							System.out.println("���� ��� �Դϴ�.");
						}break;
					}
				}break;
				case 2: {
					System.out.println("�����մϴ�.");
					System.exit(0);
				}
			}
		}
	}
	
	
}
