package com.kh.operator;

public class Exam_Logical_01 {

	public static void main(String[] args) {
		/*
		 * 논리연산자 : 논리값 두개를 비교하는 연산자
		 * AND : &&, (~이고, ~면서, 그리고)
		 * OR : ||, (~이거나, 또는)
		 */
		
		//50, 30을 입력받아 다음과 같은 식을 작성하였을 때 결과값을 출력하자
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
		
		System.out.println("result1의 값 : " + result1);
		System.out.println("result2의 값 : " + result2);
		System.out.println("result3의 값 : " + result3);
		System.out.println("result4의 값 : " + result4);
		
		// 70, 55를 a,b로 입력받아 다음과 같은 식을 작성하였을 때 결과값을 출력해보자
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
		
		System.out.println("resultOne의 값 : " + resultOne); // a=71, b=55
		System.out.println("resultTwo의 값 : " + resultTwo); // a=71, b=55
		System.out.println("resultThree의 값 : " + resultThree); // a=72, b=54 
		System.out.println("resultFour의 값 : " + resultFour); // a=73, b=54
		System.out.println(aNum);
		System.out.println(bNum);
	}

}
