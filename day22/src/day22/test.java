package day22;

interface Attack{
	public void attack();
}

interface Defense{
	public void Defense();
}
class Unit implements Attack, Defense{
	public void Unit() {
		System.out.println("unit");
	}

	@Override
	public void Defense() {
		System.out.println("방어");
	}

	@Override
	public void attack() {
		System.out.println("공격");
	}
}

public class test {
	public static void main(String[] args) {
		Unit u1 = new Unit();
		u1.Unit();
		u1.attack();
		u1.Defense();
		//test Ŭ������ ���� ��Ű�� ������ ������ �����ϴ�.
		Unit u2 = new Unit();
		u2.attack();
	}
}
