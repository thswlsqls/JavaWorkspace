package day22;

class A {
	public void test() {
		System.out.println("AŬ������ test�޼���");
	}
	protected void a(int a) {
		
	}
}

class B extends A {
	public void test() {
		System.out.println("BŬ������ test�޼���");
	}
	protected void a(int a) {
		System.out.println("BŬ������ a�޼���");
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		B b = new B();
		b.test();
		A a = new B();
		a.test();
	}
}
