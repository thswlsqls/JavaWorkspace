package day14;
class Super{
	protected int num;
	public Super() {
		num = 1234;
	}
	public void test() {
		System.out.println("�θ� test �Դϴ�.");
	}
}
class Child extends Super{
	private int su;
	private int num = 3333;
	public Child() {
		su = 8888;
	}
	public void test() {
		System.out.println("�ڽ� test �Դϴ�.");
	}
	public void display() {
		this.test();
		super.test();
		System.out.println("num : "+num);
		System.out.println("num : "+super.num);
		System.out.println("su : "+su);
	}
	
}
public class MainClass04 {
	public static void main(String[] args) {
		Child child = new Child();
		child.display();
	}
}
