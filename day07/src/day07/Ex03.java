package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
		ArrayList arr = new ArrayList();
		arr.add("123");
		arr.add("456");
		
		System.out.println("get(0) : "+arr.get(0));
		System.out.println("get(1) : "+arr.get(1));
		
		System.out.println("size : "+arr.size());
		System.out.println("contains : "+arr.contains("123"));
		System.out.println("contains : "+arr.contains("111"));
		
		System.out.println("indexOf : "+arr.indexOf("123"));
		System.out.println("indexOf : "+arr.indexOf("456"));
		System.out.println("indexOf : "+arr.indexOf("111"));
		
		arr.add("ȫ�浿");
		int num = arr.indexOf("ȫ�浿");
		if(num != -1) {
			System.out.println("ȫ�浿 ���� �����մϴ�. ��ġ : "+num);
			arr.set(num, "�谳��");
		}else {
			System.out.println("ȫ�浿 ���� �������� �ʽ��ϴ�.");
		}
		System.out.println("���� �� �� : "+arr);
		arr.clear();
		System.out.println("clear : "+arr);
		*/
		/*
		Scanner input = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		String a = "bbb"; //input.nextLine();
		String b = "aaa"; //input.nextLine();
		
		arr.add("aaa");
		arr.add("ccc");
		arr.add("ddd");
		System.out.println(arr);
		if(arr.indexOf(a)!=-1)System.out.println(arr.get(arr.indexOf(a)));
		else System.out.println("��Ͽ� �����ϴ�.");
		arr.remove(arr.indexOf(b));
		System.out.println(arr);
		*/
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> phones = new ArrayList<String>();
		String name; String phone; String search; String delete;
		
		while(true) {
			System.out.print("1.����ó ���\n2.����ó ����\n3.����ó ����\n4.��� ����ó ����\n5.����\n>>>");
			int s = input.nextInt();
			switch(s){
			case 1: 
			{
				System.out.print("�̸�: "); 
				name = input.next(); input.nextLine();
				if(names.contains(name))System.out.println("��ϵ� �̸��Դϴ�.");  
				else 
				{
					names.add(name); 
					System.out.print("����ó: "); 
					phone = input.nextLine(); 
					if(phones.indexOf(phone)==-1) phones.add(phone);
					else {System.out.println("��ϵ� ��ȣ�Դϴ�."); names.remove(names.indexOf(name));} break;
				
				}
			} break;
			case 2: 
			{
				System.out.print("�˻��� ����ó: "); 
				input.nextLine(); 
				search = input.nextLine(); 
				if(phones.contains(search)) {System.out.println("����ó: "+phones.get(phones.indexOf(search))); System.out.println("�̸�: "+names.get(phones.indexOf(search)));} 
				else System.out.println("��Ͽ� �����ϴ�.");
			} break;
			case 3: 
			{
				System.out.print("������ ����ó: "); 
				input.nextLine(); 
				delete = input.next();
				if(phones.contains(delete)) {names.remove(phones.indexOf(delete)); phones.remove(delete);}
				else System.out.println("��Ͽ� �����ϴ�.");
				
			} break;
			case 4:
			{
				System.out.println(names); 
				System.out.println(phones);
			} break;
			case 5: System.out.println("����"); System.exit(0);
		}
				
		}
		
	}
}











