package com.kh;

public class Exercise_01 {

	/* �� �ڷ����� ������ ����� �ʱ�ȭ�� �� �� ����
	 * ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
 	 * ��, ������ �̿��Ͽ� ����Ͻÿ�.
	 * ������ 100, 9999��
	 * �Ǽ� 486.520(float), 567.890123
	 * ���� A
	 * ���ڿ� Hello world
	 * �� true 
	 */
	
	public static void main(String[] args) {
		
		int iNum = 100;
		long lNum = 999900000000l;
		float fNum = 486.520f;
		double dNum = 567.890123;
		char ch = 'A';
		String str = "Hello world";
		boolean bool = true;
		
		System.out.println("���� : " + iNum);
		System.out.println("����(long) : " + lNum);
		System.out.println("�Ǽ�(float) : " +fNum);
		System.out.println("�Ǽ� : " + dNum);
		System.out.println("���� : " + ch);
		System.out.println("���ڿ� : " + str);
		System.out.println("�� : " + bool);
	}
}
