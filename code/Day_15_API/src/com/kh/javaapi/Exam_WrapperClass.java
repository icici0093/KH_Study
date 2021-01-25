package com.kh.javaapi;

public class Exam_WrapperClass {

	public static void main(String[] args) {
		// Wrapper Class란 기본 자료형을 객체화 해주는 클래스 
		// int, double, short -> 객체 X!!
		// 객체가 되지 않는 기본 자료형을 대신해 사용되는 클래스 
		
		int num = 3;
		Integer num2 = new Integer(3);
		Integer num3 = Integer.valueOf(3);
		
		Long lNum = new Long(21);
		Long lNum2 = Long.valueOf(21);
		
		Double dNum = new Double(2.1);
		Double dNum2 = Double.valueOf(2.1);
		
		Float fNum = new Float(2.3f);
		Float fNum2 = Float.valueOf(2.3f);
		
		// Wrapper 클래스 형변환 !
		Integer iNum = 22;
		// 기본형인 22가 Integer 클래스의 객체로 형변환이 일어남 
		// 오토박싱(auto-boxing)
//		int iNum2 = num2;  iNum2 <- 기본형, num2 <- 객체
		int iNum2 = num2.intValue();
		// Integer 클래스의 객체 값을 기본형으로 가져옴 
		// 오토언박싱(auto-unboxing)
		
		// 간단 예제  
		int n = 10;
		Integer intObject = n; // 오토박싱, Integer 클래스 객체로 형변환이 일어남 
		
		int m = intObject +10; // intObject.intValue() => 10, 오토언박싱으로 intValue() 생략가능
		System.out.println("m = " + m);
		
		System.out.println("=================");
		
		String strNum = "210104";
		int calcNum = Integer.parseInt(strNum);
		int calcNum2 = Integer.valueOf(strNum);
		// Integer.parseInt()의 결과값은 정수 
		// Integer.valueOf()의 결과값은 Integer 객체
		
		System.out.println(strNum + 12); // 21010412
		System.out.println(calcNum + 12); // 210116
		
		System.out.println(calcNum2 + 12); // 210116
	}

}
