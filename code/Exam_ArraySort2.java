package com.kh.array;

public class Exam_ArraySort2 {

	public static void main(String[] args) {
		int [] nums = {2, 1, 3};
		// -> {1, 3, 2}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		int temp = nums[0];
		
		nums[0] = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;
		System.out.println();
		for(int num : nums) {
			System.out.print(num + " ");
		}
	}

}
