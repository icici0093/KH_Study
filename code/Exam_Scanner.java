package com.kh;

import java.util.Scanner;

public class Exam_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("int를 입력해주세요 : ");
		//System.out.println(sc.nextInt()); 
		int iNum = sc.nextInt();
		//System.out.println(iNum);
		
		System.out.print("float를 입력해주세요 : ");
		float fNum = sc.nextFloat();
		
		System.out.print("double을 입력해주세요 : ");
		double dNum = sc.nextDouble();
		
		System.out.print("char를 입력해주세요 : ");
		char ch = sc.next().charAt(0);
		/* sc.next()는 문자열을 입력 받고
		charAt(0)은 입력받은 문자열의 첫번째 문자 하나를 잘라 가져옴 */
		
		/* 문자열 입력 받기
		 * 1. sc.next() : 공백을 입력받지 않음
		 * 홍 길 동 -> 홍, 이름 입력 받을 때
		 * 2. sc.nextLine() : 공백, 개행을 입력받음
		 * 홍 길 동 -> 홍 길 동, 주소 입력 받을 때
		 */
		sc.nextLine(); //개행 제거
		System.out.print("String을 입력해주세요 : ");
		String str = sc.nextLine();
		
		System.out.println(); //개행
		
		System.out.println("입력한 int는 : " + iNum);
		System.out.println("입력한 float는 : " + fNum);
		System.out.println("입력한 double은 : " + dNum);
		System.out.println("입력한 char는 : " + ch);
		System.out.println("입력한 String은 : " + str);
	}
}
