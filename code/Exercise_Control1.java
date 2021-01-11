package com.kh.control;

import java.util.Scanner;

public class Exercise_Control1 {

	public static void main(String[] args) {
		//키보드로 정수 두개를 받아 작은 수부터 큰 수까지의 모든 정수의 합을 구하여 출력하시오 
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int second = sc.nextInt();
		
		int sum = 0;
		int max = 0;
		int min = 0;
		
		if( first > second) {
			min = second;
			max = first;
		}else {
			min = first;
			max = second;
		}
		for(int i = min; i <= max; i++) {
			sum += i;
		}
//		if ( first > second ) {
//			for( int i = second; i <= first; i++) {
//				sum += i;
//			}
//		}else if (first < second ) {
//				for( int i = first; i <= second; i++) {
//					sum += i;
//				}
//			}
		System.out.printf("%d에서 %d까지의 합 : %d", first, second, sum);
		}
	}
