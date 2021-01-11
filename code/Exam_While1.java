package com.kh.control;

public class Exam_While1 {

	public static void main(String[] args) {
		int i = 0; //초기식 
		while(i < 10) { // 조건식 
			System.out.println("출력된 i의 값 : " + i);
			i++; //증감식 
		}
		System.out.println();
		int j = 9;
		while(j>= 0) {
			System.out.println("출력된 j의 값 : " + j);
			j--;
		}
	}

}
