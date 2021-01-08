package com.kh.control;

import java.util.Scanner;

public class Exercise_switch2 {

	public static void main(String[] args) {
		// 정수 두개와 연산기호 문자 1개를 입력받아서
		// 연산기호문자(+,-,*,/)에 해당하는 계산을 수행하고 출력하세요
		// 단 그외에 문자를 입력할 경우 연산자를 잘못 입력하셨습니다를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요.");
		int first = sc.nextInt();
		
		System.out.println("두번째 정수를 입력하세요.");
		int second = sc.nextInt();
		
		System.out.println("연산자를 입력하세요.(+,-,*,/)");
		char op = sc.next().charAt(0);
	
		switch(op) {
		case '+' :  System.out.println("계산 결과 : " +  (first + second));
		break;
		case '-' : System.out.println("계산 결과 : " +  (first - second));
		break;
		case '*' : System.out.println("계산 결과 : " + (first * second));
		break;
		case '/' : System.out.println("계산 결과 : " + (first / second));
		break;
		default : System.out.println("연산자를 잘못 입력하셨습니다.");
		}

	}

}
