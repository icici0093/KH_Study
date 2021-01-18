package net.kh.member.controller;

import org.kh.oop.Student;

public class Run {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("홍길동");
		student.setKor(100);
		student.setEng(100);
		student.setMath(100);
		System.out.println(student.getName() + " " +
				student.getKor() + " " + student.getEng() + " " 
				+ student.getMath());
		
		Student student2 = new Student("홍길동",100,100,100);
		System.out.println(student2.getName() + " " +
				student2.getKor() + " " + student2.getEng() + " " 
				+ student2.getMath());
	}
}
