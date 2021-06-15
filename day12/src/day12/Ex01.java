package day12;

public class Ex01 {
	public int a = 10;
	public void func() {
		int a = 12345;
		System.out.println("func() : "+a);
		System.out.println("this : "+this.a);
	}
	public void func02() {
		System.out.println("func02() : "+a);
	}
}
