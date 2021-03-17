package net.kh.member.run;

import java.util.Scanner;

import net.kh.member.controller.MemberController;
import net.kh.member.view.MemberView;

public class Run {
	public static void main(String [] args) {
		MemberView view = new MemberView(); 
		MemberController mController = new MemberController();
		done :
		while(true) {
			int choice = view.mainMenu();
			switch(choice) {
			case 0: 
				break done;
			case 1: 
				mController.printAll();
				// view.printAll();
				break;
			case 2: 
				mController.printOne(view.inputMemberId());
				break;
			case 3: 
				mController.printOneByName(view.inputMemberName());
				break;
			case 4: 
				mController.registerMember(view.inputMember());
				break;
			case 5: 
				mController.modifyMember(view.modifyMember());
				break;
			case 6: 
				mController.deleteMember(view.inputMemberId());
				break;
			default : System.out.println("번호를 잘못 선택하셨습니다.");
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}

