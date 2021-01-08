package com.kh.operator;

import java.util.Scanner;

public class Exercise_Triple1 {

	public static void main(String[] args) {
		// 삼항연산자 중첩 사용
		// 입력받은 정수가 양수, 0, 음수인지 판별 후 출력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = num < 0 ? "음수" : (num == 0 ? "0" : "양수");
		
		System.out.println("양수일까? 음수일까? 정체가 뭘까? : " + result + "입니다.");

	}

}
