package day14;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) throws Exception {
		//Win10 con = new Win10("Server Pack1");
		//con.setVersion("Server Pack 1");
		
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		String version = "Server Pack 1";
		
		Win10 win10 = new Win10(simple, date, version);
	}
}
