package day06;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
	/*
		int i=1;
		int sum=0;
		for( ; i<=10; ) {
			sum+=i;
			i++;
		}
		System.out.println("1~10까지의 합 : "+sum);
	}
	*/
	/*
	Scanner input = new Scanner(System.in);
	int i, sum=0;
	while(true) {
		System.out.println("수입력(1~100) : ");
		i = input.nextInt();
		if(i>-1&&i<=100) break;
		System.out.println("잘못 입력, 다시");
	}
	for(int j=1; j<=i; j++) sum+=j;
	System.out.println("입력 받은 수까지의 합: "+sum);
	*/
		
	//1 ~ 10사이의 숫자만 입력 받아 1부터 입력 받은 수까지의 합을 구하시오.
	/*	
	Scanner input = new Scanner(System.in);
	System.out.println("1부터 입력한 수까지의 합을 구합니다. 1에서 10사이의 수를 입력하세요. : ");
	int n = input.nextInt();
	int sum = 0;
	while(n>0) {
		if(n>10) {System.out.println("1에서 10사이의 수를 입력해주세요. : "); n = input.nextInt();}
		sum = sum + n--; 
	}
	System.out.println(sum);	
	
	//10 ~ 20사이의 숫자만 입력 받아 1부터 입력 받은 수까지의 합을 구하시오.	
	System.out.println("10부터 입력한 수까지의 합을 구합니다. 11에서 20사이의 수를 입력하세요. : ");
	int n0 = input.nextInt();
	int sum0 = 0;
	while(n0>=10) {
		if(n0>20) {System.out.println("10에서 20사이의 수를 입력해주세요. : "); n0 = input.nextInt();}
		sum0 = sum0 + n0--; 
	}
	System.out.println(sum0);	
	*/
	/*	
	Scanner input = new Scanner(System.in);
	int i0, temp;
	System.out.println("수 입력 : ");
	i0 = input.nextInt();
	while(true) {
		temp=i0%10;
		i0=i0/10;
		System.out.println(temp+" ");
		if(i0==0) break;
	}
	System.out.println();
	*/
	/*
	int su=0, sum=0;
	do {
		su++;
		sum+=su;
	}while(su<=-9);
	System.out.println("sum = "+sum);
	}
	*/
	/*
    int i = 0;
	while(i<5) {
		i++;
		if(i==3) {
			System.out.println("실행");
			continue; //다음 문장을 실행하지 않고 조건 검사를 시작한다.
		}
		System.out.println("i : "+i);
	}
	*/
	/*
	Scanner input = new Scanner(System.in);
	int num;
	System.out.println("1.입력, 2.출력");
	num = input.nextInt();
	while(true) {
		if((num<1)||(num>2)) continue;
		switch(num) {
		case 1: System.out.println("입력하는 기능 실행"); break;
		case 2: System.out.println("입력하는 기능 실행"); break;
		default: System.out.println("정확하게 입력하세요."); 
		}
	}
	*/
	/*
		int i =0;
		while(i<5) {
			i++;
			if(i==3) {
				System.out.println("i : "+i+" : break");
				break;
			}
			System.out.println("i : "+i);
		}
	*/
	/*
		int num = 1;
		while(num <5) {
			num++;
			int i = 1;
			while(i<5) {
				i++;
				if(i==3) {
					break;
				}
				System.out.println("안쪽 반복문 : "+i);
			}
			System.out.println("상위 반복문");
		}
	*/
	/*
		int i = 0;
		boolean bool = true;
		while(bool) {
			i++;
			if(i == 3) {
				bool = false;
			}
			System.out.println("i : "+i);
		}
		System.out.println("다음 문장 실행");	
	*/
		/*
		Scanner input = new Scanner(System.in);
		//1
		int ssar = 100000;
		int m = 2;
		int d = 1;
		while(ssar>0) {
			ssar = ssar - m*20;
			d++;
			if(d%10==0) m=m*2;
			if(d==79) System.out.println(ssar +" "+ m);
		}
		System.out.println("지난일수: "+d+" 쌀의 양: "+ssar+" 쥐의 수: "+m);
			
		//2
		System.out.println("최소공배수와 최대공약수를 구합니다. 두 수를 입력하세요: ");
		int n1 = input.nextInt(); 
		int n2 = input.nextInt();
		int x=n1*n2;
		int LCM; int GCD;
		
		while(n2!=0) {
			int r = n1%n2;
			n1=n2;
			n2=r;
		}
		GCD = n1;
		LCM = x/GCD;
		System.out.println("최대공약수: " + GCD +" 최소공배수: " + LCM);	
	
		//3
		System.out.println("약수를 구합니다. 수를 입력하세요.: ");
		int n3 = input.nextInt();
		int i =1;
		while(i<=n3) {
			if(n3%i==0) System.out.print(i+" ");
			i++;
		}
		
		//4
		System.out.println();
		int i0 = 1;
		int sum0 = 0;
		while(i0<=1000) {
			if((i0%4==1)&&(i0%6==1)) {sum0 += i0; System.out.print(i0+" ");}
			i0++;
		}
		System.out.println("\n"+sum0);
	
		//5
		System.out.println("2부터 입력한 수 사이의 소수를 구합니다. 수를 입력하세요.: ");
		int n4 = input.nextInt();
		int i1 = 2; int j = 2; int count = 0;
		while(i1<=n4){
			while(j<=i1) {
				if((i1%j==0)) System.out.println(i1+"의 약수"+j+" "); count++;
				if((j==i1)&&(count==1)) System.out.println(j+"(는)은 소수입니다.");
				j++;
			}
			j=2;
			i1++;
		}
		*/
		int w = 60*10000;
		int h = 170;
		double BMI = w/h*h;
		System.out.println(Math.round(20.76));
		 
		
	}
}




