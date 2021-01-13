package com.kh.array;

public class Exam_Array1 {
	public static void main(String[] args) {
		int [] nums = new int[5];
		System.out.printf("할당 후 초기값 : %d %d %d %d %d", nums[0], nums[1], nums[2], nums[3], nums[4]);
		
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		nums[4] = 5;
		System.out.println();
		System.out.printf("값 초기화 : %d %d %d %d %d", nums[0], nums[1], nums[2], nums[3], nums[4]);
		System.out.println();
		System.out.println();
		System.out.println("for문 이용");
		
		int [] arrs = new int[5];
		System.out.print("할당 후 초기값 : ");
		// for문을 이용하여 값을 출력 
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		// for문을 이용하여 값을 입력 
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = i+1;
		}
		System.out.println();
		System.out.print("값 초기화 : ");
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}
}
