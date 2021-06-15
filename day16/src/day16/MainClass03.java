package day16;


class AAA{
	int num;
}
public class MainClass03 {
	public static void main(String[] args) {
		AAA a = new AAA();
		a.num = 12345;
		AAA b = a; //new AAA();
		
		System.out.println("a : "+a);
		System.out.println("a.num : "+a.num);
		System.out.println("b : "+a);
		System.out.println("b.num : "+b.num);
		
	}
}
