package day22;

class Ferrari {
	private int ye;
	public Ferrari(int ye) { this.ye = ye; }
	public void speed() { System.out.println(ye+"��� ��� �ӵ� : 300km"); }
	public int getYe() { return ye; }
}

class NewFerrari extends Ferrari{
	public NewFerrari(int ye) { super(ye); }
	public void autoSystem() { System.out.println("�ڵ� ���� ��带 ���� �մϴ�."); }
	public void speed() { System.out.println("�ڽ�Ŭ�������� �������̵��� ���ǵ� �޼����Դϴ�. "); }
}

public class MAinClass01 {
	public static void main(String[] args) {
		Ferrari f = new Ferrari(2021);
		f.speed();
		NewFerrari nf = new NewFerrari(2022);
		nf.speed();
		nf.autoSystem();
	}

}
