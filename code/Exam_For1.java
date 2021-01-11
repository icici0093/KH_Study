package com.kh.control;

import java.util.Scanner;

public class Exam_For1 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		for( ; ; )
//		{
//			//무한반복
//			System.out.println("정수 하나 입력해주세요 : ");
//			sc.nextInt();
//		}
//		//가 0부터 9까지 실행코드를 반복 -> 총 10번
//		for(int i = 0; i < 10; i++) {
//			System.out.println("출력된 i의 값 : " + i);
//		}
//		for(int i = 9; i >= 0; i--) {
//			System.out.println("출력된 i의 값 : " + i);
//		}
		//i가 0부터 2씩 증가하면서 9까지 실행코드를 반복함
		for(int i = 0; i < 10; i+=2) {
			System.out.println("출력된 i의 값 : " + i);
		}
		
	}

}
