package day12;

public class MainClass02 {
	public static void main(String[] args) {
		Ex02 ex02 = new Ex02();
		//ex02.num = 12345;
		int n = 1234;
		ex02.setNum(n);
		ex02.func();
		
		System.out.println("num : "+ex02.getNum());
	}
}
