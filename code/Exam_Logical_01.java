package com.kh.operator;

public class Exam_Logical_01 {

	public static void main(String[] args) {
		/*
		 * �������� : ���� �ΰ��� ���ϴ� ������
		 * AND : &&, (~�̰�, ~�鼭, �׸���)
		 * OR : ||, (~�̰ų�, �Ǵ�)
		 */
		
		//50, 30�� �Է¹޾� ������ ���� ���� �ۼ��Ͽ��� �� ������� �������
		//a!=b && a<b
		//a<b || a==b
		//a>b && a!=b
		//a>b || a==b
		
		int a = 50;
		int b = 30;
		
		boolean result1, result2, result3, result4;
		
		result1 = (a!=b) && (a<b);
		result2 = (a<b) || (a==b);
		result3 = (a>b) && (a!=b);
		result4 = (a>b) || (a==b);
		
		System.out.println("result1�� �� : " + result1);
		System.out.println("result2�� �� : " + result2);
		System.out.println("result3�� �� : " + result3);
		System.out.println("result4�� �� : " + result4);
		
		// 70, 55�� a,b�� �Է¹޾� ������ ���� ���� �ۼ��Ͽ��� �� ������� ����غ���
		// a == b || a++ < 100
		// a < b && --b < 55
		// a != b && b-- < a++
		// a++ != b || b++ >= 85
		// a = ?
		// b = ?
		
		int aNum = 70;
		int bNum = 55;
		
		boolean  resultOne, resultTwo, resultThree, resultFour;
		resultOne = (aNum == bNum) || (aNum++ < 100);
		resultTwo = (aNum < bNum) && (--bNum < 55);
		resultThree = (aNum != bNum) && (bNum-- < aNum++);
		resultFour = (aNum++ != bNum) || (bNum++ >= 85);
		
		System.out.println("resultOne�� �� : " + resultOne); // a=71, b=55
		System.out.println("resultTwo�� �� : " + resultTwo); // a=71, b=55
		System.out.println("resultThree�� �� : " + resultThree); // a=72, b=54 
		System.out.println("resultFour�� �� : " + resultFour); // a=73, b=54
		System.out.println(aNum);
		System.out.println(bNum);
	}

}
