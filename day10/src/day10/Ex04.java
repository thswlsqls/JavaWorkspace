package day10;

public class Ex04 {
	public String big(int x, int y) {
		if(x>y) {
			return "x가 y보다 크다";
		}else if(x<y) {
			return "y가 x보다 크다";
		}else {
			return "y와 x는 같다";
		}
	}
}
