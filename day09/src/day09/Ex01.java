package day09;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		Scanner input = new Scanner(System.in);
		String str = new String();
		str = input.next();
		System.out.println("�Է¹��� ���ڿ� : "+str);
		*/
		
		/*
		String str = new String("Java is Easy. �׸��� programming �Ҹ��ϴ�.");
		System.out.println("�⺻ : "+str);
		String changeStr = new String();
		changeStr = str.toUpperCase();
		System.out.println("��ȯ �� : "+changeStr);
		changeStr = str.toLowerCase();
		System.out.println("��ȯ �� : "+changeStr);
		*/
		
		/*
		String str = new String("abcdefg");
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		String addStr;
		addStr="a";
		System.out.println(addStr);
		addStr+="b";
		System.out.println(addStr);
		System.out.println(str.charAt(0)=='a');
		System.out.println(str.charAt(0)=='c');
		System.out.println(str.charAt(0)-32);
		System.out.println((char)(str.charAt(0)-32));
		 */
		
		/*
		String str = new String(" Have a nice day    ");
		String result = str.trim();
		System.out.println("1 : "+str+"..");
		System.out.println("2 : "+result+"..");
		
		String inputId = "test1234		";
		String saveId = "test1234";
		System.out.println( inputId.equals(saveId));
		System.out.println(inputId+"aa");
		System.out.println(saveId+"aa");
		System.out.println(inputId.length());
		System.out.println(saveId.length());
		System.out.println(inputId.trim().equals(saveId));
		
		String addr = "����� ���α�/����3��/23-25 14��";
		String[] split = addr.split("/");
		for(int i=0; i<split.length; i++) {
			System.out.println(i+" : "+split[i]);
		}
		String replace = result.replace(" ", "==");
		System.out.println("replace : "+replace);
		*/
		
		Scanner input = new Scanner(System.in);
		String str = "Have a nice day Have a nice day Have a nice day";
		ArrayList<Integer> IndexOfa = new ArrayList<Integer>();
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)=='a') {
				IndexOfa.add(i);
			}
		}
		System.out.println(IndexOfa);
		
		String str0 = "It is a fun java programming";
		int count_a=0; int count_g=0;
		for(int i = 0; i<str0.length(); i++) {
			if(str0.charAt(i)=='a') {
				count_a++;
			}
			if(str0.charAt(i)=='g') {
				count_g++;
			}
		}
		System.out.println("�� ���� : "+str0.length());
		System.out.println("a ���� : "+count_a);
		System.out.println("g ���� : "+count_g);
		
		String str1 = new String("tESt sTring   change    first");
		String changeStr = new String();

		ArrayList<Integer> IndexOfSpace = new ArrayList<Integer>();
		
		for(int i =0; i<str1.length(); i++) {
			if(str1.charAt(i)==' ') {
				IndexOfSpace.add(i);
			}
		}
		
		changeStr = str1.substring(0,1).toUpperCase();
		for(int i =1; i<str1.length(); i++) {
			
			if(str1.charAt(i)!=' '&&str1.charAt(i-1)!=' ') {
				changeStr = changeStr.substring(0)+str1.substring(i,i+1).toLowerCase();
			}
			
			else if(str1.charAt(i)==' ') {
				changeStr = changeStr.substring(0)+str1.substring(i,i+1)+str1.substring(i+1,i+2).toUpperCase();
			}
		}
		System.out.println(changeStr);
	
		String str_ = "�谳��-2017��\nȫ�浿����-2015��\n���켱��-2018��";
		String[] splited = str_.split("\n");
		System.out.println("====���� �� str====");
		for(String a : splited) {
			System.out.println(a);
		}
		System.out.println("====���� �� str====");
		for(String a : splited) {
			String b = a.replace("-", ":");
			String c = b.replaceAll("20[0-9][0-9]", "1999");
			System.out.println(c);
		}
	}
}
