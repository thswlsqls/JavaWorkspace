package day22;

class A {
	public void test() {
		System.out.println("A클래스의 test메서드");
	}
	protected void a(int a) {
		
	}
}

class B extends A {
	public void test() {
		System.out.println("B클래스의 test메서드");
	}
	protected void a(int a) {
		System.out.println("B클래스의 a메서드");
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
