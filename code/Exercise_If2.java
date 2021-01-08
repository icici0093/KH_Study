package com.kh.control;

import java.util.Scanner;

public class Exercise_If2 {
	public static void main(String[] args) {
		/*
		 * 1. 입력
		 * 2. 수정
		 * 3. 조회
		 * 4. 삭제
		 * 7. 종료
		 * 메뉴 번호를 입력하세요 : 3
		 * 조회메뉴입니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		if( num == 1 ) {
			System.out.println("조회메뉴입니다.");
		} else if( num == 2 ) {
			System.out.println("수정메뉴입니다.");
		} else if( num == 3 ) {
			System.out.println("조회메뉴입니다.");
		} else if( num == 4 ) {
			System.out.println("삭제메뉴입니다.");
		} else if( num == 7 ) {
			System.out.println("프로그램이 종료됩니다.");
		} else {
			System.out.println("잘못입력하셨습니다.");			
		}
	}
}
