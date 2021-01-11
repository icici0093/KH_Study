package com.kh.control;

import java.util.Scanner;

public class Exercise_While3 {

	public static void main(String[] args) {
		/*
		 * while문을 이용하여 -1이 입력될 때까지
		 * 입력한 정수의 합을 출력하시오. 
		 */
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		while(i != -1) {
			System.out.print("정수를 입력해주세요 : ");
			i = sc.nextInt();
			
			j+=i;
			}
		System.out.println("입력된 정수의 총 합 : " + j);
	}

}
