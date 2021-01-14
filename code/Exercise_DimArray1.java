package com.kh.dimarray;

public class Exercise_DimArray1 {

	public static void main(String[] args) {
		// 5  4  3  2  1 
		//10  9  8  7  6 
		//15 14 13 12 11 
		//20 19 18 17 16 
		//25 24 23 22 21 
		int[][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = arrs[i].length - 1; j >= 0 ; j--) {
				arrs[i][j] = k++;
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
