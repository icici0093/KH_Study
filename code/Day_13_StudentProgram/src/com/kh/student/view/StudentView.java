package com.kh.student.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.student.controller.StudentController;
import com.kh.student.model.vo.Student;

public class StudentView {
	
	private StudentController stdController;
	
	public void StudentView() {
		stdController = new StudentController();
	}
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 학생 성적 관리 프로그램 ========");
		System.out.println("1. 학생 전체 정보 출력");
		System.out.println("2. 학생 정보 조회(학번)");
		System.out.println("3. 학생 정보 입력");
		System.out.println("4. 학생 정보 변경");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("9. 프로그램 종료");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		return num; 
	}
	
	public void insertStudent() {
		Scanner sc = new Scanner(System.in);
		Student stdOne = new Student(); // 임시 저장소
		
		System.out.print("학번 : ");
		int classNumber = sc.nextInt();
		stdOne.setClassNumber(classNumber);
		System.out.print("이름 : ");
		String name = sc.next();
		stdOne.setName(name);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		stdOne.setAge(age);
		sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		stdOne.setAddress(address);
		System.out.print("학점 : ");
		double grade = sc.nextDouble();
		stdOne.setGrade(grade);
		stdController.addStudent(stdOne);
	}
	
	public void printAll() {
		ArrayList<Student> studentList = stdController.selectAll();
		for(int i = 0; i < studentList.size(); i++) {
			Student std = studentList.get(i);
			System.out.println("이름 : " + std.getName() + ", 나이 : " +
			std.getAge() + ", 주소 : " + std.getAddress()
			+ ", 학번 : " + std.getClassNumber() + ", 학점 : " + std.getGrade());
		}
	}
}
