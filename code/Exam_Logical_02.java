package com.kh.operator;

import java.util.Scanner;

public class Exam_Logical_02 {
	public static void main(String[] agrs) {
		//�Է��� �������� 1~100 ������ �������� Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		boolean isTrue = (num >= 1) && (num <= 100);
		System.out.println("1���� 100������ �����ΰ�? : " + isTrue);
		System.out.println((num >= 1) && (num <= 100) ? true : false);
	}
}
