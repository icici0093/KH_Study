package com.kh.operator;

import java.util.Scanner;

public class Exam_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int second = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (first + second));
		System.out.println("빼기 결과 : " + (first - second));
		System.out.println("나누기 결과 : " + (first / second));
		System.out.println("나머지 결과 : " + (first % second));
		System.out.println("곱하기 결과 : " + (first * second));
	}

}