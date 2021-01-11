package com.kh.control;

public class Exercise_For3 {

	public static void main(String[] args) {
		// 반복문은 반복되는 일을 해주는 코드
		// 1+2+3+4+5+6+7+8+9+10 
		// 1씩 증가, 더하기 => 반복 
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			//더하기 
			sum = sum + i;
			// 0 + 0 => 0
			// 0 + 1 => 1
			// 1 + 2 => 3
			// 3 + 3 => 6
			// 6 + 4 => 10
			// 10 + 5 => 15 => 1+2+3+4+5
		}
		System.out.println("합계 : " + sum);
		System.out.println();
		
		//1+2+3+4+5+6+7+8+9+10=55
		// 1부터 10까지 덧셈을 표시하고 합도 구하시오
		int result = 0;
		for(int j = 1; j <= 10; j++) {
			result = result + j;
			 System.out.print(j);
			 if ( j <= 9) {
				 System.out.print("+");
			 }else {
				 System.out.print("=");
				 System.out.print(result);
			 }
		}
	}

}
