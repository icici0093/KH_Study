package com.kh.dimarray;

public class Exercise_DimArray6 {

	public static void main(String[] args) {
		//1 10 11 20 21 
 		//2  9 12 19 22 
 		//3  8 13 18 23 
 		//4  7 14 17 24 
 		//5  6 15 16 25 

		int[][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			if(i%2==0) {
				for(int j = 0; j < arrs[i].length; j++) {
					arrs[j][i] = k;
					k++;
				}
			}else {
				for(int j = arrs[i].length-1; j >= 0; j--) {
				arrs[j][i] = k;
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
