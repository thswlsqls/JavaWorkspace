package day08;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		/* 운동종류와 mets(안정시 1kg의 체중이 1분당 소모하는 산소섭취량 1mets = 3.5ml/kg/min)을 등록하고 
		 * 운동종류와 본인의 체중 및 운동시간을 입력하여 소비한 칼로리를 계산합니다.(1000ml의 산소를 섭취할 때 5kcal의 열량을 소모합니다.)
		 * 소비한 칼로리는 mets x 3.5(ml) x 체중(kg) x 0.005(kcal) x 운동시간(min)으로 계산합니다.
			 1.운동 등록
			 2.등록한 운동 보기
			 3.종료
			 >>>
			 1
			 운동 종류:	웨이트트레이닝 
			 mets:	6.0
			 1.운동 등록
			 2.등록한 운동 보기
			 3.종료
			 >>>2
			 웨이트트레이닝 : 6.0(mets)
			 1.칼로리 계산 2.수정 3.삭제 4.나가기
			 >>> 1
			 체중(kg)	:	90
			 운동 종류	:	웨이트 트레이닝
			 운동 시간(min) :	50
			 소비한 칼로리는 "472.5"kcal 입니다.
			 1.칼로리 계산 2.수정 3.삭제 4.나가기
			 >>> 2
			 수정할 운동:  웨이트트레이닝
			 수정할 mets: 6.5
			 1.칼로리 계산 2.수정 3.삭제 4.나가기
			 >>> 3
			 삭제할 운동:	웨이트트레이닝
			 삭제되었습니다.
			 1.칼로리 계산 2.수정 3.삭제 4.나가기
			 >>> 4
			 1.운동 등록
			 2.등록한 운동 보기
			 3.종료
			 >>> 3
			 3
			 종료합니다.
		*/
		
		Scanner input = new Scanner(System.in);
		LinkedHashMap<String, Float> exercise_map = new LinkedHashMap<String, Float>();
		String exercise; Float mets; int kg; int min; double Kcal;
		
		while(true) {
			System.out.println("1.운동 등록");
			System.out.println("2.운동 보기");
			System.out.println("3.종료");
			System.out.print(">>>");
			int select = input.nextInt();
			switch(select) {
				case 1: 
					System.out.print("운동 종류:\t"); exercise = input.next();
					System.out.print("mets:\t"); mets = input.nextFloat();
					if(exercise_map.get(exercise)==null) 
					{
						exercise_map.put(exercise, mets); 
						System.out.println("등록되었습니다.");
					}	
					else 
					{
						System.out.println("이미 등록된 운동입니다.");
					}break;
				case 2: 
					for(String a : exercise_map.keySet()) {
						System.out.println(a + "\t:\t" + exercise_map.get(a)+"mets");
					}
					System.out.println("1.칼로리 계산 2.수정 3.삭제 4.나가기"); int select_ = input.nextInt();
					switch(select_) {
						case 1:	System.out.print("체중(kg):\t\t"); kg = input.nextInt();
								System.out.print("운동 종류:\t\t"); exercise = input.next();
								System.out.print("운동 시간(min):\t"); min = input.nextInt();
								if(exercise_map.containsKey(exercise)==true)
								{
									Kcal = exercise_map.get(exercise)*3.5*kg*0.005*min;
									double Kcal_ = Double.parseDouble(String.format("%.2f",Kcal));
									System.out.println("소모한 칼로리는 "+"\""+ Kcal_ +"\""+"kcal 입니다.");
									break;
								}
								else 
								{
									System.out.println("등록되지 않은 운동입니다.");
								}break;
						case 2: System.out.println("수정할 운동을 선택하세요.");
								for(String a : exercise_map.keySet()) {
									System.out.println(a + "\t:\t" + exercise_map.get(a)+"mets");
								}
								System.out.print("운동 종류 입력:\t"); exercise = input.next();
								if(exercise_map.containsKey(exercise)) 
								{
									System.out.print("수정 mets 입력:\t"); mets = input.nextFloat();
									exercise_map.replace(exercise, mets);
									System.out.println("수정되었습니다.");
								}else 
								{
									System.out.println("목록에 없습니다.");
								}break;
						case 3: System.out.println("삭제할 운동을 선택하세요.");
								for(String a : exercise_map.keySet()) {
									System.out.println(a + "\t:\t" + exercise_map.get(a)+"mets");
								}
								System.out.print("운동 종류 입력:\t"); exercise = input.next();
								if(exercise_map.containsKey(exercise)) 
								{
									exercise_map.remove(exercise);
									System.out.println("삭제되었습니다.");
								}
								else
								{
									System.out.println("목록에 없습니다.");
								}break;
						case 4: System.out.println("보기 및 수정과 삭제 메뉴에서 나갑니다.");
								break;
					}break;
					case 3: System.out.println("종료합니다.");
					System.exit(0);
			}
		}
		
		
	}
}
