package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimerQuizMain {

	public static void main(String[] args) throws Exception {
				
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		
		TimerQuiz tq = new TimerQuiz(simple, date);
		
		tq.tentimer();
		tq.computer();
	}
}
