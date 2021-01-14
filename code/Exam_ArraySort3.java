package com.kh.array;

public class Exam_ArraySort3 {

	public static void main(String[] args) {
		// 정렬, 정렬을 하는 순서, 절차
		// 문제해결 알고리즘, 정렬 알고리즘 
		// {2, 5, 4, 1, 3}
		// -> 오름차순으로 정렬
		// 삽입정렬, 선택정렬, 버블정렬 
		
		// 삽입정렬(Insertion Sort) : 정렬 알고리즘에서 가장 간단하고 기본이 되는 알고리즘 
		// 배열의 n번 인덱스값을 0번 ~ n-1번 인덱스까지 비교 (두 가지 for문이 필요함)
		
		int [] arrs = {2, 5, 4, 1, 3};
		//오름차순 정렬 (삽입정렬)
		for(int i = 1; i < arrs.length; i++) {
			for(int j = i; j > 0; j--) { // 왼쪽에 있는 값과 비교를 하기 때문에 감소로
				if( arrs[j-1] > arrs[j] ) {
					System.out.println("교환발생");
					int temp = arrs[j-1];
					arrs[j-1] = arrs[j];
					arrs[j] = temp;
				}
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		
		
	}

}
