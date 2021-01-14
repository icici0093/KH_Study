package com.kh.dimarray;

public class Exercise_DimArray3 {

	public static void main(String[] args) {
		
		int[][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = arrs[i].length - 1; j >= 0 ; j--) {
				arrs[j][i] = k++;
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
