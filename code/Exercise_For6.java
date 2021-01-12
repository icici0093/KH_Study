package com.kh.control;

import java.util.Scanner;

public class Exercise_For6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	
		for(int i = 0; i < 6; i++){
			for(int j = 5; j > 0; j--) {
				if(i < j ) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}for(int k = 0; k < i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
