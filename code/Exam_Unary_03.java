package com.kh.operator;

public class Exam_Unary_03 {

	public static void main(String[] args) {
		int x = 100;
		int y = 33;
		int z = 0;
		
		x--;
		z = x-- + --y;
		x = 99 + x++ + x; //단항 연산자의 우선순위가 사칙연산보다 높다 ( 99 + 98 + 99 )
		y = y-- + y + ++y;
	
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
		System.out.println("z의 값 : " + z);
	}

}
