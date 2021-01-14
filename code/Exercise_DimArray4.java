package com.kh.dimarray;

public class Exercise_DimArray4 {

	public static void main(String[] args) {
		//1  2  3  4  5 
		//10  9  8  7  6 
		//11 12 13 14 15 
		//20 19 18 17 16 
		//21 22 23 24 25 
		int[][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			if(i%2==0) {
				for(int j = 0; j < arrs[i].length; j++) {
					arrs[i][j] = k;
					k++;
				}
			}else {
				for(int j = arrs[i].length-1; j >= 0; j--) {
				arrs[i][j] = k;
				k++;
			}
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
