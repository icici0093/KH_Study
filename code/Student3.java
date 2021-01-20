package org.kh.oop;

public abstract class Student3 {
	// 추상메소드를 포함하는 클래스 -> 추상클래스 
	// abstract 키워드로 추상클래스 만들기 
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	// 기본 생성자 (매개변수 있는 생성자를 만들었을 경우 꼭 필요!!)
	public Student3() {}
	// 매개변수 있는 생성자 
	public Student3(String name, int kor, int eng, int math) {
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
	abstract public int total(); // 몸체 없는 메소드 ({} <- X)
	abstract public double avg();
	
	@Override
	public String toString() {
		return "name : " + this.name + "kor : " + this.kor + "eng : " + this.eng + "math : " + this.math;
	}
}
