package day08;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList name = new ArrayList();
		ArrayList phNum = new ArrayList();
		String userName, userPhNum;
		int num;
		while(true) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처");
			System.out.println("5.종료");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("저장할 이름 : ");
				userName= input.next();
				System.out.print("저장할 전화번호 : ");
				userPhNum= input.next();
				if(name.contains(userName)||phNum.contains(userPhNum)) {
					System.out.println("이미 저장되어 있습니다.");
				}else {
					name.add(userName);
					phNum.add(userPhNum);
					System.out.println("저장되었습니다.");
				}break;
			case 2:
				if(name.size()==0) {
					System.out.println("저장된 목록이 없습니다.");
				}else {
					System.out.print("찾을 이름 : ");
					userName = input.next();
					int re = name.indexOf(userName);
					if(re == -1) {
						System.out.println("해당 사용자는 존재하지 않습니다.");	
					}else {
						System.out.println("이름 :\t"+name.get(re));
						System.out.println("전화번호 :\t"+phNum.get(re));
					}
				}break;
			case 3:
				if(name.size()==0) {
					System.out.println("저장된 목록이 없습니다.");
				}else {
					System.out.println("삭제할 이름 : ");
					userName = input.next();
					int re = name.indexOf(userName);
					if(re==-1) {
						System.out.println("존재하지 않습니다.");
					}else {
						name.remove(re);
						phNum.remove(re);
						System.out.println("삭제되었습니다.");
					}
				}break;
			case 4:
				if(name.size()==0) {
					System.out.println("저장된 목록이 없습니다.");
				}else {
					for(int i=0; i<name.size(); i++) {
						System.out.println("이름 :\t"+name.get(i));
						System.out.println("전화번호 :\t"+phNum.get(i));
						System.out.println("===================");
					}
				}break;
			case 5:
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}	
	}
}
