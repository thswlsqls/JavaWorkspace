package day08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		boolean bool01, bool02;
		hs.add("���"); bool01=hs.add("���");
		hs.add("����"); bool02=hs.add("���");
		System.out.println("bool01 :\t" + bool01);
		System.out.println("bool02 :\t" + bool02);
		
		System.out.println("���� �� �� :\t"+hs);
		hs.remove("���");
		System.out.println("���� �� �� :\t"+hs);
		
		ArrayList arr = new ArrayList();
		arr.add("���"); arr.add("���");		
		arr.add("����"); arr.add("���");		
		System.out.println(arr);
		
		System.out.println("======================");
		
		HashSet set = new HashSet();
		set.add("aaaa");
		set.add("bbbb");
		set.add("cccc");
		ArrayList arr0 = new ArrayList();
		arr0.add("111");
		arr0.add("222");
		arr0.add("333");
		
		for(int i=0; i<arr0.size(); i++);
		Iterator it0 = arr0.iterator();
		for(int i=0; i<set.size(); i++);
		Iterator it = set.iterator();
		while(it0.hasNext()) {
			System.out.println(it0.next());
		}
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		/*
		System.out.println("it.hashNext() : "+it.hasNext());
		System.out.println(it.next());
		System.out.println("it.hashNext() : "+it.hasNext());
		System.out.println(it.next());
		System.out.println("it.hashNext() : "+it.hasNext());
		System.out.println(it.next());
		System.out.println("it.hashNext() : "+it.hasNext());
		*/
	}
}
