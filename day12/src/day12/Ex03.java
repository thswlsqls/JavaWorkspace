package day12;

import java.util.Scanner;

public class Ex03 {
	private String name;
	private int age;
	
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
	public void setAge(int age) { this.age = age; }
	public int getAge() { return age; }
	
	public void setwesternAge(int age) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������� �Է��ϼ���.ex)128(1��28��), 1208(12��8��):");
		int BirthMonthandDay = input.nextInt();
		this.age = BirthMonthandDay>128?age-2:age-1;
	}
	
	public int getwesternAge() { return age; }
}
