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
		System.out.println("1~10������ �� : "+sum);
	}
	*/
	/*
	Scanner input = new Scanner(System.in);
	int i, sum=0;
	while(true) {
		System.out.println("���Է�(1~100) : ");
		i = input.nextInt();
		if(i>-1&&i<=100) break;
		System.out.println("�߸� �Է�, �ٽ�");
	}
	for(int j=1; j<=i; j++) sum+=j;
	System.out.println("�Է� ���� �������� ��: "+sum);
	*/
		
	//1 ~ 10������ ���ڸ� �Է� �޾� 1���� �Է� ���� �������� ���� ���Ͻÿ�.
	/*	
	Scanner input = new Scanner(System.in);
	System.out.println("1���� �Է��� �������� ���� ���մϴ�. 1���� 10������ ���� �Է��ϼ���. : ");
	int n = input.nextInt();
	int sum = 0;
	while(n>0) {
		if(n>10) {System.out.println("1���� 10������ ���� �Է����ּ���. : "); n = input.nextInt();}
		sum = sum + n--; 
	}
	System.out.println(sum);	
	
	//10 ~ 20������ ���ڸ� �Է� �޾� 1���� �Է� ���� �������� ���� ���Ͻÿ�.	
	System.out.println("10���� �Է��� �������� ���� ���մϴ�. 11���� 20������ ���� �Է��ϼ���. : ");
	int n0 = input.nextInt();
	int sum0 = 0;
	while(n0>=10) {
		if(n0>20) {System.out.println("10���� 20������ ���� �Է����ּ���. : "); n0 = input.nextInt();}
		sum0 = sum0 + n0--; 
	}
	System.out.println(sum0);	
	*/
	/*	
	Scanner input = new Scanner(System.in);
	int i0, temp;
	System.out.println("�� �Է� : ");
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
			System.out.println("����");
			continue; //���� ������ �������� �ʰ� ���� �˻縦 �����Ѵ�.
		}
		System.out.println("i : "+i);
	}
	*/
	/*
	Scanner input = new Scanner(System.in);
	int num;
	System.out.println("1.�Է�, 2.���");
	num = input.nextInt();
	while(true) {
		if((num<1)||(num>2)) continue;
		switch(num) {
		case 1: System.out.println("�Է��ϴ� ��� ����"); break;
		case 2: System.out.println("�Է��ϴ� ��� ����"); break;
		default: System.out.println("��Ȯ�ϰ� �Է��ϼ���."); 
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
				System.out.println("���� �ݺ��� : "+i);
			}
			System.out.println("���� �ݺ���");
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
		System.out.println("���� ���� ����");	
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
		System.out.println("�����ϼ�: "+d+" ���� ��: "+ssar+" ���� ��: "+m);
			
		//2
		System.out.println("�ּҰ������ �ִ������� ���մϴ�. �� ���� �Է��ϼ���: ");
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
		System.out.println("�ִ�����: " + GCD +" �ּҰ����: " + LCM);	
	
		//3
		System.out.println("����� ���մϴ�. ���� �Է��ϼ���.: ");
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
		System.out.println("2���� �Է��� �� ������ �Ҽ��� ���մϴ�. ���� �Է��ϼ���.: ");
		int n4 = input.nextInt();
		int i1 = 2; int j = 2; int count = 0;
		while(i1<=n4){
			while(j<=i1) {
				if((i1%j==0)) System.out.println(i1+"�� ���"+j+" "); count++;
				if((j==i1)&&(count==1)) System.out.println(j+"(��)�� �Ҽ��Դϴ�.");
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




