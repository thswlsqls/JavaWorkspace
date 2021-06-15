package day13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		String ss = s.format(time);
		System.out.println(ss);
		
		Date date = new Date();
		System.out.println(date);
		System.out.println("date : "+s.format(date));
	}
}
