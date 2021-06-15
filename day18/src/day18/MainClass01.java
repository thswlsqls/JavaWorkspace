package day18;

class Print{
	public void print(int a, int b) {
		System.out.println(a+" : "+b);
	}
	public void print(String a, String b) {
		System.out.println(a+" : "+b);
	}
}
class Print02<T>{
	public void print(T a, T b) {
		System.out.println(a+" : "+b);
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		Print p = new Print();
		p.print(10, 20);
		p.print("문자열", "안녕하세요");
		
		Print02<Integer> pp = new Print02();
		pp.print(10,20);
		Print02<String> pp1 = new Print02();
		pp1.print("10","20");
	}
}









