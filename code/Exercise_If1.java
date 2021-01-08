package com.kh.control;

import java.util.Scanner;

public class Exercise_If1 {

	public static void main(String[] args) {
		/*
		 *  키보드로 정수를 입력받고 입력받은 정수가 양수이면 짝수일때만
		 *  "짝수다"를 출력하고 짝수가 아니면 "홀수다"를 출력하세요
		 *  양수가 아니면 "양수만 입력해주세요"를 출력하세요
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if ( num <= 0) {
			System.out.println("양수를 입력해주세요.");
		}else if ( num%2 == 0 ) {
			System.out.println("짝수다!");
		}else {
			System.out.println("홀수다!");
		}
		
		if( num > 0 && num%2 == 0 ) {
				System.out.println("짝수다!");
			}else if(num > 0 && num%2 != 0 ) {
				System.out.println("홀수다!");
		}else {
			System.out.println("양수를 입력해주세요");
		}
		
		if( num > 0 ) {
			if( num%2 == 0 ) {
				System.out.println("짝수다!");
			}else {
				System.out.println("홀수다!");
			}
		}else {
			System.out.println("양수를 입력해주세요");
		}
	}
	
}
