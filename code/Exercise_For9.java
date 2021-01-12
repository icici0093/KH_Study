package com.kh.control;

public class Exercise_For9 {
	public static void main(String[] args) {
		//2단 옆에 3단
		
		for(int num = 1; num < 10; num++) {
			for(int dan = 2; dan < 10; dan++) {
//				System.out.print(" | " + dan + " * " + num + " = " + (dan*num) + " | ");
				System.out.printf("%d * %d = %2d         ", dan, num, (dan*num));
			}
			System.out.println();
		}
	}
}
