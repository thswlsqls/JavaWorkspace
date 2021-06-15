package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimerQuizMain {

	public static void main(String[] args) throws Exception {
				
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		
		TimerQuiz tq = new TimerQuiz(simple, date);
		
		tq.tentimer();
		tq.computer();
	}
}
