package com.kh.operator;

import java.util.Scanner;

public class Exercise_Triple2 {

	public static void main(String[] args) {
		// ���׿����� ��ø ���
		// �� ���� '+' �Ǵ� '-'�� �Է¹޾� �˸��� ��� ��� ����ϱ�
		// ��, '+', '-' �̿��� ������ �Է½� "�߸��Է��ϼ̽��ϴ�!" ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù���� ���� �Է��ϼ��� : ");
		int first = sc.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		int second = sc.nextInt();
		
		System.out.print("�����ڸ� �Է��ϼ��� : ");
		char op = sc.next().charAt(0);
		
		String result = op == '+' ? first + second + "" : (ch == '-'? first-second + "" : "�߸��Է��ϼ̽��ϴ�!");
		
		System.out.println("��� ��� : " + result);

	}

}
