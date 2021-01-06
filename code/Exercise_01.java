package com.kh;

public class Exercise_01 {

	/* 각 자료형별 변수를 만들고 초기화한 후 그 값을
	 * 출력하는 코드를 작성하시오.
 	 * 단, 변수를 이용하여 출력하시오.
	 * 정수형 100, 9999억
	 * 실수 486.520(float), 567.890123
	 * 문자 A
	 * 문자열 Hello world
	 * 논리 true 
	 */
	
	public static void main(String[] args) {
		
		int iNum = 100;
		long lNum = 999900000000l;
		float fNum = 486.520f;
		double dNum = 567.890123;
		char ch = 'A';
		String str = "Hello world";
		boolean bool = true;
		
		System.out.println("정수 : " + iNum);
		System.out.println("정수(long) : " + lNum);
		System.out.println("실수(float) : " +fNum);
		System.out.println("실수 : " + dNum);
		System.out.println("문자 : " + ch);
		System.out.println("문자열 : " + str);
		System.out.println("논리 : " + bool);
	}
}
