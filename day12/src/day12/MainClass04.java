package day12;

public class MainClass04 {
	public static void main(String[] args) {
		int k=100,e=90,m=80;
		// ��ü ���� �Ŀ� ������ ��(kor, eng, math, sum, avg)�� �����ϼ���.
		// ����ϼ���.
		// ��, ��, ��, ��, ���
		Ex04 ex04 = new Ex04();
		ex04.setKor(k); ex04.setEng(e); ex04.setMath(m); 
		ex04.setSum(k, e, m); ex04.setAvg();
		
		System.out.println("����: "+ ex04.getKor()+" ����: "+ex04.getEng()+" ����: "+ex04.getMath()+" �հ�: "+ex04.getSum()+" ���: "+ex04.getAvg());
			
	}
}
