package com.kh.control;

import java.util.Scanner;

public class Exercise_switch1 {

	public static void main(String[] args) {
		/*
		 * 1~3 사이의 정수를 입력받아
		 * 1인 경우 빨간색입니다. 2인 경우 파란색입니다.
		 * 3인 경우 초록색입니다.
		 * 그 외 정수를 입력할경우 잘못입력하셨습니다를 출력하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("빨간색입니다.");
		break;
		case 2 : System.out.println("파란색입니다.");
		break;
		case 3 : System.out.println("초록색입니다.");
		break;
		default : System.out.println("잘못입력하셨습니다.");
		}

	}

}
