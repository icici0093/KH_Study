package com.kh.array;

import java.util.Arrays;

public class Exam_ArraySort6 {

	public static void main(String[] args) {
		// Array 클래스에 있는 명령어(메소드)로 정렬 
		
		int [] arrs = {2, 5, 4, 1, 3};
		
		// 정렬 
		// 내림차순이 없기때문에 새로운 배열을 만들어 거꾸로 넣어야 함. 
		Arrays.sort(arrs);
		// 출력 
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		System.out.println();
	}

}
