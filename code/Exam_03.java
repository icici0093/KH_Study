package com.kh;

public class Exam_03 {
	public static void main(String[] args) {
		System.out.println(1 + 1); //2
		System.out.println(1.1 + 1.1); //2.2
		System.out.println('1' + '1'); //98, '1' => 49
		System.out.println("1" + "1"); // 11
		
		System.out.println("Hello" + 'q'); //Helloq
		System.out.println("Hello" + 3.14); //Hello3.14
		
		//문자열을 만나면 숫자도 문자열이 됨
		System.out.println(10 + 20 + "Hello"); //30Hello
		System.out.println(10 + "Hello" + 20); //10Hello20
		System.out.println("Hello" + 10); //Hello10
		System.out.println(10 + "Hello"); //10Hello
		System.out.println(10 + (20 + "Hello")); //1020Hello 
	}
}
