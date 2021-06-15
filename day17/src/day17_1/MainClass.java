package day17_1;

abstract class Ab01{
	private int num;
	public void setNum(int num) { this.num = num; }
	public int getNum() { return num; }
	public abstract void combo(); 
}
class NAb01 extends Ab01{
	@Override
	public void combo() {
		
	}
}
public class MainClass {
	public static void main(String[] args) {
		NAb01 abs = new NAb01();
		abs.setNum(5);
		abs.combo();
	}
}



