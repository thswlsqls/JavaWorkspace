package day23;

class Test{
	public String toString(){
		return "���� ���� toString ����";
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t);
		System.out.println(t.toString());
		
		String s = "test";
		System.out.println(s);
		System.out.println(s.toString());
	}
}

