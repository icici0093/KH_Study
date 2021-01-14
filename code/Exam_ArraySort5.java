package com.kh.array;

public class Exam_ArraySort5 {

	public static void main(String[] args) {
		// 버블정렬(Bubble Sort)
		// 인접한 두개의 원소를 검사하여 정렬하는 방법 
		// 구현이 쉽다는 장점이 있고, 이미 정렬된 데이터를 정렬할 때 가장 빠름. 
		// 다른 정렬에 비해 정렬 속도가 느리며, 역순으로 정렬할 때 가장 느림.
		
		int [] arrs = {2, 5, 4, 1, 3};
		
		for(int i = 0; i < arrs.length - 1; i++) {
			for(int j = 0; j < (arrs.length - 1) - i; j++) {
				if(arrs[j] > arrs[j+1]) {
					System.out.println("교환 발생");
					int temp = arrs[j];
					arrs[j] = arrs[j+1];
					arrs[j+1] = temp;
				}
			}
		}
		//출력 
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}

}
