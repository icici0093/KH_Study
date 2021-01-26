package com.kh.exception;

public class Exam_Exception4 {
	public static void main(String[] args) {
	// NumberFormatException
	// 정수가 아닌 문자열을 정수로 변환할 때 예외 발생 
	// "1234" -> Integer.parseInt("1234") => 1234
	// "3.14" -> Integer.parseInt("3.14") => NumberFormatException
	
		String [] strNumber = {"23", "12", "3.14", "998"};
		int i = 0;
		try {
			for(i = 0; i < strNumber.length; i++) {
				int parseNum = Integer.parseInt(strNumber[i]);
				System.out.println("숫자로 변환된 값은 : " + parseNum);
			}
		} catch (NumberFormatException ex) {
			System.out.println(strNumber[i] + "는 정수로 변환할 수 없습니다.");
		}
	}
}