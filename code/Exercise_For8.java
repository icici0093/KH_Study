package com.kh.control;

public class Exercise_For8 {

	public static void main(String[] args) {
		// 0시 0분부터 23시 59분까지 출력하기!
		
		for(int hour = 0; hour < 24; hour++) {
			for(int min = 0; min < 60; min++ ) {
				System.out.printf("%2d시 %2d분\n", hour, min);
			}
		}
	}

}
