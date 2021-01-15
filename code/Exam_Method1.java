package com.kh.method;

public class Exam_Method1 {
	public static void main(String[] args) {
		// 반환형 O, 매개변수 O 
		System.out.println(calcNum(1));
		// 반환형 X, 매개변수 O
		calcNumPrint(1);
		// 반환형 O, 매개변수 X
		System.out.println(calcNum());
		// 반환형 X, 매개변수 X
		calcNumPrint();
	}
	
	static int calcNum(int x) {
		return 3*x+2;
	}
	
	static void calcNumPrint(int x) {
		System.out.println(3*x+2);
	}
	
	static int calcNum() {
		return 5;
	}
	
	static void calcNumPrint() {
		System.out.println(5);
	}
}
