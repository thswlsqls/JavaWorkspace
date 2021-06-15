package day17_1;
interface MemberShip{
	public void memberShip();
}
interface Login{
	public void loginFunction();
}
class 회원관리 implements MemberShip{
	public void 회원관리기능() { }
	public void 정말회원관리() { }
	public void memberShip() { }
	public void addMember() { }
}
class 로그인 implements Login{
	public void 로그인기능() { }
	public void 로그인관리() { }
	public void loginFunction() { }
	public void logloglog() { }
}
public class MainClass03 {
	public static void main(String[] args) {
		MemberShip m = new 회원관리();
		Login l = new 로그인();
		
	}
}
