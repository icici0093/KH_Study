package com.kh.control;

public class Exercise_While1 {
	public static void main(String[] args) {
		//while문을 이용하여 1~10사이의 홀수를 출력하시오.
		
		int i = 1;
		while(i < 10) {
			System.out.println("출력된 i의 값 : " + i);
			i += 2;
		}
	}
}
