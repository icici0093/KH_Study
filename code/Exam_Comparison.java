package com.kh.operator;

public class Exam_Comparison {

	public static void main(String[] args) {
		/* 
		 * 비교연산자 (관계연산자)
		 * - 두 값을 비교하는 연산자, 다른 말로 관계 연산자라고도 함.
		 * - 비교 연산자는 조건을 만족하면 true, 아니면 false를 반환함.
		 */
		
		int a = 50;
		int b = 30;
		
		boolean result1, result2, result3;
		
		result1 = (a < b);
		result2 = (a == b);
		result3 = (a != b);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		/* 
		 * 산술연산자와 비교연산자를 함께 쓰는 예제
		 * a는 홀수인가? b는 짝수인가? -> true or false
		 */
		
		System.out.println("a는 홀수인가? : " + (a%2 != 0));
		System.out.println("b는 짝수인가? : " + (b%2 == 0));
		
	}

}
