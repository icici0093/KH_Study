package com.kh.operator;

import java.util.Scanner;

public class Exam_Losical_03 {

	public static void main(String[] args) {
		// �Է��� ���� ���� �빮������ Ȯ���Ͽ� ��� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		char ch = sc.next().charAt(0);
		
		boolean c = (ch >= 65) && (ch <= 90);
		
		System.out.println("�Է��� ���� �빮���ϱ��? : " + c);
	}

}
