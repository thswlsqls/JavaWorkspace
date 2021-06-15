package day17_1;

import java.util.Scanner;

class 지상군 implements AttackDefense{
	public void accack() {
		System.out.println("지상군 공격");
	}
	public void defense() {
		System.out.println("지상군 방어");
	}
}
class 공군 implements AttackDefense{
	public void accack() {
		System.out.println(NUM+"공군 공격");
	}
	public void defense() {
		System.out.println(NUM1+"공군 공격");
	}
}
public class MainClass05 {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		//지상군 지상 = new 지상군();
		//공군 공 = new 공군();
		AttackDefense ad = null;
		System.out.println("적이 처들어 왔습니다");
		System.out.println("1.지상군 2.공군");
		int num = input.nextInt();
		if(num == 1) { System.out.println("지상군 선택"); ad = new 지상군(); }
		if(num == 2) { System.out.println("공군 선택"); ad = new 공군();}
		System.out.println("1.공격 2.방어");
		int choice = input.nextInt();
		if(choice == 1 ) ad.accack();
		else if(choice==2 ) ad.defense();
		/*
		if(choice == 1 && num == 1) 지상.accack();
		else if(choice == 2 && num == 1) 지상.defense();
		else if(choice == 1 && num == 2) 공.accack();
		else if(choice == 2 && num == 2) 공.defense();
		*/
	}
}









