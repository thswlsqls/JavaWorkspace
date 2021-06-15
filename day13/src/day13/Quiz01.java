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
			
			System.out.println("=== 예약 가능 방 목록 ===");
			for(String key : rooms.keySet()) {
				if(rooms.get(key)==1) {
					System.out.println(key);
				}
			}
			
			System.out.print("예약할 방의 이름을 입력하세요. : "); String roomName = input.next();
			if(rooms.containsKey(roomName)&&rooms.get(roomName)==1) {
				rooms.replace(roomName, 0);
				System.out.println("예약되었습니다.");
				roomCount = this.getRoomCount()-1;
				this.setRoomCount(roomCount);
			}else {
				System.out.println("없는 방이거나 이미 예약된 방입니다.");
			}
		}
		
		public void Cancle(LinkedHashMap<String, Integer> rooms, int roomCount, Scanner input) {
			
			System.out.print("예약을 취소할 방의 이름을 입력하세요. : "); String roomName = input.next();
				if(rooms.containsKey(roomName)&&rooms.get(roomName)==0) {
					rooms.replace(roomName, 1);
					System.out.println("취소되었습니다.");
					roomCount = this.getRoomCount()+1;
					this.setRoomCount(roomCount);
				}else {
					System.out.println("없는 방이거나 예약되지 않은 방입니다.");
				}
		}
		
		public void Check(LinkedHashMap<String, Integer> rooms, int roomCount, Scanner input) {

			for(String key : rooms.keySet()) {
				if(rooms.get(key)==1) {
					System.out.println(key+": 예약가능");
				}else {
					System.out.println(key+" : 예약됨");
				}
			}
			System.out.println("예약 가능한 방 개수 : "+this.getRoomCount()+"/"+(rooms.size()));
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
			
			System.out.println("===== 환 영 합 니 다 =====");
			while(true) {
				System.out.println("1.기 능");
				System.out.println("2.off");
				System.out.print("입력 >>>>");
				int select = input.nextInt();
				switch(select) {
					case 1:{
						System.out.println("사용 가능 기능");
						System.out.println("1 : 입실예약");
						System.out.println("2 : 예약취소");
						System.out.println("3 : 객실현황");				
						System.out.print("사용할 기능 입력 : ");
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
								System.out.println("없는 기능 입니다.");
							}break;
						}
					}break;
					case 2: {
						System.out.println("종료합니다.");
						System.exit(0);
					}
				}
			}
		}
}
