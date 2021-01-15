package com.kh.student;

import java.util.Scanner;

public class StudentProgram {
//	static int [] scores = new int [3]; // 전역변수 
	public static void main(String[] args) {
		int [] scores = new int [3];
		종료 :
		while(true) {
			//F3 or command + click
		int choice = showMenu();
		
		switch(choice) {
		case 1 : 
			insertScore(scores);
			break;
		case 2 :
			printScore(scores);
			break;
		case 3 : 
			break 종료;
		default : System.out.println("잘못 입력하셨습니다.");
			break;
		}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	static int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= 학생 성적 관리 프로그램 =======");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	static void insertScore(int [] scores) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++) {
			do {
				System.out.print((i+1) + "번째 학생의 성적 : ");
				scores[i] = sc.nextInt();
				if(scores[i] < 0 || scores[i] > 100) {
					System.out.println("입력 범위를 벗어났습니다.");
				}
			}while(scores[i] < 0 || scores[i] > 100);
		}
	}
	static void printScore(int [] scores) {
		int sum = 0;
		System.out.println("<<입력한 학생들의 성적>>");
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "번째 학생의 성적 : " + scores[i]);
			sum += scores[i];
		}
		System.out.println("학생들 성적의 합 : " + sum);
		System.out.println("학생들 성적의 평균 : " + (double)(sum/scores.length));
		sum = 0; // 다시 입력했을 때 성적이 누적되지 않도록 함 
	}
}
