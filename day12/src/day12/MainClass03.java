package day12;

import java.util.Date;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		Ex03 ex03 = new Ex03();
		System.out.print("�̸� �Է� : ");
		name = input.next();
		ex03.setName(name);
		System.out.print("���� �Է� : ");
		age = input.nextInt();
		ex03.setAge(age);
		ex03.setwesternAge(age);
		System.out.println(ex03.getName()+"���� ���̴� ������ "+ex03.getwesternAge()+"�� �Դϴ�.");
		//��ü ���� �� setter, getter�� ���� ������ ��(age, name)�� �����ϼ���.
		//���̸� ������ ����ϴ� �޼ҵ带 ����� ������ age�� �����ϼ���.
		//����� ���� getter�� ���� ����ϼ���.
		//=> ??? ���� ���̴� ?? �� �Դϴ�.
	}
}
