package day05;

public class Quiz01 {

	public static void main(String[] args) {
		//1
		for(int i = 1; i<5; i++) {
			System.out.println(i +".hello");
		}
		
		//2
		int sum0 = 0; int i0 = 1;
		for(i0=1; i0<=100; i0++) {
			sum0 += i0;
			if(sum0 == 528) break;
		}
		System.out.println("i="+i0);
		
		//3
		int sum1 = 0; int i1 = 1;
		for(i1=1; i1<=25; i1++) {
			System.out.print(i1+"\t");
			if(i1%5==0) {System.out.print("\r");}
		}
	}
}
