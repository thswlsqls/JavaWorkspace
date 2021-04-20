package day08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		/*
		HashMap map = new HashMap();
		map.put("선풍기", "100만원");
		map.put("에어컨", "10만원");
		map.put("자동차", "20만원");
		
		System.out.println("선풍기 :\t"+map.get("선풍기"));
		System.out.println("에어컨 :\t"+map.get("에어컨"));
		System.out.println("자동차 :\t"+map.get("자동차"));
		System.out.println("없는값 :\t"+map.get("없는값"));
		
		System.out.println("containskey : "+map.containsKey("선풍기"));
		System.out.println("containskey : "+map.containsKey("선풍기1111"));
		System.out.println(map);
		
		map.replace("선풍기","8888");
		System.out.println(map);
		
		map.remove("선풍기");
		System.out.println(map);
		
		System.out.println("KetSet : "+map.keySet());
		Set s = map.keySet();
		System.out.println("s : "+s);
		
		for(Object a : s) {
			String ss = (String)a;
			System.out.println(ss + ":" + map.get(ss));
		}
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key + ":" + map.get(key));
		}
		*/
		/*
		int[] arr = {10,20,30,40};
		
		for(int a : arr) {
			System.out.println(a);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		String [] str = {"aaa", "bbb", "ccc"};
		for(String ss : str) {
			System.out.println(ss);
		}
		*/
		//HashMap map = new HashMap();
		LinkedHashMap map = new LinkedHashMap();
		map.put("홍길동", "aaa");
		map.put("김개똥", "aaa");
		map.put("고길동", "aaa");
		System.out.println(map);
		
		Scanner input = new Scanner(System.in);
		String key, value;
		System.out.print("키 저장 : ");
		key = input.next();
		System.out.print("값 저장 : ");
		value = input.next();
		map.put(key, value);
		System.out.println(map);
		System.out.println(map.get("없는키"));
		
		LinkedHashMap menus_map = new LinkedHashMap();
		String menu, price;
		int num=1;
		
		while(true) {
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종료");
			System.out.print(">>>");
			int select = input.nextInt();
			switch(select) {
				case 1: 
					System.out.print("메뉴이름:\t"); menu = input.next();
					System.out.print("메뉴가격:\t"); price = input.next();
					if(menus_map.get(menu)==null) 
					{
						menus_map.put(menu, price); 
						System.out.println("등록되었습니다.");
					}	
					else 
					{
						System.out.println("이미 등록된 메뉴입니다.");
					}break;
				case 2: 
					num = 1;
					for(Object a : menus_map.keySet()) {
						System.out.println(num+"."+a+" :\t"+menus_map.get(a));
						num++;
					}
					System.out.println("1.수정 2.삭제 3.나가기");
					System.out.print(">>>");
					int select0 = input.nextInt();
					switch(select0){
						case 1: 
						{
							System.out.print("수정할 메뉴이름을 입력하세요.: "); 
							menu = input.next(); 
							if(menus_map.containsKey(menu)==false) 
							{
								System.out.println("없는 메뉴입니다."); 
								break;
							}
							else
							{
								System.out.print("수정한 메뉴가격을 입력하세요.: "); 
								price = input.next();
								menus_map.replace(menu, price); 
								System.out.println("수정되었습니다.");
							}
						}break;
						case 2: 
						{
							System.out.print("삭제할 메뉴이름을 입력하세요.: "); menu = input.next(); 
							if(menus_map.containsKey(menu)==false) 
							{
								System.out.println("없는 메뉴입니다."); 
								break;
							}
							else 
							{
								menus_map.remove(menu); 
								System.out.println("삭제되었습니다.");
							}
						}break;
						case 3: break;
					}break;
				case 3: System.out.println("종료합니다.");
						System.exit(0);
			}
		}
	}
}
