package com.kh.array;

import java.util.Scanner;

public class Exercise_Array1 {

	public static void main(String[] args) {
		// 양의 정수 5개를 입력받아 배열에 저장하고
		// 제일 큰 수를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int [] arrs = new int[5];
		int max = arrs[0];
		System.out.println("양의 정수 5개 입력 : ");
		for(int i = 0; i < arrs.length; i++) {
			//입력받은 값 배열에 저장 
			arrs[i] = sc.nextInt();
			//가장 큰 수인지 판별 
			if(arrs[i] > max) {
				max = arrs[i];
			}
		}
		//가장 큰 수 출력
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
	}

}
