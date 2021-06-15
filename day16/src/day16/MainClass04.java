package day16;
class Test extends Thread{
	A a;
	Test(A a){ this.a = a; }
	public void run() { a.test(); }
}
class A{
	int sum = 1;
	public synchronized void test() {
		for(int i=1; i<10; i++) {
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+" : sum : "+sum);
			sum+=i;
		}
	}
}


public class MainClass04 {
	public static void main(String[] args) {
		A a = new A();
		Test b = new Test(a);
		Test c = new Test(a);	Test e = new Test(a);
		Test d = new Test(a);	Test f = new Test(a);
		b.start(); c.start(); d.start(); e.start(); f.start();
	}
}
