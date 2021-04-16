package day05;

public class Quiz02 {

	public static void main(String[] args) {
		//4
		int sum2 = 1; int i2 = 1;
		for(i2 = 1; i2<30; i2++) {
			sum2 *=2;
		}
		System.out.println("sum2: "+sum2);
		
		//5
		int sum3 = 0; int i3 = 1;
		for(i3 = 1; i3<=1000; i3++) {
			sum3  = i3%15==0?sum3+i3:i3%3==0?sum3:sum3+i3;
		}
		System.out.println("sum3: "+sum3);
		
		//6
		int sum4 = 0; int i4 = 1;
		for(i4 = 1; ; i4++) {
			if(sum4>=10000) break;
			if(i4%2==1) sum4 += i4;
		}
		System.out.println("i4: " + i4);
		
		
		
	}
}


