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
		map.put("��ǳ��", "100����");
		map.put("������", "10����");
		map.put("�ڵ���", "20����");
		
		System.out.println("��ǳ�� :\t"+map.get("��ǳ��"));
		System.out.println("������ :\t"+map.get("������"));
		System.out.println("�ڵ��� :\t"+map.get("�ڵ���"));
		System.out.println("���°� :\t"+map.get("���°�"));
		
		System.out.println("containskey : "+map.containsKey("��ǳ��"));
		System.out.println("containskey : "+map.containsKey("��ǳ��1111"));
		System.out.println(map);
		
		map.replace("��ǳ��","8888");
		System.out.println(map);
		
		map.remove("��ǳ��");
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
		map.put("ȫ�浿", "aaa");
		map.put("�谳��", "aaa");
		map.put("��浿", "aaa");
		System.out.println(map);
		
		Scanner input = new Scanner(System.in);
		String key, value;
		System.out.print("Ű ���� : ");
		key = input.next();
		System.out.print("�� ���� : ");
		value = input.next();
		map.put(key, value);
		System.out.println(map);
		System.out.println(map.get("����Ű"));
		
		LinkedHashMap menus_map = new LinkedHashMap();
		String menu, price;
		int num=1;
		
		while(true) {
			System.out.println("1.�޴� ���");
			System.out.println("2.�޴��� ���� ����");
			System.out.println("3.����");
			System.out.print(">>>");
			int select = input.nextInt();
			switch(select) {
				case 1: 
					System.out.print("�޴��̸�:\t"); menu = input.next();
					System.out.print("�޴�����:\t"); price = input.next();
					if(menus_map.get(menu)==null) 
					{
						menus_map.put(menu, price); 
						System.out.println("��ϵǾ����ϴ�.");
					}	
					else 
					{
						System.out.println("�̹� ��ϵ� �޴��Դϴ�.");
					}break;
				case 2: 
					num = 1;
					for(Object a : menus_map.keySet()) {
						System.out.println(num+"."+a+" :\t"+menus_map.get(a));
						num++;
					}
					System.out.println("1.���� 2.���� 3.������");
					System.out.print(">>>");
					int select0 = input.nextInt();
					switch(select0){
						case 1: 
						{
							System.out.print("������ �޴��̸��� �Է��ϼ���.: "); 
							menu = input.next(); 
							if(menus_map.containsKey(menu)==false) 
							{
								System.out.println("���� �޴��Դϴ�."); 
								break;
							}
							else
							{
								System.out.print("������ �޴������� �Է��ϼ���.: "); 
								price = input.next();
								menus_map.replace(menu, price); 
								System.out.println("�����Ǿ����ϴ�.");
							}
						}break;
						case 2: 
						{
							System.out.print("������ �޴��̸��� �Է��ϼ���.: "); menu = input.next(); 
							if(menus_map.containsKey(menu)==false) 
							{
								System.out.println("���� �޴��Դϴ�."); 
								break;
							}
							else 
							{
								menus_map.remove(menu); 
								System.out.println("�����Ǿ����ϴ�.");
							}
						}break;
						case 3: break;
					}break;
				case 3: System.out.println("�����մϴ�.");
						System.exit(0);
			}
		}
	}
}
