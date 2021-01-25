package com.kh.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {

	public static void main(String[] args) {
		// StringTokenizer
		// AA,BB,CC -> AA
		//	                -> BB
		//					-> CC
		String str = "AA,BB,CC";
		
		StringTokenizer strTk = new StringTokenizer(str, ",");
		for(int i = 0; strTk.hasMoreTokens(); i++) {
			System.out.println((i+1) + "번째 값 : " + strTk.nextToken());
		}
		System.out.println("=====================");
		// 중간에 있는 값을 인덱스를 이용해 가져오는 방법 
		// String 클래스 split 메소드 이용 
		String [] strs = str.split(","); // { AA,BB,CC }
//		System.out.println(strs[1]);
		for(int i = 0; i < strs.length; i++) {
			System.out.println((i+1) + "번째 값 : " + strs[i]);
		}
	}

}
