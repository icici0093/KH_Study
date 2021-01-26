package com.kh.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam_Exception5 {
	static Scanner sc = new Scanner(System.in);
	
	public static void menuPrint() {
		System.out.println("======= 메뉴 선택 =======");
		System.out.println("1. 반갑습니다. 출력");
		System.out.println("2. 잘지내세요. 출력");
		System.out.println("3. 또 만나요. 출력");
		System.out.print("입력 : ");
	}
	public static void practicePrint(int choice) {
		switch(choice) {
		case 1: System.out.println("반갑습니다.");
		break;
		case 2: System.out.println("잘지내세요.");
			break;
		case 3: System.out.println("또 만나요.");
			break;
		default : System.out.println("1~3중 선택해주세요.");
		}
	}
	public static void main(String[] args) {
		int choice = 0;
		menuPrint();
		try {
			choice = sc.nextInt();
			practicePrint(choice);
		}catch( ArithmeticException e) {
			System.out.println("0으로 나누지마세욧");
		}catch( NullPointerException ex) {
			System.out.println("값이 널입니다");
		}catch( InputMismatchException ex2) {
			System.out.println("입력값을 확인하세요.");
		}finally { // finally는 Exception이 발생하든 안하든 실행되는 블록
					  // 사용한 자원(스트림)을 닫거나 반납하는 코드를 보통 작성함 
			System.out.println("입력한 값은 : " + choice);
			System.out.println("종료되었습니다.");
			sc.close();
		}
	}

}
