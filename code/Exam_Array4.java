package com.kh.array;

public class Exam_Array4 {

	public static void main(String[] args) {
		//배열과 for-Each문 
		int [] nums = {1, 2, 3, 4, 5};
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println();
		System.out.println("for-each문 사용");
		for(int k : nums) {
			System.out.println(k);
		}
		System.out.println();
		String [] fruits = {"딸기", "복숭아", "키위", "사과", "바나나"};
		for(String fruitsName : fruits) {
			System.out.println(fruitsName);
		}
	}

}
