package com.kh.control;

import java.util.Scanner;

public class Exercise_If2 {
	public static void main(String[] args) {
		/*
		 * 1. �Է�
		 * 2. ����
		 * 3. ��ȸ
		 * 4. ����
		 * 7. ����
		 * �޴� ��ȣ�� �Է��ϼ��� : 3
		 * ��ȸ�޴��Դϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if( num == 1 ) {
			System.out.println("��ȸ�޴��Դϴ�.");
		} else if( num == 2 ) {
			System.out.println("�����޴��Դϴ�.");
		} else if( num == 3 ) {
			System.out.println("��ȸ�޴��Դϴ�.");
		} else if( num == 4 ) {
			System.out.println("�����޴��Դϴ�.");
		} else if( num == 7 ) {
			System.out.println("���α׷��� ����˴ϴ�.");
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");			
		}
	}
}
