package com.kh.operator;

public class Exam_Compound {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a+=20);
		System.out.println(b*=3);
		System.out.println(c/=4);
		System.out.println(a%=b);
		System.out.println(c-=a);

	}

}
