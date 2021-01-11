package com.kh.control;

import java.util.Scanner;

public class Exercise_While4 {

	public static void main(String[] args) {
		/*
		 * while문을 이용하여 -1이 입력될 때까지
		 * 입력한 정수의 합을 출력하시오. 
		 */
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		int input = 0;
		int total = 0;
		while(check) {
			System.out.print("입력 : ");
			input = sc.nextInt();
			//-1이 입력되었을 때 check값을 false로 변경
			//while문이 더이상 반복되지 않음
			if(input == -1) {
				check = false;
			}else {
				total = total + input;
			}
		}
		System.out.println("입력하신 정수의 합 : " + total);
	}

}
