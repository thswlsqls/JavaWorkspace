package day14;

public class MainClass03 {
class calc {
	public calc() {}
	public calc(String s) {
		System.out.println("�θ� �����ڸ� �����մϴ�.");
	}
	public void operation() {
		System.out.println("������ ����� �����մϴ�.");
	}
}
class Computer extends calc{
		public Computer(String s) {
			super("������");
			System.out.println("�ڽ� �����ڸ� �����մϴ�.");
		}
		public void print() {
			System.out.println("��ǻ���� ����� �����մϴ�.");
		}
}
	
	public static void main(String[] args) {
//		Computer c = new Computer("�ȳ��ϼ���");
//		c.print();
//		c.operation();
	}

}
