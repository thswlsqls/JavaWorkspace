package day12;

import java.util.Date;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		Ex03 ex03 = new Ex03();
		System.out.print("이름 입력 : ");
		name = input.next();
		ex03.setName(name);
		System.out.print("나이 입력 : ");
		age = input.nextInt();
		ex03.setAge(age);
		ex03.setwesternAge(age);
		System.out.println(ex03.getName()+"님의 나이는 만으로 "+ex03.getwesternAge()+"살 입니다.");
		//객체 생성 후 setter, getter를 통해 각각의 값(age, name)을 저장하세요.
		//나이를 만으로 계산하는 메소드를 만들어 만으로 age를 저장하세요.
		//저장된 값을 getter를 통해 출력하세요.
		//=> ??? 님의 나이는 ?? 살 입니다.
	}
}
