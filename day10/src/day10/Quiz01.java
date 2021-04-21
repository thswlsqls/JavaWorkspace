package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01 {
	
	public String FindEven(int n1) {
		Scanner input = new Scanner(System.in);
		System.out.print("짝수인지 혹은 홀수인지를 검사합니다. 정수를 입력하세요. : "); 
		n1 = input.nextInt();
		String result = n1%2==0?"짝수입니다.":"홀수입니다.";
		return result;
	}
	
	public void FindMultipleOfThree(ArrayList<Integer> numbers) {
		for(int a : numbers) {
			if(a%3==0) {
				System.out.print(a+"\t");
			}
		} 
		System.out.println();
	}
	
	public boolean FindPrimeNumber(int n) {
		boolean isPrime = true;
		int i = 2;
		
		while(i<n) {
			if(FindPrimeNumber(i)) {
				if(n%i==0) {
					isPrime = false;
					break;
				}
			}
			i++;
			continue;
		}
		return isPrime;
	}
	
	public int getAbs(int n) {
		int result = 0;
		if(n>0) result = n;
		else if(n<0) result = n*(-1);
		
		return result;
	}
	
	public void reverse() {
		Scanner input = new Scanner(System.in);
		int su = 0, temp = 0;
		System.out.println("수 입력 : ");
		su = input.nextInt();
		while(true) {
			temp = su%10;
			su = su/10;
			System.out.println(temp+",");
			if(su == 0) break;
		}
	}
	
	public int getNumberOfUnits(int n) {
		if(n<0) return 0;
		else {
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			int temp = 0;
			while(numbers.size()<1) {
				temp = n%10;
				numbers.add(temp);
				n = n/10;
			}
			int result = temp;
			return result;
		}
	}

	public int getNumberOfTens(int n) {	
		if(n<10) return 0;
		else {
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			int temp = 0;
			while(numbers.size()<2) {
				temp = n%10;
				numbers.add(temp);
				n = n/10;
			}
			int result = temp;
			return result;
		}
	}
	
	public int getNumberOfHundreds(int n) {
		if(n<100) return 0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int temp = 0;
		while(numbers.size()<3) {
			temp = n%10;
			numbers.add(temp);
			n = n/10;
		}
		int result = temp;
		return result;	
	}
	
	public int getNumberOfThousands(int n) {
		if(n<1000) return 0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int temp = 0;
		while(numbers.size()<4) {
			temp = n%10;
			numbers.add(temp);
			n = n/10;
		}
		int result = temp;
		return result;	
	}
	
	public int getNumberOfTenTousands(int n) {
		if(n<10000) return 0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int temp = 0;
		while(numbers.size()<5) {
			temp = n%10;
			numbers.add(temp);
			n = n/10;
		}
		int result = temp;
		return result;		
	}
	
	public int getNumberOfHundredThousand(int n) {
		if(n<100000) return 0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int temp = 0;
		while(numbers.size()<6) {
			temp = n%10;
			numbers.add(temp);
			n = n/10;
		}
		int result = temp;
		return result;	
	}
	
	public int getNumberOfMillions(int n) {
		if(n<1000000) return 0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int temp = 0;
		while(numbers.size()<7) {
			temp = n%10;
			numbers.add(temp);
			n = n/10;
		}
		int result = temp;
		return result;		
	}
}
