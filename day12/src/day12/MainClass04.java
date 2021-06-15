package day12;

public class MainClass04 {
	public static void main(String[] args) {
		int k=100,e=90,m=80;
		// 객체 생성 후에 각각의 값(kor, eng, math, sum, avg)을 저장하세요.
		// 출력하세요.
		// 국, 영, 수, 합, 평균
		Ex04 ex04 = new Ex04();
		ex04.setKor(k); ex04.setEng(e); ex04.setMath(m); 
		ex04.setSum(k, e, m); ex04.setAvg();
		
		System.out.println("국어: "+ ex04.getKor()+" 영어: "+ex04.getEng()+" 수학: "+ex04.getMath()+" 합계: "+ex04.getSum()+" 평균: "+ex04.getAvg());
			
	}
}
