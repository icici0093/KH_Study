package com.kh.operator;

import java.util.Scanner;

public class Exercise_Triple1 {

	public static void main(String[] args) {
		// ���׿����� ��ø ���
		// �Է¹��� ������ ���, 0, �������� �Ǻ� �� ����ϼ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result = num < 0 ? "����" : (num == 0 ? "0" : "���");
		
		System.out.println("����ϱ�? �����ϱ�? ��ü�� ����? : " + result);

	}

}
