package com.kh.array;

public class Exam_Array5 {

	public static void main(String[] args) {
		// 얕은 복사 
		// 두개의 변수가 하나의 배열을 가리키고 있음. 
		int [] arr1 = new int[4];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i+1;
		}
		int [] arr2 = arr1;
		
		arr2[0] = 5;
		System.out.println(arr1[0]);
	
	}

}
