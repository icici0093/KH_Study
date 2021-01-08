package com.kh.control;

import java.util.Scanner;

public class Exercise_If3 {

	public static void main(String[] args) {
		/*  중간고사, 기말고사, 과제점수, 출석회수를 입력하고 
		 *  Pass 또는 Fail을 출력하세요.
		 *  평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 
		 *  출석 100%로 이루어져 있고 
		 *  이 때, 출석 비율은 출석 회수는 총 강의 회수 20회 중에서 
		 *  출석한 날만 따진 값으로 계산하세요. 
		 *  70점 이상일 경우 Pass, 70점 미만이거나 
		 *  전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		 *  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간고사 점수 입력 : ");
		int mid = sc.nextInt();
		System.out.print("기말고사 점수 입력 : ");
		int fin = sc.nextInt();
		System.out.print("과제 점수 입력 : ");
		int rep = sc.nextInt();
		System.out.print("출석 횟수 입력 : ");
		int att = sc.nextInt();
		
		double midTerm = mid * 0.2;
		double finTerm = fin * 0.3;
		double repTerm = rep * 0.3;
		double result = midTerm + finTerm + repTerm + att;
		
		if ( result >= 70 && att > 20 * 0.7 ) {
			System.out.println("PASS!");
			System.out.println("총 점수 : " + result);
			System.out.println("출석횟수 : " + att);
		}else {
			if ( result >= 70 ) {
				System.out.println("FAIL [출석 횟수 부족] (" + att + " / 20)");
			}else if( att > 20 * 0.7 ) {
				System.out.println("FAIL [점수 미달] (" + result + ")");
			}else {
				System.out.println("FAIL [출석 횟수 부족] (" + att + " / 20)");
				System.out.println("FAIL [점수 미달] (" + result + ")");
			}
		} 

	}

}
