package com.kh.control;

import java.util.Scanner;

public class Exam_If1 {

	public static void main(String[] args) {
		// �Է¹��� ���, 0, �������� �Ǻ��Ͽ� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� : ");
		int num = sc.nextInt();
		
//		if( num > 0 ) {
//			System.out.println("����Դϴ�.");
//		}
//		if( num == 0 ) {
//			System.out.println("0�Դϴ�.");
//		}
//		if( num < 0 ) {
//			System.out.println("�����Դϴ�.");
//		}
//		if( num > 0 ) {
//			System.out.println("����Դϴ�.");
//		}else {
//			System.out.println("0�̰ų� �����Դϴ�.");
//		}
		if( num > 0 ) {
			System.out.println("����Դϴ�.");
		}else if( num == 0) {
			System.out.println("0�Դϴ�.");
		}else {
			System.out.println("�����Դϴ�.");
		}
		/*
		 * ���ǽ��� ������� true�� �߰�ȣ({})���� �ڵ带 ����
		 * ���ǽ��� ������� false�� �ڵ带 �����ϰ� �Ѿ
		 */
	}

}
