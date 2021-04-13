package test;

public class Test02 {
	public static void main(String[] args) {
		/*
		 escape 문자 : 문자열에 특수한 기능을 제공 
		 \n : 엔터와 비슷하다
		 \t : tab만큼 오른쪽으로 커서를 이동
		 \" : "(큰따옴표) 표현
		 \\ : \(역슬러시) 표현
		*/
		System.out.println("안\n녕\n하\n세\n요");
		System.out.println("1\t1234567\t12345678\t1");
		System.out.println("안녕\"하\"세요");
		System.out.println("안 \\ 녕");
		
		System.out.println("500" + 100 + 100 );
		System.out.println( 100.123 + 100 + "안녕");
		System.out.println("안녕" + "하세요");
		
		System.out.println("=======================================");
		System.out.println("이름\t나이\t전화번호\t\t회비");
		System.out.println("=======================================");
		System.out.println("홍길동\t\""+15+"\"\t"+3672+"-"+1234+"\t"+"\\"+20000);
		System.out.println("고길동\t\""+15+"\"\t"+2238+"-"+1234+"\t"+"\\"+30000);
		System.out.println("김말이\t\""+15+"\"\t"+1234+"-"+1234+"\t"+"\\"+50000);
		System.out.println("---------------------------------------");
		System.out.println("총합계\t\t\t\t\\"+100000);
		System.out.println("---------------------------------------");
	}
}
