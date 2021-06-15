package day11;

import java.util.Scanner;

public class Quiz01 {
	
	public static int count=101;
	public int GetNumber(int cn) {
		Scanner input = new Scanner(System.in);
		cn = (int)(Math.random()*100+1);
		System.out.println("ÄÄÇ»ÅÍ ¼ýÀÚ : "+cn);
		
		return cn;
	}
	
	public void CheckTheRecord(int count) {
		if(this.count>count) {
			this.count=count;
			System.out.println("ÃÖ°í ±â·ÏÀ» °»½ÅÇß½À´Ï´Ù.");
		}
	}
	
	public int PrintUpDown(int cn, int un, int count) {
		count = 0;
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("Input Number --> ");
			un = input.nextInt();
			if(cn>un) {
				System.out.println("=== U  P ===");
				count++;
			}
			else if(cn<un) {
				System.out.println("=== DOWN ===");
				count++;
			}
			else {
				System.out.println(++count + "È¸ ¸¸¿¡ ¸Â­Ÿ½À´Ï´Ù."); break; 
			}
		}
		return count;
	}
	
	public void PrintTheRecord() {
		System.out.println("ÃÖ°í Á¡¼ö´Â "+this.count+"È¸ ÀÔ´Ï´Ù.");
	}
}
