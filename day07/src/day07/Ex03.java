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
		
		arr.add("홍길동");
		int num = arr.indexOf("홍길동");
		if(num != -1) {
			System.out.println("홍길동 님은 존재합니다. 위치 : "+num);
			arr.set(num, "김개똥");
		}else {
			System.out.println("홍길동 님은 존재하지 않습니다.");
		}
		System.out.println("변경 후 값 : "+arr);
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
		else System.out.println("목록에 없습니다.");
		arr.remove(arr.indexOf(b));
		System.out.println(arr);
		*/
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> phones = new ArrayList<String>();
		String name; String phone; String search; String delete;
		
		while(true) {
			System.out.print("1.연락처 등록\n2.연락처 보기\n3.연락처 삭제\n4.모든 연락처 보기\n5.종료\n>>>");
			int s = input.nextInt();
			switch(s){
			case 1: 
			{
				System.out.print("이름: "); 
				name = input.next(); input.nextLine();
				if(names.contains(name))System.out.println("등록된 이름입니다.");  
				else 
				{
					names.add(name); 
					System.out.print("연락처: "); 
					phone = input.nextLine(); 
					if(phones.indexOf(phone)==-1) phones.add(phone);
					else {System.out.println("등록된 번호입니다."); names.remove(names.indexOf(name));} break;
				
				}
			} break;
			case 2: 
			{
				System.out.print("검색할 연락처: "); 
				input.nextLine(); 
				search = input.nextLine(); 
				if(phones.contains(search)) {System.out.println("연락처: "+phones.get(phones.indexOf(search))); System.out.println("이름: "+names.get(phones.indexOf(search)));} 
				else System.out.println("목록에 없습니다.");
			} break;
			case 3: 
			{
				System.out.print("삭제할 연락처: "); 
				input.nextLine(); 
				delete = input.next();
				if(phones.contains(delete)) {names.remove(phones.indexOf(delete)); phones.remove(delete);}
				else System.out.println("목록에 없습니다.");
				
			} break;
			case 4:
			{
				System.out.println(names); 
				System.out.println(phones);
			} break;
			case 5: System.out.println("종료"); System.exit(0);
		}
				
		}
		
	}
}











