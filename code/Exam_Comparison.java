package com.kh.operator;

public class Exam_Comparison {

	public static void main(String[] args) {
		/* 
		 * �񱳿����� (���迬����)
		 * - �� ���� ���ϴ� ������, �ٸ� ���� ���� �����ڶ�� ��.
		 * - �� �����ڴ� ������ �����ϸ� true, �ƴϸ� false�� ��ȯ��.
		 */
		
		int a = 50;
		int b = 30;
		
		boolean result1, result2, result3;
		
		result1 = (a < b);
		result2 = (a == b);
		result3 = (a != b);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		/* 
		 * ��������ڿ� �񱳿����ڸ� �Բ� ���� ����
		 * a�� Ȧ���ΰ�? b�� ¦���ΰ�? -> true or false
		 */
		
		System.out.println("a�� Ȧ���ΰ�? : " + (a%2 != 0));
		System.out.println("b�� ¦���ΰ�? : " + (b%2 == 0));
		
	}

}
