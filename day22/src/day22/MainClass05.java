package day22;

import day22.A공군;
import day22.A공방;
import day22.A지상군;
import day22.A공군;

interface A공방{
	public void attack(); //공격시 사용
	public void defense(); //방어시 사용
}
class A지상군 implements A공방{
	public void 지상군이공격합니다() { System.out.println("지상군이 공격합니다"); }
	public void 방방방() { System.out.println("지상군이 방어합니다"); }
	public void attack() {
		System.out.println("지상군이 공격합니다");
	}
	public void defense() {
		System.out.println("지상군이 방어합니다");
	}
}
class A공군 implements A공방{
	public void 디펜스() { System.out.println("공군이 방어합니다"); }
	public void attack() { 
		System.out.println("공군이 공격합니다"); 
	}
	@Override
	public void defense() {
		System.out.println("공군이 방어합니다");
	}
}
public class MainClass05 {
	public static void main(String[] args) {
		A공방 army = new A지상군();
		army.attack();
		army.defense();
		
		army = new A공군();
		army.attack();
		army.defense();
	}
}



