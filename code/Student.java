package org.kh.oop;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	// 기본 생성자 (매개변수 있는 생성자를 만들었을 경우 꼭 필요!!)
	public Student() {}
	// 매개변수 있는 생성자 
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// getter 메소드 - 필드에 저장된 값 로드 
	public String getName() {
		return name;
	}
	// setter 메소드 - 필드에 값 저장
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
}
