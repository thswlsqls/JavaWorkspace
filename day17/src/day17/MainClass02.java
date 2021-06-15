package day17;

import java.util.ArrayList;

class A{
	public final void test() {
		System.out.println("부모입니다");
	}
	protected void a(int a) {
		
	}
}
class B extends A{
	protected void a(int a) {
		
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		B b = new B();
		b.test();
	
	}
}
