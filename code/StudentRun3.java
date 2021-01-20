package org.kh.oop;

public class StudentRun3 {

	public static void main(String[] args) {
		StudentConsole2 sConsole = new StudentConsole2();
		종료 :
			while(true) {
				//F3 or command + click
			int choice = sConsole.showMenu();
			
			switch(choice) {
			case 1 : 
				sConsole.insertScore();
				break;
			case 2 :
				sConsole.printScore();
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

