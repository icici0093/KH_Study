package org.kh.oop;

public class StudentRun {

	public static void main(String[] args) {
		StudentList sList = new StudentList();
		종료 :
			while(true) {
				//F3 or command + click
			int choice = sList.showMenu();
			
			switch(choice) {
			case 1 : 
				sList.insertScore();
				break;
			case 2 :
				sList.printScore();
				break;
			case 3 : 
				break 종료;
			default : System.out.println("잘못 입력하셨습니다.");
				break;
			}
			}
			System.out.println("프로그램이 종료되었습니다.");
		}
	}

