package member.run;

import member.controller.MemberController;
import member.view.MemberView;

public class Run {
//	RUN -> (VIEW) -> CONTROLLER -> SERVICE -> DAO
//	DAO -> SERVICE -> CONTROLLER -> VIEW
	public static void main(String[] args) {
		MemberView view = new MemberView();
		MemberController mController = new MemberController();
		
		종료: while (true) {
			int choice = view.mainMenu();
			switch (choice) {
			case 0:
				break 종료;
			case 1:
				mController.printAll();
				break;
			case 2:
				mController.printOne(view.inputMemberId()); // 아이디를 입력받아 검색 (리턴)
				break;
			case 3:
				mController.printOneByName(view.inputMemberName());
				break;
			case 4:
				mController.registerMemeber(view.inputMember());
				break;
			case 5:
				mController.modifyMember(view.inputModifyMember());
				break;
			case 6: 
				mController.deleteMember(view.inputMemberId());
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
