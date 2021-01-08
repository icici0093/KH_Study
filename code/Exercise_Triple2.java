package com.kh.operator;

import java.util.Scanner;

public class Exercise_Triple2 {

	public static void main(String[] args) {
		// 삼항연산자 중첩 사용
		// 두 수와 '+' 또는 '-'를 입력받아 알맞은 계산 결과 출력하기
		// 단, '+', '-' 이외의 연산자 입력시 "잘못입력하셨습니다!" 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번쨰 값을 입력하세요 : ");
		int first = sc.nextInt();
		
		System.out.print("두번째 값을 입력하세요 : ");
		int second = sc.nextInt();
		
		System.out.print("연산자를 입력하세요 : ");
		char op = sc.next().charAt(0);
		
		String result = op == '+' ? first + second + "" : (ch == '-'? first-second + "" : "잘못입력하셨습니다!");
		
		System.out.println("계산 결과 : " + result);

	}

}
