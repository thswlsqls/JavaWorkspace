package day08;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		/* ������� mets(������ 1kg�� ü���� 1�д� �Ҹ��ϴ� ��Ҽ��뷮 1mets = 3.5ml/kg/min)�� ����ϰ� 
		 * ������� ������ ü�� �� ��ð��� �Է��Ͽ� �Һ��� Į�θ��� ����մϴ�.(1000ml�� ��Ҹ� ������ �� 5kcal�� ������ �Ҹ��մϴ�.)
		 * �Һ��� Į�θ��� mets x 3.5(ml) x ü��(kg) x 0.005(kcal) x ��ð�(min)���� ����մϴ�.
			 1.� ���
			 2.����� � ����
			 3.����
			 >>>
			 1
			 � ����:	����ƮƮ���̴� 
			 mets:	6.0
			 1.� ���
			 2.����� � ����
			 3.����
			 >>>2
			 ����ƮƮ���̴� : 6.0(mets)
			 1.Į�θ� ��� 2.���� 3.���� 4.������
			 >>> 1
			 ü��(kg)	:	90
			 � ����	:	����Ʈ Ʈ���̴�
			 � �ð�(min) :	50
			 �Һ��� Į�θ��� "472.5"kcal �Դϴ�.
			 1.Į�θ� ��� 2.���� 3.���� 4.������
			 >>> 2
			 ������ �:  ����ƮƮ���̴�
			 ������ mets: 6.5
			 1.Į�θ� ��� 2.���� 3.���� 4.������
			 >>> 3
			 ������ �:	����ƮƮ���̴�
			 �����Ǿ����ϴ�.
			 1.Į�θ� ��� 2.���� 3.���� 4.������
			 >>> 4
			 1.� ���
			 2.����� � ����
			 3.����
			 >>> 3
			 3
			 �����մϴ�.
		*/
		
		Scanner input = new Scanner(System.in);
		LinkedHashMap<String, Float> exercise_map = new LinkedHashMap<String, Float>();
		String exercise; Float mets; int kg; int min; double Kcal;
		
		while(true) {
			System.out.println("1.� ���");
			System.out.println("2.� ����");
			System.out.println("3.����");
			System.out.print(">>>");
			int select = input.nextInt();
			switch(select) {
				case 1: 
					System.out.print("� ����:\t"); exercise = input.next();
					System.out.print("mets:\t"); mets = input.nextFloat();
					if(exercise_map.get(exercise)==null) 
					{
						exercise_map.put(exercise, mets); 
						System.out.println("��ϵǾ����ϴ�.");
					}	
					else 
					{
						System.out.println("�̹� ��ϵ� ��Դϴ�.");
					}break;
				case 2: 
					for(String a : exercise_map.keySet()) {
						System.out.println(a + "\t:\t" + exercise_map.get(a)+"mets");
					}
					System.out.println("1.Į�θ� ��� 2.���� 3.���� 4.������"); int select_ = input.nextInt();
					switch(select_) {
						case 1:	System.out.print("ü��(kg):\t\t"); kg = input.nextInt();
								System.out.print("� ����:\t\t"); exercise = input.next();
								System.out.print("� �ð�(min):\t"); min = input.nextInt();
								if(exercise_map.containsKey(exercise)==true)
								{
									Kcal = exercise_map.get(exercise)*3.5*kg*0.005*min;
									double Kcal_ = Double.parseDouble(String.format("%.2f",Kcal));
									System.out.println("�Ҹ��� Į�θ��� "+"\""+ Kcal_ +"\""+"kcal �Դϴ�.");
									break;
								}
								else 
								{
									System.out.println("��ϵ��� ���� ��Դϴ�.");
								}break;
						case 2: System.out.println("������ ��� �����ϼ���.");
								for(String a : exercise_map.keySet()) {
									System.out.println(a + "\t:\t" + exercise_map.get(a)+"mets");
								}
								System.out.print("� ���� �Է�:\t"); exercise = input.next();
								if(exercise_map.containsKey(exercise)) 
								{
									System.out.print("���� mets �Է�:\t"); mets = input.nextFloat();
									exercise_map.replace(exercise, mets);
									System.out.println("�����Ǿ����ϴ�.");
								}else 
								{
									System.out.println("��Ͽ� �����ϴ�.");
								}break;
						case 3: System.out.println("������ ��� �����ϼ���.");
								for(String a : exercise_map.keySet()) {
									System.out.println(a + "\t:\t" + exercise_map.get(a)+"mets");
								}
								System.out.print("� ���� �Է�:\t"); exercise = input.next();
								if(exercise_map.containsKey(exercise)) 
								{
									exercise_map.remove(exercise);
									System.out.println("�����Ǿ����ϴ�.");
								}
								else
								{
									System.out.println("��Ͽ� �����ϴ�.");
								}break;
						case 4: System.out.println("���� �� ������ ���� �޴����� �����ϴ�.");
								break;
					}break;
					case 3: System.out.println("�����մϴ�.");
					System.exit(0);
			}
		}
		
		
	}
}
