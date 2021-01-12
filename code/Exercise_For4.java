package com.kh.control;

import java.util.Scanner;

public class Exercise_For4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		for(int j = dan; j <= 9; j++) {
			for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d \n",	 j, i, j*i);
			}
			System.out.println();
		}
	}
}
