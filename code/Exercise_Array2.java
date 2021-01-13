package com.kh.array;

import java.util.Scanner;

public class Exercise_Array2 {
	public static void main(String[] args) {
		/*
		 * 양의 정수 5개를 입력받아 배열에 저장하고
		 * 입력 받은 값의 평균을 구하는 프로그램을 
		 * 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int [] arrs = new int[5];
		int sum = 0;
		System.out.println("양의 정수 5개를 입력하시오.");
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
			sum += arrs[i];
		}
		System.out.println("입력한 값의 평균은 : " + (double)(sum/arrs.length));
	}
}
