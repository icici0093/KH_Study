package com.kh.javaapi;

public class Exam_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		// 문자열을 연결해주는 클래스
		// KH     ,       KH Class  ,    Interesting
		//Hello ,         ,   Java 
		sb.append("Hello");
		sb.append(" ");
		sb.append("Java");
		
		System.out.println(sb.toString());
		
		StringBuffer stb = new StringBuffer().append("KH").append(" Java Class").append(" Interesting");
		stb.delete(2, 7);
		System.out.println(stb.toString());
		
		StringBuilder stbld = new StringBuilder().append("KH").append(" Java").append(" Good");
		System.out.println(stbld.toString());
	}

}
