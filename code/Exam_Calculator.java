package com.kh.operator;

import java.util.Scanner;

public class Exam_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int first = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int second = sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + (first + second));
		System.out.println("���� ��� : " + (first - second));
		System.out.println("������ ��� : " + (first / second));
		System.out.println("������ ��� : " + (first % second));
		System.out.println("���ϱ� ��� : " + (first * second));
	}

}