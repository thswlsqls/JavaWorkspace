package day23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Member03> arr = new ArrayList<Member03>();
		HashMap<String, Member03>map = new HashMap<String, Member03>();
		
		String name=null, addr=null;
		while(true) {
			System.out.println("1. ��� 2. Ȯ�� 3. �˻�");
			int num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("��� �̸�: ");
				name = input.next();
				System.out.println("��� �ּ� : ");
				addr = input.next();
				Member03 m = new Member03();
				m.setName(name); m.setName(addr);
				arr.add(m);
				break;
			case 2: 
				for(int i = 0; i<arr.size(); i++) {
					Member03 mm = arr.get(i);
					System.out.println("�̸� : " +  mm.getName());
					System.out.println("�ּ� : "+ mm.getAddr());
					System.out.println("---------------------");
				}
				for(Member03 m03 : arr) {
					System.out.println("�̸� : " +  m03.getName());
					System.out.println("�ּ� : "+ m03.getAddr());
					System.out.println("---------------------");
				}
				System.out.println("foreach ����");
				String[] str = {"aaa", "bbb", "ccc"};
				for(int i=0; i<str.length; i++) {
					System.out.println(str[i]);
				}
				break;
			case 3:
				System.out.println("�˻� �̸� : ");
				name = input.next();
				for(int i=0; i<arr.size(); i++) {
					Member03 search = arr.get(i);
					if(name.equals(search.getName())) {
						System.out.println("�̸� : "+search.getName());
						System.out.println("�ּ� : "+search.getAddr());
					}
				}
				for(Member03 m03 : arr) {
					System.out.println("�̸� : " +  m03.getName());
					System.out.println("�ּ� : "+ m03.getAddr());
					System.out.println("---------------------");
				}
				break;
			}
		}
//			
//		Member03 m = new Member03();
//		m.setName("ȫ�浿");
//		m.setAddr("���¥��");
//		arr.add(m);
//		Member03 m03 = arr.get(0);
//		System.out.println(m03.getName());
//		System.out.println(m03.getAddr());
//		System.out.println("----------------");
//		System.out.println(m.getName());
//		System.out.println(m.getAddr());
	}
}
