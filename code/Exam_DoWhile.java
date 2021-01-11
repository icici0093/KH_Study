package com.kh.control;

import java.util.Scanner;

public class Exam_DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		do {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			sum = sum + num;
		}while(num != -1);//조건식 
		System.out.println("입력한 수의 합 : " + sum);
	}

}
