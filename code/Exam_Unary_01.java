package com.kh.operator;

import java.util.Scanner;

public class Exam_Unary_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = 10;
//		int b = 20;
//		int c = 30;
		System.out.print("a의 값을 입력해주세요 : ");
		int a = sc.nextInt();
		
		System.out.print("b의 값을 입력해주세요 : ");
		int b = sc.nextInt();
		
		System.out.print("c의 값을 입력해주세요 : ");
		int c = sc.nextInt();
		
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		
		System.out.println("a의 값 : " + a);
		System.out.println("b의 값 : " + b);
		System.out.println("c의 값 : " + c);
	}

}
