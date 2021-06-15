package day12;

public class Ex04 {
	private int kor;
	private int eng; 
	private int math;
	private int sum;
	private double avg;
	
	public void setKor(int kor) { this.kor = kor; }
	public int getKor() { return kor; }
	public void setEng(int eng) { this.eng = eng; }
	public int getEng() { return eng; }
	public void setMath(int math) { this.math = math; }
	public int getMath() { return math; }
	
	public void setSum(int kor, int eng, int math) { this.sum = kor+eng+math; }
	public int getSum() { return sum; }
	
	public void setAvg() { this.avg = sum/3; }
	public double getAvg() { return avg; }
}
