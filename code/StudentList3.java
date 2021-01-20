package org.kh.oop;

// 사용하지 않는 import 없애기
// 또는 자동 import하기 -> command + shift + o
public class StudentList3 {
	private Student3 [] scores;
	
	public StudentList3() {
		scores = new Student3[3];
	}
	
	public void setStudents(Student3 [] scores) {
		this.scores = scores;
	}
	
	public Student3 [] getStudents() {
		return scores;
	}
}
