package com.kh.operator;

import java.util.Scanner;

public class Exam_Triple {
	public static void main(String[] args) {
		/*
		 * ���׿�����
		 * �׸��� 3��
		 * (���ǽ�) ? �� : ����
		 * - ���ǽ��� �ݵ�� true or false�� ������ �ۼ�
		 * - ��/�������� �ַ� ���
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result = (num%2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(num + "��/�� " + result + "��.");
		
		// ���׿����ڷ� val���� ������� �������� �Ǻ� �� ���
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int val = sc.nextInt();
	
		String str = (val > 0) ? "���" : "����";
		System.out.println(val + "��/�� " + str + "��.");		
	}
}
