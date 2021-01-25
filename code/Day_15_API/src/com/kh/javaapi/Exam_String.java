package com.kh.javaapi;

public class Exam_String {

	public static void main(String[] args) {
		// String 클래스의 주요 메소드 
		String str = new String("hello");
		String str1 = "Hello";
		// concat, trim, chatAt, split, substring, replace, length
		// toLowerCase, toUpperCase
		
		String data1 = new String(" C#");
		String data2 = new String(",C++ ");
		
		System.out.println(data1 + "의 길이는 " + data1.length());
		System.out.println(data1.contains("#")); // 문자열에 #을 포함하고 있냐!
		
		data1 = data1.concat(data2);
		System.out.println("연결된 문자열 : " + data1);
		
		data1 = data1.trim(); // 문자열 앞 뒤의 공백 제거
		System.out.println("공백 제거 확인 : " + data1);
		
		data1 = data1.replace("C#", "JAVA"); // 문자열 교체
		System.out.println("문자열 대치 : " + data1);
		
		String [] strs = data1.split(",");
		for(int i = 0; i < strs.length; i++) {
			System.out.println("분리된 문자열" + i + " : " + strs[i]);
		}
		data1 = data1.substring(5); // 시작인덱스(포함)부터 끝까지 스트링 리턴 
		System.out.println(data1);
		
		char c = data1.charAt(2); // 인덱스 2의 문자 리턴 
		System.out.println(c);
	}

}
