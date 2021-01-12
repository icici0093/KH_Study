package com.kh.control;

public class Exercise_For5 {

	public static void main(String[] args) {
		/*
		 * 중첩 for문 별찍기
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
		for(int i = 10; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i = 9; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
