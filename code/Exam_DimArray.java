package com.kh.dimarray;

public class Exam_DimArray {
	public static void main(String[] args) {
		int [][] arrs = new int[4][4];
		int k = 0;
		
		// for문을 이용하여 초기화 - 입력 
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		// for문을 이용하여 출력 
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
}
