package com.kh.control;

import java.util.Scanner;

public class Exercise_If3 {

	public static void main(String[] args) {
		/*  �߰����, �⸻���, ��������, �⼮ȸ���� �Է��ϰ� 
		 *  Pass �Ǵ� Fail�� ����ϼ���.
		 *  �� ������ �߰���� 20%, �⸻��� 30%, ���� 30%, 
		 *  �⼮ 100%�� �̷���� �ְ� 
		 *  �� ��, �⼮ ������ �⼮ ȸ���� �� ���� ȸ�� 20ȸ �߿��� 
		 *  �⼮�� ���� ���� ������ ����ϼ���. 
		 *  70�� �̻��� ��� Pass, 70�� �̸��̰ų� 
		 *  ��ü ���ǿ� 30% �̻� �Ἦ �� Fail�� ����ϼ���.
		 *  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰���� ���� �Է� : ");
		int mid = sc.nextInt();
		System.out.print("�⸻��� ���� �Է� : ");
		int fin = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int rep = sc.nextInt();
		System.out.print("�⼮ Ƚ�� �Է� : ");
		int att = sc.nextInt();
		
		double midTerm = mid * 0.2;
		double finTerm = fin * 0.3;
		double repTerm = rep * 0.3;
		double result = midTerm + finTerm + repTerm + att;
		
		if ( result >= 70 && att > 20 * 0.7 ) {
			System.out.println("PASS!");
			System.out.println("�� ���� : " + result);
			System.out.println("�⼮Ƚ�� : " + att);
		}else {
			if ( result >= 70 ) {
				System.out.println("FAIL [�⼮ Ƚ�� ����] (" + att + " / 20)");
			}else if( att > 20 * 0.7 ) {
				System.out.println("FAIL [���� �̴�] (" + result + ")");
			}else {
				System.out.println("FAIL [�⼮ Ƚ�� ����] (" + att + " / 20)");
				System.out.println("FAIL [���� �̴�] (" + result + ")");
			}
		} 

	}

}
