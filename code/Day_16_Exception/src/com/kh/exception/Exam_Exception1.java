package com.kh.exception;

import java.util.Scanner;

public class Exam_Exception1 {

	public static void main(String[] args) {
		/*
		 * 자바의 예외처리 
		 * 1. 컴파일 오류 
		 * - 문법에 맞지 않게 작성된 코드(;, 변수명 중복, 등등)
		 * - 컴파일할 때 발견 
		 * 2. 예외
		 * - 오동작이나 결괴에 악영향을 미칠 수 있는 실행 중 발생한 오류 
		 * ex) 0으로 나눌 때 
		 * 		배열의 인덱스보다 큰 원소를 접근하려고 할 때 
		 * 		존재하지 않는 파일을 읽으려고 할 때
		 * 		정수 입력을 기다리는 코드가 실행되고 있는데 문자가 입력된 경우 
		 * - 자바 코드 예외 처리 가능  
		 */
		
		Scanner sc = new Scanner(System.in);
		int num = 25;
		
		while(true) {
		System.out.print("숫자 하나 입력해주세요: ");
		int input = sc.nextInt();
		try {
			System.out.println(num + "을 " + input + "으로 나누면 몫은 " + (num/input) + "입니다.");
			break;
		} catch(ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
		}
	}

}
}
