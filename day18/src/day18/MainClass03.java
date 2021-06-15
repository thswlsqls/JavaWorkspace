package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Member03> arr = new ArrayList<Member03>();
		HashMap<String, Member03> map = new HashMap<String, Member03>();
		
		String name=null, addr=null;
		while(true) {
			System.out.println("1.등록 2.확인 3.검색");
			int num = input.nextInt();
			switch(num) {
			case 3:
				System.out.print("검색 이름 : ");
				name = input.next();
				Member03 search = map.get(name);
				//System.out.println(search);
				if(search != null) {
					System.out.println("이름 : "+search.getName());
					System.out.println("주소 : "+search.getAddr());
				}
				/*
				for(int i=0;i<arr.size();i++) {
					Member03 search = arr.get(i);
					if(name.equals(search.getName())) {
						System.out.println("이름 : "+search.getName());
						System.out.println("주소 : "+search.getAddr());
					}
				}
				*/
				break;
			case 1:
				System.out.print("등록 이름 : ");
				name = input.next();
				System.out.print("등록 주소 : ");
				addr = input.next();
				Member03 m = new Member03();
				m.setName(name); m.setAddr(addr);
				arr.add(m);
				map.put(name, m);
				break;
			case 2:
				for(int i=0; i < arr.size(); i++) {
					Member03 mm = arr.get(i);
					System.out.println("이름 : "+mm.getName());
					System.out.println("주소 : "+mm.getAddr());
					System.out.println("--------------------");
				}
				//ArrayList<Member03>
				for(Member03 m03 : arr) {
					System.out.println("이름 : "+m03.getName());
					System.out.println("주소 : "+m03.getAddr());
					System.out.println("--------------------");
				}
				System.out.println("==== foreach 연습 ====");
				String[] str = {"aaa","bbb","ccc"};
				for(int i=0; i < str.length ; i++) {
					System.out.println(str[i]);
				}
				System.out.println("==================");
				for(String s : str) {
					System.out.println(s);
				}
				break;
			}
		}
		
		
		
		/*
		Member03 test = new Member03();
		test.setName("홍길동");
		test.setAddr("산골짜기");
		arr.add(test);
		Member03 m03 = arr.get(0);
		System.out.println(m03.getName());
		System.out.println(m03.getAddr());
		System.out.println("------------------------");
		System.out.println(test.getName());
		System.out.println(test.getAddr());
		*/
	}
}







