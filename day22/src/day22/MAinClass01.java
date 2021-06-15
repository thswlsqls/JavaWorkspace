package day22;

class Ferrari {
	private int ye;
	public Ferrari(int ye) { this.ye = ye; }
	public void speed() { System.out.println(ye+"년식 페라리 속도 : 300km"); }
	public int getYe() { return ye; }
}

class NewFerrari extends Ferrari{
	public NewFerrari(int ye) { super(ye); }
	public void autoSystem() { System.out.println("자동 운전 모드를 시작 합니다."); }
	public void speed() { System.out.println("자식클래스에서 오버라이딩한 스피드 메서드입니다. "); }
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
