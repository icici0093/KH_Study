package com.kh;

public class Exam_Casting {

	public static void main(String[] args) {
		int a = 10;
		double d = 3.3;
		double result = a + d; // �ڵ� ����ȯ int -> double

		System.out.println(result);
		System.out.println(); // ����

		double dValue = 123.5;
		int iValue = (int) dValue;

		System.out.println("dValue : " + dValue);
		System.out.println("iValue : " + iValue); // ������ �ս�
		System.out.println(); // ����

		System.out.println((char) ('1' + '1'));

		int iNum = 2147483647;
		// int sum = iNum + 1;
		long sum = (long) iNum + 1; // ���� ����ȯ
		System.out.println(sum);
		//ctrl + shift + f / ctrl + i : �鿩���� ����
	}

}
