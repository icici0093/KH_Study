package com.kh.motel;

import java.util.Scanner;

public class Motel_Program {
	static Scanner sc = new Scanner(System.in);
	static int i;
	public static void main(String[] args) {
		int [] rooms = new int[10];
		
		end :
		while(true) {
			int choice = showMenu();
			switch(choice) {
			case 1 : 
				checkIn(rooms);
				break;
			case 2 :
				checkOut(rooms);
				break;
			case 3 :
				showRooms(rooms);
				break;
			case 4 : 
				break end;
			default : System.out.print("잘못 입력하셨습니다.");
			}
			
		}
		System.out.println("종료되었습니다.");
	}
	static int showMenu() {
		System.out.println("모텔 관리 프로그램");
		System.out.println("1. 입실    2. 퇴실    3. 방보기    4. 종료");
		System.out.print("선택 > ");
		int choice = sc.nextInt();
		return choice;
	}
	static void checkIn(int[] rooms) {
		System.out.print("몇번 방에 입실하시겠습니까?");
		int select = sc.nextInt();
		if(rooms[select - 1] == 0) {
			System.out.println((select) + "번 방에 입실하셨습니다.");
			rooms[select - 1] = 1;
		}else {
			System.out.println((select) + "번 방은 현재 손님이 있습니다.");
		}
	}
	static void checkOut(int[] rooms) {
		System.out.println("몇번 방에서 퇴실하시겠습니까?");
		int selNum = sc.nextInt();
		if(rooms[selNum - 1] == 1) {
			System.out.println(selNum + "번 방에서 퇴실하셨습니다.");
			rooms[selNum - 1] = 0;
		}else {
			System.out.println(selNum + "번 방은 현재 빈 방입니다.");
		}
	}
	static void showRooms(int[] rooms) {
		for(i = 0; i < 10; i++) {
			if(rooms[i] == 0) {
				System.out.println((i+1) + "번 방이 현재 비어있습니다.");
			}else {
				System.out.println((i+1) + "번 방에는 현재 손님이 있습니다.");
			}
		}
	}
}

