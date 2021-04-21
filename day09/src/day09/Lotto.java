package day09;

import java.util.LinkedHashSet;

public class Lotto {

	public static void main(String[] args) {
		LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
		int number = (int)(Math.random()*45)+1;
		System.out.println(getnumbers(numbers, number));
	}
	
	public static LinkedHashSet<Integer> getnumbers(LinkedHashSet<Integer> numbers, int number){
		//LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
		//number = (int)(Math.random()*45)+1;
		
		int i =0;
		while(i<6) {
			number = (int)(Math.random()*45)+1;
			if(numbers.contains(number)) continue;
			else numbers.add(number);
			i++;
		}
		return numbers;	
	}
	
	public static LinkedHashSet<Integer> getnumbers_(LinkedHashSet<Integer> numbers, int number){
		//LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
		//number = (int)(Math.random()*45)+1;
		
		int i =0;
		while(i<6) {
			number = (int)(Math.random()*45)+1;
			numbers.add(number);
			i++;
		}
		return numbers;	
	}
	
	
}
