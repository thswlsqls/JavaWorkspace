package day23;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(111);
		arr.add(1.111);
		arr.add("aaa");
		
		Object a = arr.get(18);
		int aa = (int)a;
		arr.get(0);
	}
}
