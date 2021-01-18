package org.kh.oop;

import java.util.Scanner;

public class StudentList {
	Student [] scores;
	
	public StudentList() {
		scores = new Student[3];
	}
	public int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= 학생 성적 관리 프로그램 =======");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void insertScore() {
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < scores.length; i++) {
			scores[i] = new Student();
			System.out.println((i+1) + "번째 학생 정보 입력");
			System.out.print("학생 이름 입력 : ");
			String studentName = sc.next();
			scores[i].setName(studentName);
			System.out.print("국어 점수 입력 : ");
			scores[i].setKor(sc.nextInt());
			System.out.print("영어 점수 입력 : ");
			scores[i].setEng(sc.nextInt());
			System.out.print("수학 점수 입력 : ");
			scores[i].setMath(sc.nextInt());
		}
	}
	public void printScore() {
		System.out.println("<<입력한 학생들의 성적>>");
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i].getName() + "학생의 성적");
			System.out.println("국어 점수 : " + scores[i].getKor());
			System.out.println("영어 점수 : " + scores[i].getEng());
			System.out.println("수학 점수 : " + scores[i].getMath());
			System.out.println("=================");
		}
	}
	
}
