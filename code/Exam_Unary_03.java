package com.kh.operator;

public class Exam_Unary_03 {

	public static void main(String[] args) {
		int x = 100;
		int y = 33;
		int z = 0;
		
		x--;
		z = x-- + --y;
		x = 99 + x++ + x; //���� �������� �켱������ ��Ģ���꺸�� ���� ( 99 + 98 + 99 )
		y = y-- + y + ++y;
	
		System.out.println("x�� �� : " + x);
		System.out.println("y�� �� : " + y);
		System.out.println("z�� �� : " + z);
	}

}
