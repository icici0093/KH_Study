package com.kh.control;

public class Exam_For2 {
	public static void main(String[] args) {
//		for(int i = 0; i<10; i++) {
//			for(int j = 0; j <10; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 10; i>0; i--) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}