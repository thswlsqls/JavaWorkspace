package day15;

import java.io.IOException;
class AAA{
	public void t01() throws InterruptedException {
		Thread.sleep(0);
	}
	public void t02() throws InterruptedException {
		t01();
	}
}
public class MainClass05 {
	public static void main(String[] args) throws InterruptedException, IOException{
		AAA a = new AAA();
		a.t02();
		
	}
}
