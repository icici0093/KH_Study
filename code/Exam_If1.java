package com.kh.control;

import java.util.Scanner;

public class Exam_If1 {

	public static void main(String[] args) {
		// 입력받은 양수, 0, 음수인지 판별하여 출력하시오
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
//		if( num > 0 ) {
//			System.out.println("양수입니다.");
//		}
//		if( num == 0 ) {
//			System.out.println("0입니다.");
//		}
//		if( num < 0 ) {
//			System.out.println("음수입니다.");
//		}
//		if( num > 0 ) {
//			System.out.println("양수입니다.");
//		}else {
//			System.out.println("0이거나 음수입니다.");
//		}
		if( num > 0 ) {
			System.out.println("양수입니다.");
		}else if( num == 0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("음수입니다.");
		}
		/*
		 * 조건식의 결과값이 true면 중괄호({})안의 코드를 실행
		 * 조건식의 결과값이 false면 코드를 무시하고 넘어감
		 */
	}

}
