package com.kh;

import java.util.Scanner;

public class Exam_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("int�� �Է����ּ��� : ");
		//System.out.println(sc.nextInt()); 
		int iNum = sc.nextInt();
		//System.out.println(iNum);
		
		System.out.print("float�� �Է����ּ��� : ");
		float fNum = sc.nextFloat();
		
		System.out.print("double�� �Է����ּ��� : ");
		double dNum = sc.nextDouble();
		
		System.out.print("char�� �Է����ּ��� : ");
		char ch = sc.next().charAt(0);
		/* sc.next()�� ���ڿ��� �Է� �ް�
		charAt(0)�� �Է¹��� ���ڿ��� ù��° ���� �ϳ��� �߶� ������ */
		
		/* ���ڿ� �Է� �ޱ�
		 * 1. sc.next() : ������ �Է¹��� ����
		 * ȫ �� �� -> ȫ, �̸� �Է� ���� ��
		 * 2. sc.nextLine() : ����, ������ �Է¹���
		 * ȫ �� �� -> ȫ �� ��, �ּ� �Է� ���� ��
		 */
		sc.nextLine(); //���� ����
		System.out.print("String�� �Է����ּ��� : ");
		String str = sc.nextLine();
		
		System.out.println(); //����
		
		System.out.println("�Է��� int�� : " + iNum);
		System.out.println("�Է��� float�� : " + fNum);
		System.out.println("�Է��� double�� : " + dNum);
		System.out.println("�Է��� char�� : " + ch);
		System.out.println("�Է��� String�� : " + str);
	}
}
