package com.kh.operator;

import java.util.Scanner;

public class Exam_Unary_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = 10;
//		int b = 20;
//		int c = 30;
		System.out.print("a�� ���� �Է����ּ��� : ");
		int a = sc.nextInt();
		
		System.out.print("b�� ���� �Է����ּ��� : ");
		int b = sc.nextInt();
		
		System.out.print("c�� ���� �Է����ּ��� : ");
		int c = sc.nextInt();
		
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		
		System.out.println("a�� �� : " + a);
		System.out.println("b�� �� : " + b);
		System.out.println("c�� �� : " + c);
	}

}
