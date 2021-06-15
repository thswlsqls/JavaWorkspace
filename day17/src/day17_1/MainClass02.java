package day17_1;
interface TestInterface{
	public void test();
	public void abc();
}
class AAA{ 
	public void print() {
		System.out.println("출력");
	}
}
class TestClass extends AAA implements TestInterface{
	public void test() {
		print();
	}
	
	public void abc() {
		
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		
	}
}
