package day16;import java.util.Scanner;

class A02 extends Thread{
	public void run() {
		for(;;) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("A01 ½ÇÇà Áß...");
		}
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("test");
		A02 a = new A02();
		a.setDaemon(true);
		a.start();
		
		while(true) {		
			String s = new Scanner(System.in).next();
			System.out.println("sss => "+s);
			if(s.equals("exit")) {
				break;
			}
		}
	}

}






