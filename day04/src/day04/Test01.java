package day04;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		/*
		 * git test, git commit --amend, git reset HEAD, git reset HEAD^, git log -p, commit changes, day03 day04 added - scanner, if switch
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num % 3 == 0) {
			System.out.println("�Է��Ͻ� ���� 3�� ��� �Դϴ�.");
		}
		else {
			System.out.println("�Է��Ͻ� ���� 3�� ����� �ƴմϴ�.");
		}
		System.out.println("���� ������ �����մϴ�.");
		}
	}
	*/
	/*
	Scanner input = new Scanner(System.in);
	int su1, su2, max, min;
	System.out.print("���� �� �� �Է� : ");
	su1 = input.nextInt();
	su2 = input.nextInt();
	*/
	
	/*
	Scanner input = new Scanner(System.in);
	System.out.println("5�� ������� �˻��մϴ�. �� �Է�: ");
	int num0 = input.nextInt();
	System.out.println(num0%5==0?"5�� ����Դϴ�.":"5�� ����� �ƴմϴ�.");
	
	System.out.println("0���� ũ�� 100���� ������ �˻��մϴ�. �� �Է�: ");
	int num1 = input.nextInt();
	System.out.println((num1>0)&&(num1<100)?"����":"������");
	
	System.out.println("¦���̸鼭 3�� ������� �˻��մϴ�. �� �Է�: ");
	int num2 = input.nextInt();
	System.out.println((num2%2==0)&&(num2%3==0)?"¦���̸鼭 3�� ����Դϴ�.":"¦���̸鼭 3�� ����� �ƴմϴ�.");
	*/
	/*	
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("�� �Է� : ");
		num = input.nextInt();
		if(num>100) {
			System.out.println(num+" : 100���� ũ��");
		}else if(num>50) {
			System.out.println(num+" : 50���� ũ��.");
		}else {
			System.out.println(num+" : 50���� ���� ����");
		}
	*/	
	
	Scanner input = new Scanner(System.in);
	System.out.println("Ŀ���� ������ �Է��ϼ���.: ");
	int count = input.nextInt();
	System.out.println(count>10?"�� �ݾ�: "+ (10*2000+(count-10)*1500):"�� �ݾ� :"+ (count*2000));
		
	System.out.println("usb�� ������ �Է��ϼ���.: ");
	int count0 = input.nextInt();
	System.out.println(count0>100?"�� �ݾ�: "+ (count0*5000*0.88):"�� �ݾ� :"+ ((count0>10)?count0*5000*0.9:count0*5000));
	
	/*
	���̸� �Է¹޾Ƽ� ���ΰ� �̼����ڷ� �����Ѵ�.
	������ ��쿡 20~39����� û��, �� �̻��̸� ��������� �����Ѵ�.
	�̼����� ��쿡�� 14~19���� û�ҳ�, 14�� �̸��� ��̷� �и��Ѵ�.
	*/
	System.out.println("���̸� �Է��ϼ���.: ");
	int age1 = input.nextInt();
	System.out.println(age1>39?"�����":(age1>19?"û��":(age1>13?"û�ҳ�":"���")));
	
	//2
	System.out.println("������ �Է��ϼ���.: ");
	int score = input.nextInt();
	System.out.println(score>=90?"A":(score>=80?"B":score>=70?"C":score>=60?"D":"F"));
	
	//3
	System.out.println("������ �Է��ϼ���. : ");
	int year = input.nextInt();
	System.out.println((year%4==0&&year%100!=0)||year%400==0?"1(�����Դϴ�.)":"0(������ �ƴմϴ�.)");
	
	//4
	System.out.println("�� ������ �Է��ϼ���. : ");
	int n0= input.nextInt();
	int n1= input.nextInt();
	int n2= input.nextInt();
		
	System.out.println("�ּҰ�: " + (n0<=n1&&n1<=n2?n0:(n0<=n2?n0:n2)) + " �ִ밪: " + 
	(n0>=n1&&n1>=n2?n0:(n0>=n2?n0:n2)) + " �հ�: " + (n0+n1+n2) + " ���: " + ((n0+n1+n2)/3)); 
	
	}
}

