package day08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		boolean bool01, bool02;
		hs.add("¶ó¸é"); bool01=hs.add("±è¹ä");
		hs.add("¼ø´ë"); bool02=hs.add("±è¹ä");
		System.out.println("bool01 :\t" + bool01);
		System.out.println("bool02 :\t" + bool02);
		
		System.out.println("»èÁ¦ Àü °ª :\t"+hs);
		hs.remove("±è¹ä");
		System.out.println("»èÁ¦ ÈÄ °ª :\t"+hs);
		
		ArrayList arr = new ArrayList();
		arr.add("¶ó¸é"); arr.add("±è¹ä");		
		arr.add("¼ø´ë"); arr.add("±è¹ä");		
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
