package day16;
class A01 extends Thread{
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("A01 => " +i);
		}
	}
}
class B01 extends Thread{
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("B01 => " +i);
		}
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		A01 a = new A01();
		B01 b = new B01();
		//a.run();
		//b.run();
		a.setDaemon(true); //스레드를 종료할 때, 관련된 스레드들을 함께 종료한다.
		b.setDaemon(true);
		a.start();
		b.start();
		System.out.println("main 종료!!!");
		System.out.println("main 종료!!!");
		System.out.println("main 종료!!!");
		System.out.println("main 종료!!!");
		System.out.println("main 종료!!!");
	}
}
