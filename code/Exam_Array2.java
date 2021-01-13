package com.kh.array;

public class Exam_Array2 {

	public static void main(String[] args) {
		/*
		 * 길이가 100인 배열을 선언하고 1부터 100까지의 값을 
		 * 순서대로 배열 인덱스에 넣어 그 값을 출력하는 코드를 작성하시오.
		 */
		
		int [] arrs = new int[100];
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = i + 1;
			System.out.println(arrs[i] + " ");
		}
	}

}
