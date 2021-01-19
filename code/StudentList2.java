package org.kh.oop;

// 사용하지 않는 import 없애기
// 또는 자동 import하기 -> command + shift + o
public class StudentList2 {
	private Student2 [] scores;
	
	public StudentList2() {
		scores = new Student2[3];
	}
	
	public void setStudents(Student2 [] scores) {
		this.scores = scores;
	}
	
	public Student2 [] getStudents() {
		return scores;
	}
}
