package day10;

import java.util.Scanner;

public class Ex05 {
	public void reverse() {
		Scanner input = new Scanner(System.in);
		int su = 0, temp = 0;
		System.out.println("¼ö ÀÔ·Â : ");
		su = input.nextInt();
		while(true) {
			temp = su%10;
			su = su/10;
			System.out.println(temp+",");
			if(su == 0) break;
		}
	}
}
