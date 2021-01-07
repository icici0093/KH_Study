package com.kh.operator;

import java.util.Scanner;

public class Exam_Triple {
	public static void main(String[] args) {
		/*
		 * 삼항연산자
		 * 항목이 3개
		 * (조건식) ? 참 : 거짓
		 * - 조건식은 반드시 true or false가 나오게 작성
		 * - 비교/논리연산자 주로 사용
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = (num%2 == 0) ? "짝수" : "홀수";
		System.out.println(num + "은/는 " + result + "다.");
		
		// 삼항연산자로 val값이 양수인지 음수인지 판별 후 출력
		System.out.print("숫자를 입력하세요 : ");
		int val = sc.nextInt();
	
		String str = (val > 0) ? "양수" : "음수";
		System.out.println(val + "은/는 " + str + "다.");		
	}
}
