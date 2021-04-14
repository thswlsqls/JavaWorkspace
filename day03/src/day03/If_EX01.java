package day03;

import java.util.Scanner;

public class If_EX01 {

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		/* git add, commit test, git commit --amend, git log, git reset HEAD^, commit changes, day03 day04 added - scanner, if switch
		int num;
		System.out.println("1.���� ����");
		System.out.println("2.����� ����");
		System.out.println("3. ������");
		System.out.println(">>> ");
		num = input.nextInt();
		if(num == 1)
			System.out.println("���� ���� ����");
		if(num == 2)
			System.out.println("����� ���� ����");
		if(num == 3)
			System.out.println("���� �մϴ�");
		*/
		/*
		int num;
		System.out.println("�� �Է� : ");
		num = input.nextInt();
		if(num > 10)
		{
			System.out.println("���ӹ��� ����");
			System.out.println("���ӹ��� ����");
			System.out.println("���ӹ��� ����");
			System.out.println("���ӹ��� ����");
			System.out.println("���ӹ��� ����");
			System.out.println("���ӹ��� ����");
			System.out.println("���ӹ��� ����");
		}
		System.out.println("���� �����Դϴ�");
		*/
		/*
		int num;
		System.out.println("�� �Է� : ");
		num = input.nextInt();
		if(num % 2 == 0) {
			System.out.println("�Է��Ͻ� ���� ¦�� �Դϴ�.");
		}
		if(num % 2 != 0) {
			System.out.println("�Է��Ͻ� ���� Ȧ�� �Դϴ�");
		}
		*/
		
		Scanner input = new Scanner(System.in);
		//�Է��� �����Ͱ� 3�� ����� ��� ����Ͻÿ�.
		int num0;
		System.out.println("3�� ������� �˻��մϴ�. �� �Է�: ");
		num0 = input.nextInt();
		String result = (num0%3 == 0)?"3�� ����Դϴ�":"3�� ����� �ƴմϴ�";
		System.out.println(num0+"="+result);
		//�Է��� ���� ���밪�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.println("������ ����մϴ�. �� �Է�: ");
		int num1 = input.nextInt();
		System.out.println(num1+"�� ����: "+Math.abs(num1));
		//�μ��� �Է� �޾� ū ���� ����Ͻÿ�.
		System.out.println("�� ū ���� ã���ϴ�. �� �� �Է�: ");
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		System.out.println((num2>num3)?num2:num3 + "(��)�� �� Ů�ϴ�.");
		System.out.println("���� ū ���� ã���ϴ�. �� �� �Է�: ");
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		int num6 = input.nextInt();
		int result_ = (num4>num5)?num4:num5;
		System.out.println((result_>num6)?result_:num6+"(��)�� ���� Ů�ϴ�.");
		System.out.println("�� ū ���� ã�� ¦������ �˻��մϴ�. �� �� �Է�: ");
		int num7 = input.nextInt();
		int num8 = input.nextInt();
		int bigger = (num7>num8)?num7:num8;
		System.out.println(((num7>num8?num7:num8)%2==0)?bigger+"(��)�� ¦���Դϴ�.":bigger+"(��)�� ¦���� �ƴմϴ�.");
		System.out.println("�� ���� ���� ¦���̸� 3�� ������� �˻��մϴ�. �� �� �Է�: ");
		int num9 = input.nextInt();
		int num10 = input.nextInt();
		int sum = num9 + num10;
		System.out.println((sum%2==0&&sum%3==0)?sum+"��(��)¦���̰� 3�� ����Դϴ�.":sum+"��(��)¦���̰� 3�� ����� �ƴմϴ�.");
	}
}

