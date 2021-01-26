package com.kh.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam_Exception3 {

	public static void main(String[] args) {
		//InputMismatchExeption
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum = 0;
		int num = 0;
		for(int i = 0; i < 3; i++) {
			System.out.print((i+1) + " >> ");
			try {
				num = sc.nextInt(); // try에서도 지역변수 선언이 됨
			}catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				sc.next(); // 입력스트림에 있는 정수가 아닌 토큰을 버림.
				i--; // 인덱스가 증가되지 않도록 미리 감소 
				continue; // 다음 루트
			}
			sum += num;
		}
		System.out.println("합은 " + sum);
	}

}
