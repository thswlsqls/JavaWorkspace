package day14;

public class MainClass03 {
class calc {
	public calc() {}
	public calc(String s) {
		System.out.println("부모 생성자를 실행합니다.");
	}
	public void operation() {
		System.out.println("계산기의 기능을 실행합니다.");
	}
}
class Computer extends calc{
		public Computer(String s) {
			super("값전달");
			System.out.println("자식 생성자를 실행합니다.");
		}
		public void print() {
			System.out.println("컴퓨터의 기능을 실행합니다.");
		}
}
	
	public static void main(String[] args) {
//		Computer c = new Computer("안녕하세요");
//		c.print();
//		c.operation();
	}

}
