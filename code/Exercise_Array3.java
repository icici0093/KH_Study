package com.kh.array;

import java.util.Scanner;

public class Exercise_Array3 {

	public static void main(String[] args) {
		/*
		 * 사용자에게 주민번호를 입력받은 후 
		 * 성별자리 이후부터 *로 저장되러 출력되도록 
		 * 프로그램을 작성하시오. 
		 * 배열 복사를 이용 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 입력(-포함) : ");
		String str = sc.next();
		
		char [] origin = new char[str.length()];
		for(int i = 0; i < origin.length; i++) {
			// 입력받은 주민번호를 하나씩 잘라서 origin배열에 저장 
			origin[i] = str.charAt(i); 
		}
		char [] copy = new char[origin.length];
		for(int i = 0; i < copy.length; i++) {
			//i가 7일때까지 복사 
			if(i <= 7) {
				copy[i] = origin[i];
			}else {
				copy[i] = '*';
			}
		}
		//출력 
		for(char ch : copy) {
			System.out.print(ch);
		}
	}

}
