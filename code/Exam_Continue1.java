package com.kh.control;

public class Exam_Continue1 {

	public static void main(String[] args) {
		/*
		 * continue는 반복문 안에서 사용 가능하며 
		 * continue를 만나게 되면 다음의 내용을 실행하지 않고 
		 * 바로 증감식 또는 다음 값으로 건너뛰라는 의미
		 * ex) 1 ~ 10 사이의 수중 3의 배수를 제외하고 출력하시오. 
		 */
		
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0)
				continue;
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println();
		/*
		 * 1부터 100까지 정수들의 합을 출력하는데 
		 * 4의 배수는 빼고 출력하시오 
		 */
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 4 == 0)
				continue;
			sum += i;
		}
		System.out.println("합 : "  + sum);
		
		System.out.println();
		
		/*
		 * 2~9단까지 구구단을 출력하는데 짝수단은 빼고 출력 
		 * 3단 옆에 5단 
		 */
		int num = 0;
		int dan = 0;
		for(num = 1; num < 10; num++) {
			for(dan = 2; dan < 10; dan ++) {
				if(dan % 2 == 0)
					continue;
				System.out.printf("%d * %d = %2d      ", dan, num, (dan*num));
			}
			System.out.println();
		}
		
	}

}
