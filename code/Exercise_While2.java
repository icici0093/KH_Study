package com.kh.control;

import java.util.Scanner;

public class Exercise_While2 {

	public static void main(String[] args) {
		/*
		 * 정수를 하나 입력받아 그 수가 1 ~ 9 사이의 수일때만
		 * 그 수의 구구단을 출력하시오.
		 * 단, 조건이 맞지 않으면 " 1 ~ 9 사이의 양수를 입력하여야 합니다"를 출력하시오
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요(1~9) : ");
		int i = sc.nextInt();
		if(i>10) {
			System.out.println("1 ~ 9 사이의 양수를 입력하여야 합니다");
		} else {
			int j = 0;
			while(j<10) {
				System.out.println(i + " * " + j + " = " + i * j);
				j++;
			}
		}
	}

}
