package day05;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		/*
		int i, j;
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
			System.out.print(i*j+"\t");
			}
			System.out.print("\r");
		}
		
		
		int i0, j0;
		for(i0=0; i0<=4; i0++) {
			for(j0=1; j0<=5; j0++) {
			System.out.print(i0*5 + j0 +"\t");
			}
			System.out.print("\r");
		}

		/*
		 
		1. ���� for�� ����
		5���� 1���� 1�� �����ϴ� ī��Ʈ�ٿ� ������ ����ϱ� 
		ī��Ʈ�ٿ��� �����մϴ�.
		5
		4
	    3
	    2
	    1
		
		2. ���� for�� ����
		���������� ��� 5���� ��ž�� ����ϱ�
		 	*
		   **
		  ***
		 ****
		*****
		
		*/
		/*
		1. ���� for ����
		-> for���� �̿��Ͽ� ���ĺ� A ~ Z ���� ����ϼ���
		*/
		for(int i = 65; i<=90; i++) {
			System.out.print((char)i+" ");
		}
		
		/*
		2. ���� for ����
		-> ���� for���� �̿��ؼ� ����ó�� �� ����ϼ��� 
		 **
		  **
		   **
		    **
		     **
		*/
		for(int j = 0; j<5; j++) {
			for(int k = 0; k<j; k++){
				System.out.print(" ");
			}
			System.out.println("**");
		}
		
		/*
		for�� ���� �ΰ��Դϴ�.
		#1 ���� for�� ����
		1���� 100���� ���� �� ¦���� ����ϴ� �ڵ� �ۼ��ϱ� 
		*/
		
		for(int i0 = 1; i0<=100; i0++) {
			if(i0%2==0) System.out.print(i0+" ");
		}
		
		/*		 
		#2 ���� for�� ����
		ù ��° �ٿ��� * �ϳ���, 
		�� ��° �ٿ��� * �� ���� ����ϰ� 
		�� ��° �ٿ��� * �� ���� ����ϴ� ���� �ݺ��Ͽ� 
		�� �ټ� ���� �� ž�� ����ϱ�
		*/
		for(int j0 = 0; j0<=5; j0++) {
			for(int k0 = 0; k0<j0; k0++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		1. ���� for�� ����
		1~100���� 3�� ����� ����ϰ�,
		��µ� 3�� ����� ���� ����ϴ� �ڵ� �ۼ�
		*/
		int sum = 0;
		for(int i1=0; i1<=100; i1++) {
			if(i1%3==0) System.out.print(i1+" ");
			sum += i1;
		}
		System.out.println(sum);
		
		/*
		2. ���� for�� ����
		�Է� ���� ���ڷ� ���� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
		ex)�� �ܰ� ������� �����ұ�� ? 5
		   1
		   2 3 
		   4 5 6
		   7 8 9 10
		   11 12 13 14 15
		*/
		System.out.println("���� �Է��ϼ���.: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); int pn = 0; int j1 = 0;
		for(j1=0; ; j1++) {
			for(int k1=0; k1<j1; k1++) {
				System.out.print(++pn +" ");
			}
			if(pn==n) break; System.out.println();
		}
		System.out.println("\n�� "+ j1 +"�ܰ��Դϴ�.");
		
		
		/*
		1. ���� for�� ����
		����ڷκ��� ���� �� ���� �Է¹޾� 1���� �� ���ڱ����� ���� ���Ͻÿ�.
		ex) �Է� �� : 5 ��� : 15 */
		Scanner input0 = new Scanner(System.in);
		System.out.println("�Է� �� : ");
		int n0 = input.nextInt();
		int sum1 = 0;
		for(int i2=1; i2<=n0; i2++) {
			sum1 += i2;
		}
		System.out.println(sum1);
		/*  2. ���� for�� ����
		����ڷκ��� ���ڸ� �Է¹޾� �� ���ڱ����� �������� �ۼ��Ͻÿ�.
		ex) �Է� �� : 3
		    ��� : 1 * 1 : 1
	             1 * 2 : 2
	             1 * 3 : 3
	             2 * 1 : 2
	             2 * 2 : 4
	             2 * 3 : 6
	             3 * 1 : 3
	             3 * 2 : 6
	             3 * 3 : 9  */
		System.out.println("�Է� �� : ");
		int n1 = input.nextInt();
		for(int j2=1; j2<=n1; j2++) {
			for(int k2=1; k2<=n1; k2++) {
				System.out.println(j2+" * "+k2+" : "+j2*k2);
			}
		}
		input.close();
	}
	
	

}
