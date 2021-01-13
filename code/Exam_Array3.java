package com.kh.array;

public class Exam_Array3 {

	public static void main(String[] args) {
		/*
		 * 길이가 5인 String 배열을 선언하고 "딸기", "복숭아" 
		 * "키위", "사과", "바나나", 로 초기화 한 후, 배열 인덱스를 활용해서 
		 * 바나나를 출력해보세요~!! 
		 */
		String fruits[] = {"딸기", "복숭아", "키위", "사과", "바나나"};
//		String [] fruits = new String[5];
//		fruits[0] = "딸기";
//		fruits[1] = "복숭아";
//		fruits[2] = "키위";
//		fruits[3] = "사과";
//		fruits[4] = "바나나";
		
		System.out.println(fruits[4]);
		System.out.println();
		for(int i = 0; i < fruits.length; i++) {
			if(fruits[i] == "바나나") {
				System.out.println(fruits[i]);
			}
		}
//		if(fruits[0].equals("바나나")) {
//			System.out.println(fruits[0]);
//		}else if(fruits[1].equals("바나나")) {
//			System.out.println(fruits[1]);
//		}else if(fruits[4].equals("바나나")) {
//			System.out.println(fruits[4]);
//		}
	}
}