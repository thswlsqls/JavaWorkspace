package day15;

public class MainClass04 {
	public static void main(String[] args) {
		
		int [] arr = {1,2,3};
		int n1 = 10, n2 = 0, result = 0;
		int a = 0;
		try {
			a = n1 /n2;
			for(int i = 0; i<5; i++) {	
				System.out.println(arr[i]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("무조건 실행되는 코드");
		}
		a = 1234;
		System.out.println("다음 문장들");
	}
}
