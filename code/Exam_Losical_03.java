package com.kh.operator;

import java.util.Scanner;

public class Exam_Losical_03 {

	public static void main(String[] args) {
		// 입력한 문자 값이 대문자인지 확인하여 결과 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		char ch = sc.next().charAt(0);
		
		boolean c = (ch >= 65) && (ch <= 90);
		
		System.out.println("입력한 값은 대문자일까요? : " + c);
	}

}
