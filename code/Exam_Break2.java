package com.kh.control;

import java.util.Scanner;

public class Exam_Break2 {

	public static void main(String[] args) {
		// 1부터 사용자가 입력한 숫자까지의 합
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 0;
		while(true) {
			sum += i;
			if(i == num)
				break;
			i++;
		}
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
	}

}
