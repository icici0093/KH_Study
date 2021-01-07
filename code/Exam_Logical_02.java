package com.kh.operator;

import java.util.Scanner;

public class Exam_Logical_02 {
	public static void main(String[] agrs) {
		//입력한 정수값이 1~100 사이의 숫자인지 확인하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값을 입렵하세요 : ");
		int num = sc.nextInt();
		
		boolean isTrue = (num >= 1) && (num <= 100);
		System.out.println("1부터 100사이의 숫자인가? : " + isTrue);
		System.out.println((num >= 1) && (num <= 100) ? true : false);
	}
}
