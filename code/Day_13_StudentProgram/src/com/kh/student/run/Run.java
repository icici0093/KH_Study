package com.kh.student.run;

import com.kh.student.view.StudentView;

public class Run {

	public static void main(String[] args) {
		StudentView view = new StudentView();
		
		종료 :
		while(true) {
			int choice = view.mainMenu();
			switch(choice) {
			case 1 : view.printAll();
				break;
			case 2 :
				break;
			case 3 : view.insertStudent();
				break;
			case 4 :
				break;
			case 5 :
				break;
			case 9 :
				break 종료;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
