package com.kh.array;

public class Exam_Array6 {

	public static void main(String[] args) {
		// 깊은 복사 
		int [] arr1 = {1, 2, 3, 4};
		int [] arr2 = new int[4]; // 새로운 공간 할당 
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i]; // arr1의 값을 arr2로 복사 
		}
		arr2[0] = 5;
		
		System.out.println(arr1[0]);
	}

}
