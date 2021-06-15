package test;

import java.awt.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;


class Timer extends Thread{
	private Date date;
	private SimpleDateFormat simp;
	public void setDate() {
		date = new Date();
		simp = new SimpleDateFormat ("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
	}
	public String getDate() { return simp.format(date); }
}
class Window extends Timer{
	public void display() {
		Scanner input = new Scanner(System.in);
		int su;
		while(true) {
			System.out.println("====환영합니다====");
			System.out.println("1.계산기");
			System.out.println("2.메모장");
			System.out.println("3.off");
			System.out.print(">>>");
			su = input.nextInt();
			switch(su) {
			case 1: ProcessBuilder cl = new ProcessBuilder("calc");
			try {
				cl.start();
			} catch (IOException e) { }
			break;
			case 2: ProcessBuilder np = new ProcessBuilder("notepad");
			try {
				np.start();
			} catch (IOException e) { }
			break;
			case 3:System.out.println("프로그램 종료");
			System.exit(0);
			}
		}
	}
}
class Login extends Window{

}
class MyJframe extends Timer{
	JFrame frame;
	Container c;
	JLabel label;
	Font font;
	public MyJframe() {
		frame = new JFrame("Time");
		c = frame.getContentPane();
		label = new JLabel();
		font = new Font(null, 0, 32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		c.add(label);
		frame.setLocation(1000, 200);
		frame.setPreferredSize(new Dimension(500, 200));
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				super.setDate();
				label.setText(super.getDate());
			}catch(InterruptedException e) { }
		}
	}
}
class NewWindow extends Window{
	long beforetime;
	long aftertime;
	long diftime = (aftertime - beforetime);
	SimpleDateFormat dtsimp =
			new SimpleDateFormat ("hh시간 mm분 ss초 사용");
	public String getDtsimp() { return dtsimp.format(diftime); }
	public void display() {
		Scanner input = new Scanner(System.in);
		int su;
		while(true) {
			this.beforetime = System.currentTimeMillis();
			System.out.println("====환영합니다====");
			System.out.println("1.계산기");
			System.out.println("2.메모장");
			System.out.println("3.off");
			System.out.print(">>>");
			su = input.nextInt();
			switch(su) {
			case 1: ProcessBuilder cl = new ProcessBuilder("calc");
			try {
				cl.start();
			} catch (IOException e) { }
			break;
			case 2: ProcessBuilder np = new ProcessBuilder("notepad");
			try {
				np.start();
			} catch (IOException e) { }
			break;
			case 3:
				MyJframe2 mf2 = new MyJframe2();
				this.aftertime = System.currentTimeMillis();
				mf2.label.setText(getDtsimp());
				mf2.useTime();
				System.out.println("프로그램 종료");
				System.exit(0);;
			}
		}
	}
}
class MyJframe2 extends MyJframe{
	JFrame frame;
	Container c;
	JLabel label;
	Font font;
	public void useTime() {
		frame = new JFrame("UseTime");
		c = frame.getContentPane();
		label = new JLabel();
		font = new Font(null, 0, 32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		c.add(label);
		frame.setLocation(1000, 200);
		frame.setPreferredSize(new Dimension(500, 200));
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class TestClass {
	public static void main(String[] args) throws IOException {
		MyJframe mf = null;
		String sid=null, spw=null, id, pw;
		int su;
		boolean bool = true;
		Scanner input = new Scanner(System.in);
		NewWindow nw = new NewWindow();
		while(bool) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.로그아웃");
			System.out.print(">>>");
			su = input.nextInt();
			switch(su) {
			case 1: System.out.print("아이디 입력 : ");
			id = input.next();
			System.out.print("비밀번호 입력 : ");
			pw = input.next();
			if(sid.equals(id)) {
				if(spw.equals(pw)) {
					System.out.println("로그인 되었습니다.");
					bool = false;
					mf = new MyJframe();
					mf.setDaemon(true);
					mf.start();
					nw.display();
				}else {
					System.out.println("비밀번호가 다릅니다.");
				}
			}else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
			break;
			case 2: System.out.print("가입 할 아이디 입력 : ");
			sid = input.next();
			System.out.print("가입 할 비밀번호 입력 : ");
			spw = input.next();
			break;
			case 3: System.out.println("로그아웃 되었습니다.");
			break;
			}
		}
	}
}