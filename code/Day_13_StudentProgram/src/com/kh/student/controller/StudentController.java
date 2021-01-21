package com.kh.student.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.student.model.vo.Student;

public class StudentController {
	private List<Student> stdList; // 최종 저장소
	
	public StudentController() {
		stdList = new ArrayList<Student>();
	}
	public void addStudent(Student student) {
		stdList.add(student);
		
//		this.stdList = student;
//		nums[0] = 1;
//		nums.add(1);
	}
	public ArrayList<Student> selectAll(){
		return (ArrayList<Student>)stdList; // 형변환
	}
}
