package day22;

abstract class Ab01{
	private int num;
	public void setNum(int mum) {this.num = num;}
	public int getNum() { return num; }
	public abstract void combo();
}

class NAb01 extends Ab01 {
	@Override
	public void combo() {
		// TODO Auto-generated method stub
		
	}
}

public class MainClass {
	public static void main(String[] args) {
		NAb01 abs = new NAb01();
		abs.setNum(5);
		abs.combo();
	}
}
