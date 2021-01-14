package com.kh.dimarray;

public class Exam_DimArray2 {

	public static void main(String[] args) {
		// 5행 5열 2차원 선언 후 
		// 0값부터 1씩 증가하면서 초기화하고 출력 
		
		int[][] arrs = new int[5][5];
		int k = 0;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ",arrs[i][j]);
			}
			System.out.println();
		}
	}

}
