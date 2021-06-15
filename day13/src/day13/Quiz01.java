package day13;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Quiz01 {
		
		private int roomCount;
		private LinkedHashMap<String, Integer> rooms;
		
		public void setRoomCount(int roomCount) {
			this.roomCount = roomCount;
		}
		
		public int getRoomCount() {
			return roomCount;
		}
		
		public void setRooms(LinkedHashMap<String, Integer> rooms) {
			this.rooms = rooms;
		}
		
		public LinkedHashMap<String, Integer> getRooms(){
			return rooms;
		}
		
		public void Reserve(LinkedHashMap<String, Integer> rooms, int roomCount, Scanner input) {
			
			System.out.println("=== ���� ���� �� ��� ===");
			for(String key : rooms.keySet()) {
				if(rooms.get(key)==1) {
					System.out.println(key);
				}
			}
			
			System.out.print("������ ���� �̸��� �Է��ϼ���. : "); String roomName = input.next();
			if(rooms.containsKey(roomName)&&rooms.get(roomName)==1) {
				rooms.replace(roomName, 0);
				System.out.println("����Ǿ����ϴ�.");
				roomCount = this.getRoomCount()-1;
				this.setRoomCount(roomCount);
			}else {
				System.out.println("���� ���̰ų� �̹� ����� ���Դϴ�.");
			}
		}
		
		public void Cancle(LinkedHashMap<String, Integer> rooms, int roomCount, Scanner input) {
			
			System.out.print("������ ����� ���� �̸��� �Է��ϼ���. : "); String roomName = input.next();
				if(rooms.containsKey(roomName)&&rooms.get(roomName)==0) {
					rooms.replace(roomName, 1);
					System.out.println("��ҵǾ����ϴ�.");
					roomCount = this.getRoomCount()+1;
					this.setRoomCount(roomCount);
				}else {
					System.out.println("���� ���̰ų� ������� ���� ���Դϴ�.");
				}
		}
		
		public void Check(LinkedHashMap<String, Integer> rooms, int roomCount, Scanner input) {

			for(String key : rooms.keySet()) {
				if(rooms.get(key)==1) {
					System.out.println(key+": ���డ��");
				}else {
					System.out.println(key+" : �����");
				}
			}
			System.out.println("���� ������ �� ���� : "+this.getRoomCount()+"/"+(rooms.size()));
		}

		public void HotelPOS() throws IOException {
			

			LinkedHashMap<String, Integer> rooms = new LinkedHashMap<String, Integer>();
			rooms.put("Sclass1", 1);
			rooms.put("Sclass2", 1);
			rooms.put("Sclass3", 1);
			rooms.put("Aclass1", 1);
			rooms.put("Aclass2", 1);
			rooms.put("Aclass3", 1);
			rooms.put("Aclass4", 1);
			rooms.put("Bclass1", 1);
			rooms.put("Bclass2", 1);
			rooms.put("Bclass3", 1);
			rooms.put("Bclass4", 1);
			rooms.put("Bclass5", 1);
			int roomCount = 12;
			
			this.setRooms(rooms);
			this.setRoomCount(roomCount);
			
			java.util.Scanner input = new java.util.Scanner(System.in);
			
			System.out.println("===== ȯ �� �� �� �� =====");
			while(true) {
				System.out.println("1.�� ��");
				System.out.println("2.off");
				System.out.print("�Է� >>>>");
				int select = input.nextInt();
				switch(select) {
					case 1:{
						System.out.println("��� ���� ���");
						System.out.println("1 : �Խǿ���");
						System.out.println("2 : �������");
						System.out.println("3 : ������Ȳ");				
						System.out.print("����� ��� �Է� : ");
						int function = input.nextInt();
						switch(function) {
							case 1:{
								this.Reserve(rooms, roomCount, input);
							}break;
							case 2:{
								this.Cancle(rooms, roomCount, input);
							}break;
							case 3:{
								this.Check(rooms, roomCount, input);
							}break;
							default : {
								System.out.println("���� ��� �Դϴ�.");
							}break;
						}
					}break;
					case 2: {
						System.out.println("�����մϴ�.");
						System.exit(0);
					}
				}
			}
		}
}
