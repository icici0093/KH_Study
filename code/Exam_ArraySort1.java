package com.kh.array;

public class Exam_ArraySort1 {

	public static void main(String[] args) {
		
		int num1 = 54;
		int num2 = 22;
		int temp;
		
		System.out.println("==== 변경 전 ====");
		System.out.printf("num1 : %d, num2 : %d \n", num1, num2);
		
		//자리 변경 
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("==== 변경 후 ====");
		System.out.printf("num1 : %d, num2 : %d", num1, num2);
	}

}
