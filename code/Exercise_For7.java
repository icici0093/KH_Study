package com.kh.control;

import java.util.Scanner;

public class Exercise_For7 {

	public static void main(String[] args) {
		// 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 
		// 출력하는 프로그램을 작성하시오. 
		
		for(int first = 1; first <=6; first++) {
			for(int second = 1; second <= 6; second++) {
				if( first + second == 6 ) {
					System.out.println(first + " + " + second + " = " + (first+second));
				}
			}
		}
		/*
		 * 2~12 사이의 수를 입력받아서
		 * 해당 숫자의 합이 나오는 경우의 수를 출력하는 프로그램을 작성하시오. 
		 * 숫자입력 : 6 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		for(int i = 1; i < 12; i++) {
			for(int j = 1; j < 12; j++) {
				if(i + j == num) {
					System.out.println(i + " + " + j + " = " + (i+j));
				}
			}
		}
	}

}
