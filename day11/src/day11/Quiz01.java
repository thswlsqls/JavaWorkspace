package day11;

import java.util.Scanner;

public class Quiz01 {
	
	public static int count=101;
	public int GetNumber(int cn) {
		Scanner input = new Scanner(System.in);
		cn = (int)(Math.random()*100+1);
		System.out.println("컴퓨터 숫자 : "+cn);
		
		return cn;
	}
	
	public void CheckTheRecord(int count) {
		if(this.count>count) {
			this.count=count;
			System.out.println("최고 기록을 갱신했습니다.");
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
				System.out.println(++count + "회 만에 맞췃습니다."); break; 
			}
		}
		return count;
	}
	
	public void PrintTheRecord() {
		System.out.println("최고 점수는 "+this.count+"회 입니다.");
	}
}
